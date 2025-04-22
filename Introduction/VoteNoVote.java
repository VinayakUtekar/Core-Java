public class VoteNoVote {
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        String min = a >= 18 ? "Can Vote" : "Cannot Vote";
        System.out.println(min);
    }
}
