/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades.abstracts;

import clases.entidades.Grupo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author indira
 */
public abstract class AbstractGrupos<T extends SelectGrupos> extends SelectGrupos<T> {

    @Override
    public Collection<Grupo> getGrupos() {
        Collection<Grupo> grupos = new ArrayList<Grupo>();
        for (Map.Entry<T, T> entry : selectables.entrySet()) {
            T t = entry.getValue();
            if (t.isSelected()) {
              grupos.addAll(t.getGrupos());
            }
        }
        return grupos;
    }
}
