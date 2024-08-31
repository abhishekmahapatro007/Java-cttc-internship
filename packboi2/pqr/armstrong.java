package ABHISHEK.packboi2.pqr;
import java.util.*;
public class armstrong{
public void test1(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the armstrong number");
int n=sc.nextInt();
int temp=n;
int sum=0;
while(n!=0){
int x=n%10;
sum+=Math.pow(x,3);
n=n/10;}
if(sum==temp){
System.out.println("It is an armstrong number ");}
else{
System.out.println("It is  not an armstrong number ");}
}
}