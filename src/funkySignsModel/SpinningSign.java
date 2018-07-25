package funkySignsModel;

/**
 * A specialization of DynamicSign that wraps any other Sign.
 * This class takes some existing Sign and makes it turn.
 */
public class SpinningSign extends DynamicSign {

	/** Number of degrees to turn clockwise each timer invocation. */
    private int deltaDegrees;

    /** Construct a SpinningSign by wrapping another Sign.
     *  @param theBaseSign Sign to wrap.
 	 *  @param degrees Number of degrees to increase rotation clockwise.
 	 */
   public SpinningSign(Sign theBaseSign, int degrees) {
    	super(theBaseSign);
    	deltaDegrees = degrees;
    }
    
	/** The timer has fired, so perform this Sign's incremental actions. */
    public void tick() {
		turn(); // Routine action.
		super.tick();
	}
    
	/**
	 * Change the rotation of the Sign relative to its current rotation.
	 */
    protected void turn() {
        setRotation(getRotation() + deltaDegrees);
	}

    
}
