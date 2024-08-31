import java.util.Scanner;
class even{
public static boolean isEven(int n){
if(n%2==0){
System.out.println("the number is even");
return true;}
System.out.println("the number is odd");
return false;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Check if the given number is even or odd?");
int n=sc.nextInt();
System.out.println(isEven(n));
}
}