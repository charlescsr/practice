import java.io.*;
import java.util.*;

public class S {

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = null;
        try {
            A = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        String B = null;
        try {
            B = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println(A.length()+B.length());
        if(A.charAt(0)<=B.charAt(0)){
            System.out.println("No");
        } 
        else {
         System.out.println("Yes");   
        }
        String str=A.substring(0, 1).toUpperCase().concat(A.substring(1));
        String str1=B.substring(0, 1).toUpperCase().concat(B.substring(1));
        System.out.println(str+" "+str1);
    }
}
