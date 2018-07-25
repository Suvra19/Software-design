/**
 * 
 */
package funkySignsGui;
import javax.swing.*;
import java.awt.*;
/**
 * @author moffat
 *
 */
/** JLabel which has the added capability of rotating. */
@SuppressWarnings("serial")
public class RotatingLabel extends JLabel{

	int rotation;	// Degrees clockwise.

	public RotatingLabel(Icon theIcon) {
		super(theIcon);
		rotation = 0;
	}

	public void setRotation(int theRotation){
		rotation = theRotation;
		repaint();
	}

	/** Paint the Icon, rotated if necessary. */
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if (rotation != 0)
			g2d.rotate(Math.toRadians(rotation), getWidth()/2, getHeight()/2);	//rotate the icon

		super.paintComponent(g);
	}
}

