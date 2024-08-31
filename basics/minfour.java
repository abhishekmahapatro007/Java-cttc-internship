import java.util.Scanner;
class minfour{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any four numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
if(a<b && a<c && a<d){
System.out.println(a+" is the smallest among all");}
else if(b<a && b<c && b<d ){
System.out.println(b+" is the smallest among all");}
else if(c<a && c<b && c<d ){
System.out.println(c+" is the smallest among all");}
else if(d<a && d<b && d<c){
System.out.println(d+" is the smallest among all");}
else{
System.out.println("Input is wrong");}
}
}