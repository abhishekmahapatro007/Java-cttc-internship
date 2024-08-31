import java.util.Scanner;
class armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int sum=0;
while(n!=0){
int x=n%10;
sum+=Math.pow(x,3);
n=n/10;
System.out.println(x);}
if(sum==temp){
System.out.println("It is an armstrong number ");}
else{
System.out.println("It is  not an armstrong number ");}


}}