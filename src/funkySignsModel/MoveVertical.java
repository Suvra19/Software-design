package funkySignsModel;

import java.awt.Point;

public class MoveVertical implements MovingStrategy {
	/**
	 * Moves the sign by 5 units along the y-axis from top to bottom.
	 * @param sign the sign to move.
	 * @return Point the new coordinates of the new position of the sign
	 */
	@Override
	public Point move(Sign sign) {
		Point currentPosition = sign.getLocation();
		return new Point(currentPosition.x, currentPosition.y + 5);
	}

}
