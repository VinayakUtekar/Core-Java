package FileProgramming;

import java.io.*;
class ReadFile{
    public static void main(String args[]){
        Console c = System.console();
        String filename = c.readLine("Enter filename : ");
        File f = new File(filename);

        if(f.exists()){
            try{
                FileReader fr  = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
                br.close();
            }catch(IOException e){
                System.out.println("Issue " + e);
            }
                
        }
        else{
            System.out.println(filename + "  does not exists");	
        }
    }
}