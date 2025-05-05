package Collections.Set;

import java.util.*;
class P1{
    public static void main(String arsg[]){

        //unordered and unsorted Hash set
        HashSet<String> pp1 = new HashSet<>();
        pp1.add("bjp");
        pp1.add("ss");
        pp1.add("sp");
        pp1.add("aap");
        pp1.add("bjp");
        pp1.add("sp");
        System.out.println(pp1);

        //ordered Linked  Hash Set
        LinkedHashSet<String> pp2 = new LinkedHashSet<>();
        pp2.add("bjp");
        pp2.add("ss");
        pp2.add("sp");
        pp2.add("aap");
        pp2.add("bjp");
        pp2.add("sp");
        System.out.println(pp2);

        //sorting or sorted Tree Set
        TreeSet<String> pp3 = new TreeSet<>();
        pp3.add("bjp");
        pp3.add("ss");
        pp3.add("sp");
        pp3.add("aap");
        pp3.add("bjp");
        pp3.add("sp");
        System.out.println(pp3);

    }
}