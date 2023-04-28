package collectionFrameworminJava;
import java.util.*;

import javax.swing.text.html.parser.Element;
public class arraylist {
    public static void main(String[] args) {
        // timeComplexity (N) when the element get shifted to the right or left while removing the element

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(15);
        // to add the element at particular index position
        list.add(1, 50);
        System.out.println(list);
        // 

        // we can also add to a new list to the original list using addAll()  method
        // to get the element at index position
        System.out.println(list.get(1));
        // to remove the element at index position
        list.remove(1);
        System.out.println(list);
        // to remove the element whose index position is not known to us

        list.remove(Integer.valueOf(15));
        System.out.println(list);

        // to clear the list
        list.clear();
        System.out.println(list);
        // to set the new at any particular index position
        list.add(0,50);
        list.add(5);
        list.set(0,500);
        System.out.println(list);
        // iteration on the list

        for (int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i)); 
        }
        // syntax foreach
        for (Integer integer : list) {
            System.out.println("element " +": " + integer); 
        }
    }
}
