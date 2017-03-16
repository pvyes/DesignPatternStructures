package shapeExample;

/**
 * The {@link Point} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway & James
 * R. Trott, Second Edition.
 * @author Martin de Boer
 */
public class Point extends Shape {

    /**
     * Display this point.
     */
    @Override
    public void display() {
        System.out.println(".  (Point)");
    }

    /**
     * Fill this point: empty implementation because a point cannot be filled.
     */
    @Override
    public void fill() {
    }

    /**
     * Hide this point. For this example, there's only an empty implementation.
     */
    @Override
    public void undisplay() {
    }
}
