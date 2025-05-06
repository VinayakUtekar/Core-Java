import java.io.*;
import java.util.*;
class P7{
    public static void main(String args[]){

        Console c = System.console();
        //Hash MAPS unordered and unsorted
        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("idli",50);
        m1.put("dosa",70);
        m1.put("momo",60);
        m1.put("idli",80);
        m1.put("dosa",90);
        System.out.println(m1);

        //Linked Hash MAPS insertion ordering
        LinkedHashMap<String, Integer> m2 = new LinkedHashMap<>();
        m2.put("idli",50);
        m2.put("dosa",70);
        m2.put("momo",60);
        m2.put("idli",80);
        m2.put("dosa",90);
        System.out.println(m2);

        //TREE MAPS sorted
        TreeMap<String, Integer> m3 = new TreeMap<>();
        m3.put("idli",50);
        m2.put("dosa",70);
        m3.put("momo",60);
        m3.put("idli",80);
        m3.put("dosa",90);
        System.out.println(m3);

    }
}