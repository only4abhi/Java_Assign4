import java.io.*;
public class Ascii {
    public static void main(String args[]) throws IOException{

	  BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the char:");
      String str = buff.readLine();
      for ( int i = 0; i < str.length(); ++i ){
        char c = str.charAt(i);
        int j = (char) c;// your work is done here
        System.out.println("ASCII OF "+c +" = " + j + ".");
        }
      
      /*
       * 
       * 
    	for (int c=32; c<128; c++) {
    	    System.out.println(c + ": " + (char)c);
    	   } 
       * 
       */
    }
}
