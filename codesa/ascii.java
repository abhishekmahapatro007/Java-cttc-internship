import java.util.Scanner;
class ascii{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char x=sc.next().charAt(0);
if((x>='a' && x<='z') ||(x>='A' && x<='Z')){
System.out.println("The given character is an alphabet");}
else if(x>='0' && x<='9'){
System.out.println("The given character is a digit");}
else{System.out.println("The given character is a special character");}
}
}