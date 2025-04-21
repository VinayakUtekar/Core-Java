class MinofThree{
    public static void main(String [] args){
        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);
        var c = Integer.parseInt(args[2]);
        var min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println(min);
    }
}