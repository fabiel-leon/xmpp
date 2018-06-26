/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades.abstracts;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author indira
 */
public abstract class SelecContainer<T extends Seleccionable> extends Seleccionable {

    Map<T, T> selectables = new HashMap<T, T>();

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected); //To change body of generated methods, choose Tools | Templates.
        for (Map.Entry<T, T> entry : selectables.entrySet()) {
            //   T t = entry.getKey();
            entry.getValue().setSelected(selected);
        }
    }

    public boolean containsKey(T key) {
        return selectables.containsKey(key);
    }

    public T get(T key) {
        return selectables.get(key);
    }

    public T put(T key) {
        return selectables.put(key, key);
    }

    public Map<T, T> getSelectables() {
        return selectables;
    }
}
