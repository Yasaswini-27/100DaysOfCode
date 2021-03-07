import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        //reading the input
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //Adding strings length
        System.out.println(A.length()+B.length());  
        
        //comparing the strings lexicographically 
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        //printing the first letter of both the strings in capitals
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
        
    }
}



