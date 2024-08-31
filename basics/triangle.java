import java.util.*;
class triangle{
public static double area(double b,double h){
double area=0.5*b*h;
return area;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base of the triangle in metres");
double b=sc.nextDouble();
System.out.println("Enter the height of the triangle in metres");
double h=sc.nextDouble();
System.out.println("The area of the given triangle is "+ area(b,h));
}
}