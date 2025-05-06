import java.io.*;
class CopyTextFile{
    public static void main(String args[]){
        Console c = System.console();

        String srcfilename = c.readLine("Enter SRC filename : ");
        File srcf = new File(srcfilename);

        if(srcf.exists()){
            try{
                String destfilename = c.readLine("Enter DEST filename : ");
                File destf = new File(destfilename);
                
                FileReader fr = new FileReader(srcf);
                BufferedReader br = new BufferedReader(fr);
                
                FileWriter fw = new FileWriter(destf);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                String line = br.readLine();
                while(line != null){
                    pw.println(line);
                    line = br.readLine();
                }
                br.close();
                pw.close();
            }catch(IOException e){
                System.out.println("Issues : " + e);
            }
        }
        else{
            System.out.println("File does not exists");
        }
    }
}