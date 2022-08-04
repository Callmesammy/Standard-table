
package standard.table;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/*
 *
 * 
 */
public class classStatus extends JLabel{

    /**
     * @return the type
     */
    public StatusType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(StatusType type) {
        this.type = type;
    }

    public classStatus() {
        setForeground(Color.WHITE);
    }
    
    private StatusType type;
    
    public void getType(StatusType type){
        this.setType(type);
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint  g7;
        if (type == StatusType.APPROVED) {
            g7 = new GradientPaint(0, 0, new Color(16, 74, 13), 0, getHeight(), new Color(34, 128, 33), true);
        }else if (type == StatusType.PENDIGN) {
             g7 = new GradientPaint(0, 0, new Color(187, 49, 241), 0, getHeight(), new Color(74, 17, 79), true);
        
         }else if (type == StatusType.FAILED) {
             g7 = new GradientPaint(0, 0, new Color(193, 21, 21), 0, getHeight(), new Color(95, 9, 9), true);
         }g2.setPaint(g7);
        g2.fillRect(TOP, TOP, getWidth(), getHeight());
        super.paintComponent(g); 
    } 
   
       
    
}
