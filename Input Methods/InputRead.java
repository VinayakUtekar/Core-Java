import java.io.*;
class InputRead{
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);

        System.out.print("Enter the number of elements :");
        int n = Integer.parseInt(br.readLine());
        int data[] = new int[n];

        for(int i=0; i<n ; i++){
            System.out.print("Enter the elements : ");
            data[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i<n ; i++){
            System.out.print(data[i]);
        }
    }
}