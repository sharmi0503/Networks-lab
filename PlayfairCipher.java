import java.awt.Point;  
import java.util.Scanner;  
public class PlayfairCipher  
{  
 
private int length = 0;  
 
private String [][] table;  
//main() method to test Playfair method  
public static void main(String args[])  
{  
PlayfairCipher pf = new PlayfairCipher();  
}  
 
private PlayfairCipher()  
{  

System.out.print("Enter the key for playfair cipher: ");  
Scanner sc = new Scanner(System.in);  
String key = parseString(sc);  
while(key.equals(""))  
key = parseString(sc);  
table = this.cipherTable(key);  
 
System.out.print("Enter the plaintext to be encipher: ");  
//System.out.println("using the previously given keyword");  
String input = parseString(sc);  
while(input.equals(""))  
input = parseString(sc);  
 
String output = cipher(input);  
String decodedOutput = decode(output);  
 
this.keyTable(table);  
this.printResults(output,decodedOutput);  
}  
 
private String parseString(Scanner sc)  
{  
String parse = sc.nextLine();  
 
parse = parse.toUpperCase();  
 
parse = parse.replaceAll("[^A-Z]", "");  
 
parse = parse.replace("J", "I");  
return parse;  
}  
