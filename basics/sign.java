import java.util.Scanner;
class sign{
public static void magnitude(int n){
if(n>0){
System.out.println("The given number is positive");}
else if(n==0){
System.out.println("The number is neither positive nor negative,it's zero");}
System.out.println("The given number is negative");}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter  the number to be checked");
int n=sc.nextInt();
magnitude(n);
}
}