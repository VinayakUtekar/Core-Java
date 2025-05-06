import java.io.*;
class AppendFile{
    public static void main(String args[]){
        Console c = System.console();
        String filename = c.readLine("Enter filename : ");
        File f = new File(filename);

        if(f.exists()){
            try{
                FileWriter fw  = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                String data = c.readLine("Enter data : ");
                pw.println(data);
                pw.close();
            }catch(IOException e){
                System.out.println("Issue " + e);
            }
        }
        else{
            System.out.println(filename + "  does not exists");	
        }
    }
}