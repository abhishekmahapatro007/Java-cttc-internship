import java.util.Scanner;
class circle{
public static double perimeter(double r){
double perimeter=2*(3.14)*r;
return perimeter;}
public static double area(double r){
double Area=(3.14)*Math.pow(r,2);
return Area;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
double r=sc.nextDouble();
System.out.println("The area and perimeter of given circle is "+area(r)+" & "+perimeter(r));
}
}