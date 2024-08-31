import java.util.Scanner;
class triangletype{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  three side lengths of the triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a==b && a==c && b==c){
System.out.println("This is an equilateral triangle");}
else if(a==b || a==c || b==c){
System.out.println("This is an isosceles triangle");}
else{
System.out.println("This is an scalene triangle");}
}
}
