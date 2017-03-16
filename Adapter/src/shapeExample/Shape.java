package shapeExample;

import java.awt.*;

/**
 * The {@link Shape} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway & James
 * R. Trott, Second Edition.
 *
 * @author Martin de Boer
 */
public abstract class Shape {

    private Location location;
    private Color color;

    /**
     * Construct a {@link Shape} with default {@link Location} and {@link Color}.
     */
    public Shape() {
        this.location = new Location(0,0);
        this.color = Color.BLACK;
    }

    /**
     * Set the location of this shape.
     * @param location the new location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Get the location of this shape.
     * @return the current location
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Set the color of this shape.
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Display this shape.
     */
    public abstract void display();

    /**
     * Fill this shape.
     */
    public abstract void fill();

    /**
     * Hide this shape.
     */
    public abstract void undisplay();

    /**
     * A location or position, consisting of a x an y coordinate.
     */
    public class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
