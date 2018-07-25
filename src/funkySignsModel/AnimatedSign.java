package funkySignsModel;

import javax.swing.*;
import java.util.*;

/**
 * A specialization of DynamicSign that wraps a Sign and animates it
 * by cycling through a sequence of Icons.
 */
public class AnimatedSign extends DynamicSign {

	/** Array of Icons which are cyclically displayed. */
	private List<Icon> icons;
	
	/**Keep track of the current position using an iterator. */
	private Iterator<Icon> iconIter;

	/**
	 * Construct an AnimatedSprite that will update the given baseSign
	 * at the given interval.
	 * @param theBaseSign The Sign to be wrapped.
	 * @param theIcons The Icons through which the animation will cycle.
	 */
	public AnimatedSign(Sign theBaseSign, Icon[] theIcons) {
		super(theBaseSign);
    	icons = Arrays.asList(theIcons);
    	iconIter = icons.iterator();
    	
    	assert !icons.isEmpty();
    }
	   
	/** The timer has fired, so perform this Sign's incremental actions. */
    public void tick() {
		advanceImage(); // Routine action.
		super.tick();
	}

	/** Change the Icon of the wrapped Sign to the next Icon in sequence. */
	protected void advanceImage() {
		if(!iconIter.hasNext())
			iconIter = icons.iterator(); // Back to start.

		baseSign.setIcon(iconIter.next());
	}
}
