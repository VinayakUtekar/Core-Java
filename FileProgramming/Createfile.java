import java.io.*;
class CreateFile{
    public static void main(String args[]){
        Console c = System.console();
        String filename = c.readLine("Enter filename : ");
        File f = new File(filename);

        if(f.exists()){
            System.out.println(filename + "  already exists");
        }
        else{
            try{
                f.createNewFile();
                System.out.println(filename + " created");	
            }catch(IOException e){
                System.out.println("Issue = "+ e);
        }
    }
    }
}