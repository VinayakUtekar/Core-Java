class StringFunctions{
    public static void main(String args[]){
        String s1 = "kamalsir";
        System.out.println(s1);
        
        s1 = s1.toUpperCase();
        System.out.println(s1); //KAMAl SIR
        
        s1 = s1.toLowerCase();
        System.out.println(s1);//kamal sir
        
        s1 = s1.concat("rocks");
        System.out.println(s1); //kamal sir rocks
        
        s1.toUpperCase();
        System.out.println(s1); //kamal sir rocks
        
    }
}
