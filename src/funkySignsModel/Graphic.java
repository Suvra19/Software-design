package funkySignsModel;

import javax.swing.*;
import java.awt.*;

/**
 * A graphic knows what area it occupies. It can be moved or rotated around its
 * center point.
 */

public interface Graphic {
	// !!! Task 3:
	// !!! Put your answer here.

	/**
	 * Set the Graphic's image.
	 * 
	 * @param icon
	 *            The Icon to display. The graphic resizes to match the Icon.
	 */
	public void setIcon(Icon icon);

	/** Getter for this graphic's image. */
	public Icon getIcon();

	/**
	 * Move the graphic to an absolute position.
	 * 
	 * @param point
	 *            Coordinates for the top-left corner of the graphic.
	 */
	public void setLocation(Point point);

	/** Getter for top-left corner of graphic. */
	public Point getLocation();

	/**
	 * Set the absolute clockwise rotation of the graphic
	 * 
	 * @param degrees
	 *            How many degrees the graphic should be turned from vertical.
	 */
	public void setRotation(int degrees);

	/** Getter for clockwise rotation of this graphic in degrees. */
	public int getRotation();

	/** Get a rectangle describing the area currently occupied by the graphic. */
	public abstract Rectangle getBounds();

	/** Update the graphic's state. */
	public void tick();
}
