/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {
    	double price = Double.parseDouble(args[0]);
    	double gals = Double.parseDouble(args[1]);
    	boolean cash = Boolean.parseBoolean(args[2]);
        if (price<=0 || gals<=0){
            System.out.println("Illegal input");
        }
    	else if(cash){
    		System.out.println(price*gals);
    	}
    	else{
    		System.out.println(price*gals*1.1);
    	}
	
    }
}
