public class PrePostOperator {
    public static void main(String [] args){
        int a=8, b=4;
        int res = ++a + b++;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(res);
    }
}
