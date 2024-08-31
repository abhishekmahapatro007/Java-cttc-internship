import java.util.Scanner;
class cylinder{
public static double volume(double r,double h){
double vol=(3.14)*r*h;
return vol;}
public static double surfaceArea(double r,double h){
double area=2*(3.14)*r*h;
return area;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the cylinder");
double r=sc.nextDouble();
System.out.println("Enter the height of the cylinder");
double h=sc.nextDouble();
System.out.println("The volume and surface area of cylinder is "+ volume(r,h)+" & "+ surfaceArea(r,h)+" respectively.");
}
}