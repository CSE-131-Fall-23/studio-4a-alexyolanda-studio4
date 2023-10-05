package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(400, 240);
		StdDraw.setXscale(-10, 10);
		StdDraw.setYscale(-6, 6);
		
		StdDraw.setPenColor(StdDraw.RED);
		double[] x={-10,-10,0};
		double[] y={0,4,4}; 
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		double[] x1={-10,-10,0,10};
		double[] y1={-4,0,4,4}; 
		StdDraw.filledPolygon(x1,y1);
		
		StdDraw.setPenColor(0xff,0xe2,0x11);
		double[] x2={10,0,-10,10};
		double[] y2={0,-4,-4,4}; 
		StdDraw.filledPolygon(x2,y2);
		
		StdDraw.setPenColor(234,72,185);
		double[] x3={10,10,0};
		double[] y3={0,-4,-4}; 
		StdDraw.filledPolygon(x3,y3);
		
		StdDraw.setPenColor(0x39, 0xc5, 0xbb);
		StdDraw.filledRectangle(0.0, 5.0, 10.0, 1.0);
		StdDraw.setPenColor(0x66, 0xcc, 0xff);
		StdDraw.filledRectangle(0.0, -5.0, 10.0, 1.0);
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(0x00, 0x00, 0x00);
		StdDraw.rectangle(0.0, 0.0, 10.0, 6.0);
	}
}