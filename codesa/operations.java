import java.util.*;
class operations{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the Second number");
int b=sc.nextInt();
System.out.println("enter the operator");
char op=sc.next().charAt(0);
switch(op){
case  '+':  System.out.println("The sum of 2 numbers are "+(a+b));break;
case  '-':  System.out.println("The difference of 2 numbers are "+(a-b));break;
case  '*':  System.out.println("The product of 2 numbers are "+(a*b));break;
case  '/':  System.out.println("The quotient of 2 numbers are "+(a/b));break;}
}
}