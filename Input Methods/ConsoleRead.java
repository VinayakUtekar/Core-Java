import java.io.*;
class ConsoleRead{
    public static void main(String args[]) {
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter the number of elements :"));
        int data[] = new int[n];

        for(int i=0; i<n ; i++)
            data[i] = Integer.parseInt(c.readLine("Enter the elements : "));

        for (int i = 0; i<n ; i++){
            System.out.println(data[i]);
        }

        for (int d : data){
            System.out.println(d);
        }
    }
}