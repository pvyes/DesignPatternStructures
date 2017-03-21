package shapeExample;

import java.awt.*;

/**
 * The {@link Circle} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway &
 * James R. Trott, Second Edition.
 *
 * @author Martin de Boer
 */
public class Circle extends Shape {

    private XXCircle adaptee;

    public Circle() {
        this.adaptee = new XXCircle();
    }

    /**
     * Display this cirle.
     */
    @Override
    public void display() {
        this.adaptee.displayIt();
    }

    /**
     * Fill this circle. For this example, there's only an empty implementation.
     */
    @Override
    public void fill() {
    }

    /**
     * Hide this circle. For this example, there's only an empty implementation.
     */
    @Override
    public void undisplay() {
    }

    /**
     * Set the location of this shape.
     *
     * @param location the new location
     */
    @Override
    public void setLocation(Location location) {
        this.adaptee.setPostion(new java.awt.Point(location.x, location.y));
    }

    /**
     * Get the location of this shape.
     *
     * @return the current location
     */
    @Override
    public Location getLocation() {
        return new Location((int) this.adaptee.getPosition().getX(), (int) this.adaptee.getPosition().getY());
    }

    /**
     * Set the color of this shape.
     *
     * @param color
     */
    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }
}
