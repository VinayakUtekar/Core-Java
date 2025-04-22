public class EvenOddTernanry {
    public static String OE(int a){
        return a%2==0 ? "Odd" : "Even";
    }
    public static void main(String [] args){
        int a = 40;
        System.out.println("Number is " + OE(a));
    }
}
