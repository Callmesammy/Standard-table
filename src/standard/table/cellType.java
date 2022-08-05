
package standard.table;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class cellType extends JLabel{

    /**
     * @return the type
     */
    public Statustype getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Statustype type) {
        this.type = type;
    }

    public cellType() {
        setForeground(Color.WHITE);
    }
    
    private Statustype type;
    
  public void SetType (Statustype type){
      this.setType(getType()); 
      setText(type.toString());
      
      repaint();
  }

    @Override
    protected void paintComponent(Graphics g) {
        if (type != null) {
               Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint g7 = null;
        if (type == Statustype.SUCCESS) {
            g7 = new GradientPaint(0, 0, new Color(11, 122, 28), 0, getHeight(), new Color(15, 42, 2), true);
            
        }else if (type == Statustype.PENDING) {
             g7 = new GradientPaint(0, 0, new Color(250, 19, 241), 0, getHeight(), new Color(43, 5, 40), true);
        }else if(type == Statustype.FAILED){
             g7 = new GradientPaint(0, 0, new Color(231, 16, 16), 0, getHeight(), new Color(28, 0, 0), true);
        }
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1); 
        }
    
        super.paintComponent(g); 
    }
  
    
}
