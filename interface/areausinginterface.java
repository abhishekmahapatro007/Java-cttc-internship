import java.util.*;
interface op1{
double area(int r,int h);
}
interface op2{
double peri(double rad);
}
class mainop implements op1,op2{
public double area(int r,int h){
double area=2*(3.14)*r*h;
return area;}
public double peri(double rad){
double perimeter=2*(3.14)*rad;
return perimeter;}
}
class areausinginterface{
public static void main(String[] args){
mainop xd=new mainop();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius and height of cylinder");
int r=sc.nextInt();
int h=sc.nextInt();
System.out.println("The surface area of given cylinder is "+xd.area(r,h));
System.out.println("Enter the radius of the circle");
double rad=sc.nextDouble();
System.out.println("The perimeter of given circle is "+xd.peri(rad));


}
}                                                                                                                                                                                                                                                                                                                                                                                                                                 