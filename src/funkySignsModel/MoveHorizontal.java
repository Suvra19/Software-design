package funkySignsModel;

import java.awt.Point;

public class MoveHorizontal implements MovingStrategy {
	
	/**
	 * Moves the sign by 5 units along the x-axis from left to right.
	 * @param sign the sign to move.
	 * @return Point the new coordinates of the new position of the sign
	 */
	@Override
	public Point move(Sign sign) {
		Point currentPosition = sign.getLocation();
		return new Point(currentPosition.x + 5, currentPosition.y);
	}
}
