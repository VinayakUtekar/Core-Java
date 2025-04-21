public class AddNum5 {
    public static int add(int a, int b){
        int res = a + b;
        return res;  
    }
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(add(a,b));
    }
}
