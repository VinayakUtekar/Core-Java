import java.io.*;
class CopyBinaryData{
    public static void main(String args[]){
        Console c = System.console();

        String srcfilename = c.readLine("Enter SRC filename : ");
        File srcf = new File(srcfilename);

        if(srcf.exists()){
            try{
                String destfilename = c.readLine("Enter DEST filename : ");
                File destf = new File(destfilename);
                
                FileInputStream fis = new FileInputStream(srcf);
                BufferedInputStream bis = new BufferedInputStream(fis);
                
                FileOutputStream fos = new FileOutputStream(destf);
                BufferedOutputStream bos = new BufferedOutputStream(fos);

                int len = bis.read(); //readbytes
                while(len != -1){
                    bos.write(len);
                    len = bis.read();
                }
                bis.close();
                bos.close();
            }catch(IOException e){
                System.out.println("Issues : " + e);
            }
        }
        else{
            System.out.println("File does not exists");
        }
    }
}