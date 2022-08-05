
package standard.table;

import java.awt.Color;
import java.awt.Graphics;
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
        setForeground(new Color(123,10,112));
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10,5,10,5));
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(102,102,102));
        g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
    }
    
    
}
