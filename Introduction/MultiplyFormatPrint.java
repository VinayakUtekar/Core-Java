public class MultiplyFormatPrint {
    public static void main(String [] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double res = a*b*c;
        System.out.println(res);
        System.out.printf("%.2f",res);
        System.out.format("%.2f",res);
    }
}
