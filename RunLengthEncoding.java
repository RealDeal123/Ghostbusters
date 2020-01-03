/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Sheel Vakil, sv576@scarletmail.rutgers.edu, sv576
 *
 *************************************************************************/

public class RunLengthEncoding {
    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {
           char a = original.charAt(0);
           int count = 0;
           String encode = "";
             for(int i=0; i<original.length(); i++){
                 if(a == (original.charAt(i))){
                     count++;
                 }
                 else{
                     if(count>1){
                         encode += "" + count;
                     }
                     encode += original.charAt(i-1);
                     a = original.charAt(i);
                     count = 1;
                 }
             }
             if(count>1){
                encode = encode + count + a;
             }
             else{
                encode = encode + a;
             }
             
             return encode;
        }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  {
        if(original.length() == 0){ 
            return "";
        }
        if(Character.isDigit(original.charAt(0))){ 
            char c = original.charAt(0);
            int x = c - '0';
            String s = appendNTimes(original.substring(1,2), x-2);
            return s + decode(original.substring(1,original.length()));
        }
        return original.substring(0,1) + decode(original.substring(1,original.length())); 
    } 

    public static String appendNTimes (String original, int n) {
        if(n<=0){
            return original;
        }
        return original + appendNTimes(original, n-1);
    }

    public static void main (String[] args){
    String w = encode("a");
    String q = encode("word");
    String r = encode("aaabbcdcc");
    String t = encode("aabbeddbsjdd");
    System.out.println(w);
    System.out.println(q);
    System.out.println(r);
    System.out.println(t);
    }
}
