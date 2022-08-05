
package standard.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(35);
        setGridColor(Color.WHITE); 
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value+ "");
                if (column == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 4) {
                   Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                   com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        com.setForeground(new Color(210,101,111));
                        
                    }else{
                        
                            com.setForeground(new Color(10,101,111));
                        
                    }
                   
                   return com;
                }else{
                    Statustype type = (Statustype)value;
                    Tablecarrier car = new Tablecarrier(type);
                    return  car;
                }
                
            }
        });
    }
    public void addRow(Object [] row){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    }

    
}
