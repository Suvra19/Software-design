package funkySignsModel;

import java.awt.Point;

/**
 * Strategy to move a <code>MovingSign</code>. 
 * Subclasses implementing <code>MovingStrategy</code> provide the desired movement of the sign.
 */
public interface MovingStrategy {
	/**
	 * Moves the sign by 5 units. The direction is determined by the subclasses implementing it.
	 * @param sign the sign to move.
	 * @return the Point with coordinates of the new position of the sign
	 */
	Point move(Sign sign);
}
