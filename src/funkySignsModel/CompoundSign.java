package funkySignsModel;

import java.awt.*;
import javax.swing.*;
import java.util.*;

/** A Sign that allows several Signs to move as a group. */
public class CompoundSign extends Sign {

		
	/** Constructor for  a group of Signs. **/
	
	public CompoundSign() {
		super.signs = new ArrayList<Sign>();
	}
	
	@Override
	public void addSign(Sign theSign) {
		signs.add(theSign);
	}
	
	/**
	 * Set the icon of the Sign
	 * Not supported in this implementation of Sign
	 * @param theIcon 
	 */
	public void setIcon(Icon theIcon) {
		//do nothing
	}
	
	/**
	 * Get the icon of the Sign
	 * Not supported for this implementation of Sign
	 */
	public Icon getIcon() {
		return null;	//return error value
	}
	
	/** Get the bounds of this Complex Sign */
	public Rectangle getBounds() {
		Rectangle bounds = null;
		
		for(Sign sign: signs)
			if (bounds == null)
				bounds = sign.getBounds();
			else
				bounds.add(sign.getBounds());

		return bounds;
	}
	
	/** Set the location of this group of Signs */
	public void setLocation(Point p){
		Point topLeft = getTopLeft();
		
		int deltaX = p.x - topLeft.x;
		int deltaY = p.y - topLeft.y;
		
		for(Sign sign : signs) {
			Point from = sign.getLocation();
			Point to = new Point(from.x + deltaX, from.y + deltaY);
			sign.setLocation(to);
		}
	}
	
	/** Get the location of this group of Signs. */
	public Point getLocation(){
		return getTopLeft();
	}
	
	private Point getTopLeft() {
		Set<Integer> xs = new HashSet<Integer>();
		Set<Integer> ys = new HashSet<Integer>();

		for(Sign sign: signs) {
			Point p = sign.getLocation();
			xs.add(p.x);
			ys.add(p.y);
		}
		
		return new Point(Collections.min(xs), Collections.min(ys));
	}
	
	/**
	 * Set the rotation of the group of Signs
	 * Not supported
	 */
	public void setRotation(int rot){
		//do nothing
	}
	
	/**
	 * Get the rotation of the group of Signs
	 * Not supported
	 */
	public int getRotation(){
		return -1; // return error value
	}
	
	/** The timer has fired, so perform this Sign's incremental actions. */
	public void tick() {
		for(Sign sign: signs)
			sign.tick();
	}
}
