/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double [] x = new double [array.length];
        int index = 0;
        for(int i=0; i<array.length; i++){
            x[index] = array[i];
            index++;
        }
        return x; 
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for(int i=0; i<x.length; i++){
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i=0; i<x.length; i++){
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        theta  = Math.toRadians(theta);
        for(int i=0; i<x.length; i++){
            double store = x[i];
            x[i] = x[i]*Math.cos(theta) - y[i]*Math.sin(theta);
            y[i] = y[i]*Math.cos(theta) + store*Math.sin(theta);
        }
    }

    // Tests each of the API methods by directly calling them. 
 /*   public static void main(String[] args) {
} */

}
