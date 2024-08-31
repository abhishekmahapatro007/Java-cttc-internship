import java.util.*;
class Area{
public static double circle(double r){
double CircleArea=(3.14)*Math.pow(r,2);
return CircleArea;}

public static double square(double s){
double SquareArea=Math.pow(s,2);
return SquareArea;}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("For which shape,u wanna find the area? Press \"c\" for circle and \"s\" for square");
char X=sc.next().charAt(0);
if(X=='c'){
System.out.println("Enter the radius of circle");
double r=sc.nextDouble();
System.out.println("The area of the circle is "+ circle(r));}
else{
double s=sc.nextDouble();
System.out.println("The area of the square is "+ square(s));}
}
}