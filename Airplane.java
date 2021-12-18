/*
 * This is an Airplane class.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-14
 */

/** This is the Airplane class. */
public class Airplane {
    /** The speed of the airplane. */
    private int speed;

    /** Initialization. */
    public Airplane() {
        this.speed = 0;
    }

    /**
     * Getter for speed.
     *
     * @return speed
     * */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter for speed.
     *
     * @param newSpeed new speed
     * */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}

