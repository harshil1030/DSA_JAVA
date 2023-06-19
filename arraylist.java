import java.util.ArrayList;
import java.util.Collections;


public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);   //adds elementsin List
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(4); //removes Element from list 
        
        int i;
        for(i=0;i<list.size();i++){           //printing arraylist Elements 
            System.out.println(list.get(i));
        }

        list.add(3,2);  //inserting at specific location
        System.out.println(list);

        list.set(4,5);  //changing data on specificindex
        System.out.println(list);

        int sizearr=list.size();
        System.out.println(sizearr);

        Collections.sort(list);
        System.out.println(list);

    }
    

}
