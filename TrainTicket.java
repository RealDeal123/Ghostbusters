/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

    public static void main(String[] args) {
    	double p1 = 7.50;
    	double p2 = 13.20;
    	int age = Integer.parseInt(args[0]);
    	boolean atStation = Boolean.parseBoolean(args[1]);
    	if (age < 0 || age > 120){
    		System.out.println("Illegal input");
    	}
    	else if(age<7){
    		System.out.println(0.0);
    	}
    	else if(atStation){
    		if(age>65){
    			System.out.println(p1);
    		}
    		else{
    			System.out.println(p2);
    		}
    	}
    	else{
    		if(age>65){
    			System.out.println(p1*1.20);
    		}
    		else{
    			System.out.println(p2*1.20);
    		}
    	}

    }

}
