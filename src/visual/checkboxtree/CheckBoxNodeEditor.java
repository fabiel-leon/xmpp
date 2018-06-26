/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.checkboxtree;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;

/**
 *
 * @author indira
 */
public class CheckBoxNodeEditor extends AbstractCellEditor implements TreeCellEditor {

    TreeRender renderer = new TreeRender();
    ChangeEvent changeEvent = null;
    JTree tree;

    public CheckBoxNodeEditor(JTree tree) {
        this.tree = tree;
    }

    @Override
    public Object getCellEditorValue() {
        JCheckBox checkbox = renderer;
        CheckBoxNode checkBoxNode = new CheckBoxNode(checkbox.getText(),
                checkbox.isSelected());
        return checkBoxNode;
    }

    @Override
    public boolean isCellEditable(EventObject event) {
        boolean returnValue = false;
        if (event instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent) event;
            TreePath path = tree.getPathForLocation(mouseEvent.getX(),
                    mouseEvent.getY());
            if (path != null) {
                Object node = path.getLastPathComponent();
                if ((node != null) && (node instanceof DefaultMutableTreeNode)) {
                    DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) node;
                    Object userObject = treeNode.getUserObject();
                    returnValue = ((treeNode.isLeaf()) && (userObject instanceof CheckBoxNode));
                }
            }
        }
        return returnValue;
    }

    @Override
    public Component getTreeCellEditorComponent(JTree tree, Object value,
            boolean selected, boolean expanded, boolean leaf, int row) {

        Component editor = renderer.getTreeCellRendererComponent(tree, value,
                true, expanded, leaf, row, true);

        // editor always selected / focused
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (stopCellEditing()) {
                    fireEditingStopped();
                }
            }
        };
        if (editor instanceof JCheckBox) {
            ((JCheckBox) editor).addItemListener(itemListener);
        }

        return editor;
    }
}

class CheckBoxNode {

    String text;
    boolean selected;

    public CheckBoxNode(String text, boolean selected) {
        this.text = text;
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean newValue) {
        selected = newValue;
    }

    public String getText() {
        return text;
    }

    public void setText(String newValue) {
        text = newValue;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + text + "/" + selected + "]";
    }
}
