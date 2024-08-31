package ABHISHEK.packboi.perimeter.a2;
import java.util.*;
public class triangle{
public void peri2(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sides of the triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double peri=a+b+c;
System.out.println("The perimeter of given triangle is "+peri);
}
}