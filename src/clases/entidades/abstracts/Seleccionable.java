/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades.abstracts;

import clases.entidades.interfaces.Selectable;

/**
 *
 * @author indira
 */
public abstract class Seleccionable implements Selectable {

    boolean selected;

    @Override
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
