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
class bro extends daddy{
double each(int r,int h){
double face=(3.14)*r*r;
return face;}} 

class heirarchical{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of cylinder");
int r=sc.nextInt();
System.out.println("Enter the hieght of cylinder");
int h=sc.nextInt();
son xd=new son();
bro nc=new bro();
System.out.println("The surface area of given cylinder is "+xd.area(r,h));//u can call parents function using any child class in heirarchical inheritance
System.out.println("The volume of given cylinder is "+xd.volume(r,h));
System.out.println("The surface area of given cylinder is "+nc.area(r,h));
System.out.println("The area of each side of given cylinder is "+nc.each(r,h));
}
}
