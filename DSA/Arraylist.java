
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();
         //add Element in java
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //get elements
        int elements = list.get(0);
        System.out.println(elements);
        //add element with index nu;
        list.add(1,50);
        System.out.println(list);
        //set elements 
        list.set(1,100);
        System.out.println(list);
        //remove element in list
        list.remove(3);
        System.out.println(list);
        //find size
        System.out.println(list.size());
        //iterator in array list 
         for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
         }
         System.out.println();
         //Sorting in Array
           Collections.sort(list);
           System.out.println(list);

    }
    
}
