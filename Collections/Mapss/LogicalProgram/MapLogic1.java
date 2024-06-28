/*1) Write a Java program to find the duplicate words and their number of occurrences in a string? */

import java.util.HashMap;
import java.util.Set;

public class MapLogic1 {


    public static void main(String[] args) {
        
        String s ="My Name is Priya Lal";
        int count=0;
        HashMap<String,Integer>   map = new HashMap<>();
        String s1=s.replace(" ", "");
        String []arr =s1.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    map.put(s1, count++);
                }
                
            }
        }

       Set keys=map.keySet();
       System.out.println(keys);
       for (Object obj : keys) {
        System.out.println("Key "+obj+" Values "+map.get(obj));
    
}

    }
}
