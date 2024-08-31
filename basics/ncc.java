import java.util.Scanner;
class ncc{
public static boolean eligibility(int weight,int height){
if(weight>=70 && height>=170){
System.out.println("You are eligible for NCC");
return true;}
System.out.println("You are not eligible for NCC");
return false;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your height");
int h=sc.nextInt();
System.out.println("Enter your weight");
int w=sc.nextInt();
eligibility(w,h);
}
}