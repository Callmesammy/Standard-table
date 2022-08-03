
package standard.table;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author user
 */
public class TableHeader extends JLabel{

    public TableHeader(String text) {
    super(text);
        setOpaque(false);
        setBackground(new Color(250,250,250));
        setFont(new Font("sansserif", 1, 13));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }
    
    
    
}
