/*
 * This is a Jet class.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-14
 */

/** Jet class based off of Airplane. */
public class Jet extends Airplane {

    /** Speed multiplier. */
    private static final int MULTIPLIER = 2;

    /**
     * Sets the jet's speed.
     *
     * @param speed the new speed
     * */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /** Accelerates the jet's speed. */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
