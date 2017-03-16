package shapeExample;

/**
 * The {@link Square} class from the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway & James
 * R. Trott, Second Edition.
 * @author Martin de Boer
 */
public class Square extends Shape {

    /**
     * Display this square.
     */
    @Override
    public void display() {
        System.out.println("[] (Square)");
    }

    /**
     * Fill this square. For this example, there's only an empty implementation.
     */
    @Override
    public void fill() {
    }

    /**
     * Hide this square. For this example, there's only an empty implementation.
     */
    @Override
    public void undisplay() {
    }



}
