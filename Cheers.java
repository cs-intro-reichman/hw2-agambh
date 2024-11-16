// Prints a crowd cheering output.

import javax.print.DocFlavor.STRING;

public class Cheers {
        public static void main(String[] args) {
	    int num = Integer.parseInt(args[1]);
            String s = args[0].toUpperCase();
            char c;
            String l= "AEFHILMNORSX";
            for(int i=0 ; i < s.length() ; i++){
                c=s.charAt(i);
                if(l.indexOf(c)== -1){
                        System.out.println("Give me a  " + c + ": " + c + "!");
                } else{
                        System.out.println("Give me an " + c + ": " + c + "!");
                }
            }
            System.out.println("What does that spell?");
            for(int j = 1 ; j<=num ; j++){
                System.out.println(s + "!!!");
            }
        }
}
