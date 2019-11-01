/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {
    	int count = 0;
    	int num = Integer.parseInt(args[0]);
    	if(num<0){
    		num *= -1;
    	}
    	while(num != 0){
    		if(num%10==7){
    			count++;
    		}
    		num = num/10;
    	}
    	System.out.println(count);
    	
    }

}
