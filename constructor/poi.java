import java.util.*;
class surface{
int r,h;
double area;

surface(int rad,int hei){
r=rad;
h=hei;
area=2*(3.14)*r*h;
System.out.println("The surface area of cylinder is "+area);}

void area(int r,int h){
area=2*(3.14)*r*h;
System.out.println("The surface area of cylinder is "+area);}
}
class poi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius and height of cylinder");
int r=sc.nextInt();
int h=sc.nextInt();
surface ob=new surface(r,h);
ob.area(r,h);
}
}
