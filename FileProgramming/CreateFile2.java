package FileProgramming;

import java.io.*;
class P2{
    public static void main(String args[]){
        Console c = System.console();
        String filename = c.readLine("Enter filename : ");
        File f = new File(filename);

        if(f.exists()){
                f.delete();
                System.out.println(filename + " deleted");		
        }
        else{
            System.out.println(filename + "  does not exists");	
        }
    }
}