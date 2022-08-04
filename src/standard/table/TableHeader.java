
package standard.table;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author user
 */
public class TableHeader extends JLabel{

    public TableHeader(String text) {
        super(text);
        setForeground(new Color(150,31,219));
        setOpaque(false);
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10,5,10,5));
        
    }
    
    
}
