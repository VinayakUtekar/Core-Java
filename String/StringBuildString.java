class StringBuffString{
    public static void main(String args[]){
        //when string is not changing ->  immutable
        String s1 = new String("kamal");
        System.out.println(s1);
        s1 = s1.concat("sir");
        System.out.println(s1);
        
        
        //when string is changing ->  mutable
        StringBuffer s2 = new StringBuffer("kamal");
        System.out.println(s2);
        s2.append(" sir");
        System.out.println(s2);
    }
}