import java.util.*;
class daddy{
double area(int r,int h){
double ar=2*(3.14)*r*h;
return ar;}}
class son extends daddy{
double volume(int r,int h){
double vol=(3.14)*r*r*h;
return vol;}
}
class gson extends son{
double each(int r,int h){
double face=(3.14)*r*r;
return face;}}

class single{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of cylinder");
int r=sc.nextInt();
System.out.println("Enter the hieght of cylinder");
int h=sc.nextInt();
gson xd=new gson();
System.out.println("The surface area of given cylinder is "+xd.area(r,h));
System.out.println("The volume of given cylinder is "+xd.volume(r,h));
System.out.println("The area of each side of given cylinder is "+xd.each(r,h));
}
}
