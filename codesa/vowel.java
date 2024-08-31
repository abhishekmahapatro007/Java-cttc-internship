import java.util.Scanner;
class vowel{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the test character");
char x=sc.next().charAt(0);
if(x=='a' || x=='A' || x=='e' || x=='E'  || x=='i' || x=='I'  || x=='o' || x =='O'  || x=='u' || x=='U'){
System.out.println("Given character is a vowel");}
else{
 System.out.println("Given character is a consonant");}
}
}