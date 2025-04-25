public class NFactWhile {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        if (num >= 0){
            int i = 1,fact = 1;
            while(i<=num)
            {
                fact = fact * i;
                i = i + 1;
            }
            System.out.print("\n FACTORIAL OF NUMBERS IS : " + fact);
        }
        else{
            System.out.print("\n INVALID INPUT");
        }
    }
}
