class MaxofTwo{
    public static void main(String [] args){
        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);
        var max = a > b ? a : b;
        System.out.println(max);
    }
}