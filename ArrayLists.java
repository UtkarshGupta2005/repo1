import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements 
        list.add(0);
        list.add(1);
        list.add(13);
        list.add(9);
        list.add(7);
        
        
        System.out.println(list);

        //get elements
        int elem = list.get(1);
        System.out.println(elem);

        //add element in between .add(index,element)
        list.add(1,1);
        System.out.println(list);

        // set element .set(index,element)
        list.set(0,-1);
        System.out.println(list);

        //delete element .remove(index)
        list.remove(1);
        System.out.println(list);

        //size of list
        System.out.println(list.size());

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}