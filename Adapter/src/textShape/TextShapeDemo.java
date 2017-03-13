package textShape;

public class TextShapeDemo {

	public static void main(String[] args) {
		
///		TextView textview = new TextView();
		
		final TextShape textshape = new TextShape();
//		final TextShape textshape = new TextShape(new TextView());
		
/*		//default values
		String tvData = "TextView default data:\n";
		tvData += " origin x = " + textview.getOrigin()[0];
		tvData += ", origin y = " + textview.getOrigin()[1];
		tvData += ", height = " + textview.getExtent()[0];
		tvData += ", width = " + textview.getExtent()[1];
		
		System.out.println(tvData);
*/		
		Point[] boundingBox = textshape.boundingBox();
		
		String tsData = "TextShape data:\n";
		tsData += " bottomleft x = " + boundingBox[0].x;
		tsData += ", bottomleft y = " + boundingBox[0].y;
		tsData += ", topright x = " + boundingBox[1].x;
		tsData += ", topright y = " + boundingBox[1].y;
		
		System.out.println(tsData);
		
		textshape.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		System.out.println("\nunformatted text:");
		System.out.println(" " +textshape.getText());
		System.out.println("\nformatted text:");
		System.out.println(" " + textshape.formatText());
		
		

	}

}
