package shapeExample;

import java.awt.*;

/**
 * The {@link Circle} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway &
 * James R. Trott, Second Edition.
 *
 * @author Martin de Boer
 */
public class XXCircle {

    private Color color;
    private java.awt.Point position;

    /**
     * Construct an XXCirlce with a default color and position.
     */
    public XXCircle() {
        this.color = Color.BLACK;
        this.position = new java.awt.Point();
        this.position.setLocation(0, 0);
    }

    /**
     * Display this XXCirle.
     */
    public void displayIt() {
        System.out.println("O  (XXCircle, adaptee)");
    }

    /**
     * Fill this XXCircle. For this example, there's only an empty implementation.
     */
    public void fillIt() {
    }

    /**
     * Hide this XXCircle. For this example, there's only an empty implementation.
     */
    public void hide() {
    }

    /**
     * Set the position of this XXCircle.
     * @param position the new position
     */
    public void setPostion(java.awt.Point position) {
        this.position = position;
    }

    /**
     * Get the position of this XXCircle.
     * @return the current position
     */
    public java.awt.Point getPosition() {
        return this.position;
    }

    /**
     * Set the color of this XXCircle.
     * @param color
     */
    public void setItsColor(Color color) {
        this.color = color;
    }


}
