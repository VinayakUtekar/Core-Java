import java.io.*;
class P3{
public static void main(String args[]){
Console c = System.console();
String str = c.readLine("Enter the string : ");

int lc=0,uc=0,dc=0,oc=0;

for(int i = 0; i< str.length();i++){
	char ch = str.charAt(i); //conversion of string to character at point i

	if (Character.isLowerCase(ch)) 
		lc++;
	else if (Character.isUpperCase(ch)) 
		uc++;
	else if (Character.isDigit(ch))  
		dc++;
	else 
		oc++;	
}
System.out.println("Number of Lower case : " + lc);	
System.out.println("Number of Upper case : " + uc);
System.out.println("Number of Digits : " + dc);
System.out.println("Number of Other Characters : " + oc);

}
}