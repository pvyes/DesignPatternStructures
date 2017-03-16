package shapeExample;

/**
 * The {@link Client} inspired by the Adapter example on page 106 in "Design Patterns Explained" by Alan Shalloway &
 * James R. Trott, Second Edition.
 *
 * @author Martin de Boer
 */
public class Client {

    public static void main(String[] args) {

        // Shape = Target, Circle = Adapter, XXCircle = Adaptee
        Shape circle = new Circle();

        // XXCircle's functionality is used to display a circle
        circle.display();

        // Here we display the other shapes (not part of the adapter pattern)
        Shape point = new Point();
        point.display();

        Shape square = new Square();
        square.display();

        Shape line = new Line();
        line.display();
    }
}
