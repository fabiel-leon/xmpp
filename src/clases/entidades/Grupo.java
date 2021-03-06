// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3
package clases.entidades;

import clases.entidades.abstracts.SelecContainer;

public class Grupo extends SelecContainer<Estudiante> {

    protected java.lang.String idGrupo;
    protected java.lang.String nombreGrupo;
//    private Collection<Estudiante> estudiantes = new ArrayList<Estudiante>();
//    boolean cargado = false;

    public Grupo() {
    }

    public Grupo(java.lang.String idGrupo, java.lang.String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }

    public java.lang.String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(java.lang.String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public java.lang.String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(java.lang.String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @Override
    public String toString() {
        return nombreGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.idGrupo != null ? this.idGrupo.hashCode() : 0);
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
        final Grupo other = (Grupo) obj;
        if ((this.idGrupo == null) ? (other.idGrupo != null) : !this.idGrupo.equals(other.idGrupo)) {
            return false;
        }
        return true;
    }
}
