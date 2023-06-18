import java.util.*;
// import java.util.HashSet;
// import java.util.Iterator;

public class hashsets {

    public static boolean hello(HashSet set)
    {
        if(set.contains(3)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();   //calling Hashset Class by defing its Object 

        set.add(1);     // add function will adds up the value
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);  //printing the hashset values

        System.out.println(hello(set));

  
        set.remove(3);              //deleting Element in hashset 
        System.out.println(set);

        System.out.println("Size of Set is "+set.size());  // prints size of Set 
        
        
        //Iterator in HashSets
        Iterator it= set.iterator(); 

        it.next();     //initially it.next will points to null. 
        it.hasNext();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
