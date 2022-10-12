import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
  
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        if(A.charAt(0) > B.charAt(0)) // charAt() extracts the character at that index
        System.out.println("Yes");
        else
        System.out.println("No");
        // subString(starting index, ending index)
        // subString(0,1).toUpperCase() --> Only capitalizes the first letter and the remaining string has to be added
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+ " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        
    }
}



