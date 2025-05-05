import java.util.*;
class ArrayListFunctions{
    public static void main(String args[]){

        ArrayList<Integer> d1 = new ArrayList<>();
        System.out.println(d1);

        //append
        d1.add(10);
        d1.add(30);
        d1.add(20);
        d1.add(10);

        //insert
        d1.add(1, 40);
        System.out.println(d1);
        // d1.add(10,88); 

        //replace
        d1.set(2, 50);
        System.out.println(d1);

        //check
        System.out.println(d1.contains(40));
        System.out.println(d1.contains(41));

        //retrive
        //System.out.println(d1.get(10)); error due to index address 10 not present

        System.out.println(d1.size());

        d1.remove(new Integer(10));
        System.out.println(d1);

        d1.remove(new Integer(31));

        d1.clear();
        System.out.println(d1);


    }
}