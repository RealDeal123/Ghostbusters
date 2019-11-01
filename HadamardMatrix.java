/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [][] x= new boolean [n][n];
        x [0][0] = true;
        for(int i=1; i<n; i=i+i){
            for(int j=0; j<i; j++){
                for(int k =0; k<i; k++){
                    x[j+i][k] = x[j][k];
                    x[j][k+i] = x[j][k];
                    x[j+i][k+i] = !x[j][k];
                }
            }
        }
    printAnswer(x);
    }

    public static void printAnswer(boolean [][] x){
        for(int i=0; i<x.length; i++){ 
            for(int j=0; j<x.length; j++){
                if(x[i][j]){
                    System.out.print("T ");
                }
                else{
                    System.out.print("F ");
                }
            }
            System.out.println();
        }
    }
    
}


