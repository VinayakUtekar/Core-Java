import java.io.*;
class SumAvgOfN{
    public static void main(String args[]){
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter no of subjects  : "));
        if (n>0){
            int marks[] = new int[n];
            for (int i = 0; i < n; i++){
            marks[i] = Integer.parseInt(c.readLine("Enter marks : ")) ;
            }
            double sum = 0;
            for(double m : marks){
                sum = sum + m;
            }
            Double avg = sum/n;
            System.out.println("Average of marks = " + avg);
        }
        else{
            System.out.println("Input array size ");
        }
    }
}