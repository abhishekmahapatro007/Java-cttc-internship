import java.util.Scanner;
class alphabet{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character to be checked");
char x=sc.next().charAt(0);
if((x>='a' && x<='z') ||(x>='A' && x<='Z')){
System.out.println("The given character is an alphabet");}
else{
System.out.println("The given character is not an alphabet");}
}
}