package StriverQuestion.day02;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class LC1528 {
    public static void main(String[] args) {
        
        String s = "codeleet";
        int[] indices  = { 4,5,6,7,0,2,1,3};
        char[] values = new char[indices.length]; 
        for (int i = 0; i < indices.length; i++) {
            values[i] =s.charAt(i); 
        }
        for (int i = 0; i < indices.length; i++) {
            System.out.println(values[i]);
        }
        
        
    }
}
