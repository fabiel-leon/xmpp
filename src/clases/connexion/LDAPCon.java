/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.connexion;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/**
 *
 * @author indira
 */
public class LDAPCon {

    private InitialDirContext ctx;

    private LDAPCon() {
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://ldap.estudiantes.uci.cu:389");
        env.put(Context.SECURITY_AUTHENTICATION, "none");
        env.put("java.naming.ldap.version", "3");
        try {
            ctx = new InitialDirContext(env);
        } catch (NamingException ex) {
            Logger.getLogger(LDAPCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUID(String cn) throws NamingException {
        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        NamingEnumeration<SearchResult> ne = ctx.search("DC=uci,DC=cu", "(cn=" + cn + ")", searchControls);
        SearchResult sr;
        while (ne.hasMore()) {
            sr = (SearchResult) ne.next();
            Attribute get = sr.getAttributes().get("uid");
            return (String) get.get();
        }
        return null;
    }

    public static LDAPCon getInstance() {
        return LDAPConHolder.INSTANCE;
    }

    private static class LDAPConHolder {

        private static final LDAPCon INSTANCE = new LDAPCon();
    }
}
