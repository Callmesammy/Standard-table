
package standard.table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author user
 */
public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        getTableHeader().setReorderingAllowed(false);
        setRowHeight(20);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value+ "");
                
                return header;
                
              
                
            }
        });
    }
    
    
}
