/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades.abstracts;

import clases.entidades.Grupo;
import clases.entidades.interfaces.Grupos;
import java.util.Collection;

/**
 *
 * @author indira
 */
public abstract class SelectGrupos<T extends SelecContainer> extends SelecContainer<T> implements Grupos {

    @Override
    public abstract Collection<Grupo> getGrupos();
}
