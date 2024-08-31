import java.util.*;
class throwsxd{
public static void main(String[] args){
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
if(b==0)
throw(new ArithmeticException());
int c=a/b;
System.out.println("The quotient of given numbers is "+c);}
catch(ArithmeticException r){
System.out.println("The 2nd number can't be zero");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("You need exactly two arguments for this operation");}
}
}