public class EvenOdd {
    public static String OE(int a){
        if(a%2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        System.out.println("Number is " + OE(a));
    }
}
