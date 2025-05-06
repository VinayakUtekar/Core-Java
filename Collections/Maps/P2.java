package Collections.Maps;

import java.util.*;
class P2{
    public static void main(String args[]){
        HashMap<String, Integer> pp = new HashMap<>();
        pp.put("bjp", 120);
        pp.put("ss", 46);
        pp.put("sp", 20);
        pp.put("mns", 1);

        System.out.println(pp.get("bjp"));
        System.out.println(pp.get("kp"));

        System.out.println(pp);
        pp.remove("ss");
        System.out.println(pp);

    }
} 
