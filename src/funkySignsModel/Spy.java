// !!! Task 4: 
// !!! Put your answer here

package funkySignsModel;

import java.util.*;

/** A Spy tells a collection of Updaters to update. **/
public class Spy {

	/** The updaters list. **/
	private ArrayList<Updater> updaters;

	public Spy() {
		updaters = new ArrayList<Updater>();
	}
	
	/** Getter for updaters list. **/
	public ArrayList<Updater> getUpdaters() {
		return updaters;
	}

	/** Do an update. **/
	public void update() {
		for (Updater updater: updaters)
			updater.update();
	}
}