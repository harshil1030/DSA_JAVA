import java.util.*;

public class hashmap {

    public static boolean hello(int key, HashMap map){
        if(map.containsKey(key)){                             //using Function Contains Key 
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>(); //Defining Hashmap

        //Inserting Value in Hashmaps 
        map.put(1,"India");
        map.put(2,"China");
        map.put(3,"USA");
        System.out.println(map);
        
        //updating Value in hashmaps 
        map.put(2,"Hello");
        System.out.println(map);

        // Searching in Hashmaps
        System.out.println(hello(4, map));

        for (Map.Entry<Integer, String> e : map.entrySet()) {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }


      

    }
}
