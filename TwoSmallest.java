/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
    	double [] x = new double[args.length]; 
 
    	for(int i=0; i<args.length; i++){      
    		x[i] = Double.parseDouble(args[i]);
    	}
		
		double s1 = Double.MAX_VALUE;
		int a = 0;
		for (int i = 0; i < x.length; i++) { 
			if (x[i] < s1) {
				s1 = x[i];
				a = i;
			}
		}

		double s2 = Double.MAX_VALUE;
		for (int j = 0; j < x.length; j++) {
			if ((a!=j) && (x[j] < s2 && x[j] >= s1)) { 
				s2 = x[j];
			}
		}
		System.out.println(s1);
		System.out.println(s2);

	}
    	
    }


