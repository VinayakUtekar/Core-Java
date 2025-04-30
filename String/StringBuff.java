import java.io.*;
class StringBuffRead{
public static void main(String args[]){
Console c = System.console();
StringBuffer sb = new StringBuffer(c.readLine("Enter the string : "));

System.out.println(sb);


for(int i=0; i < sb.length() ; i++){
	System.out.println(sb.charAt(i));
}

}
}