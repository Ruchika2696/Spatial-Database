import java.util.*;
import java.lang.*;
import java.io.*;
public class Mouse {
    public static void main(String args[]) {
         double R = 8.0;
		double r = 1.0;
		double a = 4.0;
		double x0 = R + r - a;
		double y0 = 0;

		double pi = Math.PI;
		int nRev = 16;
		for(double t = 0.0; t < (pi*nRev); t+=0.01) {
			double x1 = ((R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t))/100;
			double y1 = ((R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t))/100;
			double p1 = -118.289174;
			double p2 = 34.021325;
			System.out.print(x1+p1+",");
			System.out.println(y1+p2+",");
		}
    }
}