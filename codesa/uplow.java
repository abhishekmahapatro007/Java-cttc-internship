import java.util.Scanner;
class uplow{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char x=sc.next().charAt(0);
if(x>='a' && x<='z'){
System.out.println("The given character is in lowercase");}
else if(x>='A' && x<='Z'){
System.out.println("The given character is in uppercase");}
else{
System.out.println("Wrong input");}
}
}