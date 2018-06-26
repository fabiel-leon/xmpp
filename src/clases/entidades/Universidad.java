/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades;

import clases.entidades.abstracts.AbstractGrupos;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indira
 */
public class Universidad extends AbstractGrupos<Area> implements Serializable, Cloneable {

    public Universidad() {

        try { // This code block invokes the Ws_pregradoPort:obtenerEstudiantes operation on web service
            wspregrado.PregradoService pregradoService = new wspregrado.PregradoService_Impl();
            wspregrado.Ws_pregradoPortType _ws_pregradoPort = pregradoService.getWs_pregradoPort();
            Estudiante[] obtenerEstudiantes = _ws_pregradoPort.obtenerEstudiantes(/* TODO enter operation arguments*/);

            Map<String, String> ap = new HashMap<String, String>();
            Map<String, String> nombres = new HashMap<String, String>();
            Map<String, String> sexo = new HashMap<String, String>();
            Map<Municipio, Municipio> municipios = new HashMap<Municipio, Municipio>();
            Map<Estado, Estado> estados = new HashMap<Estado, Estado>();
            Map<CategoriaPersona, CategoriaPersona> categorias = new HashMap<CategoriaPersona, CategoriaPersona>();

            for (Estudiante e : obtenerEstudiantes) {
//ordenacion
                if (!containsKey(e.getArea())) {
                    put(e.getArea());
                } else {
                    e.setArea(get(e.getArea()));
                }
                Area a = e.getArea();
                if (!a.containsKey(e.getNivel())) {
                    a.put(e.getNivel());
                } else {
                    e.setNivel(a.get(e.getNivel()));
                }
                Nivel n = e.getNivel();
                if (!n.containsKey(e.getGrupo())) {
                    n.put(e.getGrupo());
                } else {
                    e.setGrupo(n.get(e.getGrupo()));
                }
                Grupo grupo = e.getGrupo();
                grupo.put(e);
//compresion
                if (!sexo.containsKey(e.getGenero())) {
                    sexo.put(e.getGenero(), e.getGenero());
                } else {
                    e.setGenero(sexo.get(e.getGenero()));
                }
                if (!ap.containsKey(e.getPrimerApellido())) {
                    ap.put(e.getPrimerApellido(), e.getPrimerApellido());
                } else {
                    e.setPrimerApellido(ap.get(e.getPrimerApellido()));
                }
                if (!ap.containsKey(e.getSegundoApellido())) {
                    ap.put(e.getSegundoApellido(), e.getSegundoApellido());
                } else {
                    e.setSegundoApellido(ap.get(e.getSegundoApellido()));
                }
                if (!nombres.containsKey(e.getPrimerNombre())) {
                    nombres.put(e.getPrimerNombre(), e.getPrimerNombre());
                } else {
                    e.setPrimerNombre(nombres.get(e.getPrimerNombre()));
                }
                if (!nombres.containsKey(e.getSegundoNombre())) {
                    nombres.put(e.getSegundoNombre(), e.getSegundoNombre());
                } else {
                    e.setSegundoNombre(nombres.get(e.getSegundoNombre()));
                }
                if (!municipios.containsKey(e.getMunicipio())) {
                    municipios.put(e.getMunicipio(), e.getMunicipio());
                } else {
                    e.setMunicipio(municipios.get(e.getMunicipio()));
                }
                if (!estados.containsKey(e.getEstado())) {
                    estados.put(e.getEstado(), e.getEstado());
                } else {
                    e.setEstado(estados.get(e.getEstado()));
                }
                if (!categorias.containsKey(e.getCategoriaPersona())) {
                    categorias.put(e.getCategoriaPersona(), e.getCategoriaPersona());
                } else {
                    e.setCategoriaPersona(categorias.get(e.getCategoriaPersona()));
                }

            }
        } catch (javax.xml.rpc.ServiceException ex) {
            java.util.logging.Logger.getLogger(wspregrado.PregradoService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.rmi.RemoteException ex) {
            java.util.logging.Logger.getLogger(wspregrado.PregradoService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(wspregrado.PregradoService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "Universidad";
    }

   

    @Override
    protected Universidad clone() {
        Object clone = null;
        try {
            clone = super.clone(); //To change body of generated methods, choose Tools | Templates.
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Universidad) clone;
    }
}
