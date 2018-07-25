package funkySignsGui;

import javax.swing.*;
import java.awt.*;
import funkySignsModel.*;

/**
 * Subclass of JLabel used for displaying Signs.
 * Like a normal JLabel, it holds an Icon and has a location.
 * The size of the Label is always set to match the size of the Icon.
 * The icon may be rotated.
 */
public class FunkySignsView implements Updater {

	private RotatingLabel label;
	
	private Sign sign;

	/** Construct a SignView to show the given sign.
	 *  @param theIcon the Sign's appearance.
	 */
	public FunkySignsView(JPanel canvas, Sign theSign) {
    	label = new RotatingLabel(theSign.getIcon());
        label.setOpaque(false); // Ensure background is visible.
        canvas.add(label);

        sign = theSign;
        sign.getUpdaters().add(this);
    }
	
	/** Update to reflect changes to the SimpleSign. */
	 public void update() {
		//Set the location of the label
		label.setLocation(sign.getLocation());
		
		//Set the icon of the label
		Icon icon  = sign.getIcon();
		label.setIcon(icon);
		
		Dimension size = new Dimension(icon.getIconWidth(), icon.getIconHeight());
		label.setSize(size);
		label.setPreferredSize(size);
		
		label.setRotation(sign.getRotation());
	}
}
