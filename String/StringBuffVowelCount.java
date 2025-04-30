import java.io.*;
class StringBuffVoelCount{
    public static void main(String args[]){
        Console c = System.console();
        StringBuffer sb = new StringBuffer(c.readLine("Enter the string : "));
        System.out.println("String= "+sb);

        int vc=0,cc=0;
        for(int i=0; i < sb.length() ; i++){
            char ch = sb.charAt(i);
            if (Character.isLetter(ch)){
                if (ch =='a' | ch =='e' | ch =='i' | ch =='o' | ch =='u'|
                    ch =='A' | ch =='E' | ch =='I' | ch =='O' | ch =='U') 
                    vc++;
                else cc++;
            }
        }
        System.out.println("vowel count ="+vc+ " constant count = "+cc);

    }
}