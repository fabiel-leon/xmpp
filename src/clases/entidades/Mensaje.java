/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades;

import clases.entidades.interfaces.Receiver;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author indira
 */
public class Mensaje {

    //  static private int idMensajeStatico;
    //   int idMensaje;
    String asunto;
    String mensaje;
    Map<Receiver, Integer> receptores;
    long snapTime = 300000; //cada 5 minutos 
    int sendsPerTime = 1;
    int enviado = 0;//cantidad de veces enviados a los receptores

    /**
     *
     * @param asunto
     * @param mensaje
     * @param receptores
     * @param snapTime
     */
    public Mensaje(String asunto, String mensaje, Collection<? extends Receiver> receptores, long snapTime) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.snapTime = snapTime;
        this.receptores = new HashMap<Receiver, Integer>();
        for (Receiver receivers : receptores) {
            this.receptores.put(receivers, new Integer(0));
        }
    }

    public Mensaje() {
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Map<Receiver, Integer> getReceptores() {
        return receptores;
    }

    public void setReceptores(Map<Receiver, Integer> receptores) {
        this.receptores = receptores;
    }

    public long getSnapTime() {
        return snapTime;
    }

    public void setSnapTime(long snapTime) {
        this.snapTime = snapTime;
    }

    public int getSendsPerTime() {
        return sendsPerTime;
    }

    public void setSendsPerTime(int sendsPerTime) {
        this.sendsPerTime = sendsPerTime;
    }

    public int getEnviado() {
        return enviado;
    }

    public void setEnviado(int enviado) {
        this.enviado = enviado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.asunto != null ? this.asunto.hashCode() : 0);
        hash = 67 * hash + (this.mensaje != null ? this.mensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensaje other = (Mensaje) obj;
        if ((this.asunto == null) ? (other.asunto != null) : !this.asunto.equals(other.asunto)) {
            return false;
        }
        if ((this.mensaje == null) ? (other.mensaje != null) : !this.mensaje.equals(other.mensaje)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return asunto; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
