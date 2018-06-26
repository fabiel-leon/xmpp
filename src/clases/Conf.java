/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 * se puede cambiar por ConnectionConfiguration
 *
 * @author fabiel
 */
public class Conf implements Serializable {
    //se puede cambiar por ConnectionConfiguration

    String usuario;
    String servidor;
    int puerto;
    boolean mensaje;

    public Conf() {
        puerto = 5222;
        mensaje=false;
    }

    public boolean isMensaje() {
        return mensaje;
    }

    public void setMensaje(boolean mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}
