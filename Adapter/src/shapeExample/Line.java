package shapeExample;

/**
 * The {@link Line} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway & James
 * R. Trott, Second Edition.
 * @author Martin de Boer
 */
public class Line extends Shape {

    /**
     * Display this line.
     */
    @Override
    public void display() {
        System.out.println("-  (Line)");
    }

    /**
     * Fill this line: empty implementation because a line cannot be filled.
     */
    @Override
    public void fill() {
    }

    /**
     * Hide this line. For this example, there's only an empty implementation.
     */
    @Override
    public void undisplay() {
    }
}
