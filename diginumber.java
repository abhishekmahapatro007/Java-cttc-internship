import java.util.*;
class diginumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit u want to check");
long n=sc.nextInt();
int nom=0;
while(n>0){
long x=n%10;
if(x>=0){
nom++;}
n=n/10;}
System.out.println("The given number contains "+nom+" digits");
}
}