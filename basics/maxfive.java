import java.util.Scanner;
class maxfive{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any five numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
if(a>b && a>c && a>d && a>e){
System.out.println(a+" is the greatest among all");}
else if(b>a && b>c && b>d && b>e){
System.out.println(b+" is the greatest among all");}
else if(c>a && c>b && c>d && c>e){
System.out.println(c+" is the greatest among all");}
else if(d>a && d>b && d>c && d>e){
System.out.println(d+" is the greatest among all");}
else if(e>a && e>b && e>d && e>c){
System.out.println(e+" is the greatest among all");}
else{
System.out.println("Input is wrong");}
}
}