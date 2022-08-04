package standard.table;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(35);
        getTableHeader().setReorderingAllowed(false);
        setGridColor(new Color(230,230,230));
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value+ "");
                if (column ==4) {
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
                        com.setForeground(new Color(130,120,120));
                    }else{
                        com.setForeground(new Color(230,220,120));
                    }
                    return com;
                }
                return new JLabel("Testing");
            }
        });
    }
    
    
}
