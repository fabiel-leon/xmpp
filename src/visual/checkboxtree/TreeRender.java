/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.checkboxtree;

import clases.entidades.Grupo;
import clases.entidades.UniversidadUCI;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

/**
 *
 * @author indira
 */
public class TreeRender extends JCheckBox implements TreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Object userObject = ((DefaultMutableTreeNode) value).getUserObject();
        if (userObject instanceof Grupo) {
            
        }
        setText(userObject.toString());
        return this;
    }
}
