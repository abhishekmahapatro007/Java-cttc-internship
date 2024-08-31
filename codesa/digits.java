import java.util.Scanner;
class digits{
public static int firstdigit(int n){
return n/100;
}
public static int seconddigit(int n){
n=n/10;
return n%10;
}
public static int thirddigit(int n){
return n%10;
}
public static int sum(int n){
return firstdigit(n)+seconddigit(n)+thirddigit(n);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 3 digit number :)");
int n=sc.nextInt();
System.out.println("The first,second and third digit of a the given 3 digit number is "+firstdigit(n)+","+seconddigit(n)+" & "+thirddigit(n)+" respectively");
System.out.println("The sum of all the given digits of the given 3 digit number is "+ sum(n));
}
}