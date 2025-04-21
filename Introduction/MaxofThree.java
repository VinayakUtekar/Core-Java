public class MaxofThree{
    public static void main(String [] args){
        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);
        var c = Integer.parseInt(args[2]);
        var max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);
    }
} 