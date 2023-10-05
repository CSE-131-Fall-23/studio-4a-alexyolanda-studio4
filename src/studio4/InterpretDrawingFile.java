package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType;
		int redComponent,greenComponent,blueComponent;
		boolean isFilled;
		double[] x = new double[3];
		double[] y = new double[3];
		shapeType = in.next();
		redComponent = in.nextInt();
		greenComponent = in.nextInt();
		blueComponent = in.nextInt();
		isFilled = in.nextBoolean();
		for(int i=0;i<3;i++) {
			x[i]=in.nextDouble();
			y[i]=in.nextDouble();
		}
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		StdDraw.filledPolygon(x,y);

	}
}
