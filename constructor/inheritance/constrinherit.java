import java.util.*;
class father{

father(int r,int h){
double ar=2*(3.14)*r*h;
System.out.println("The surface area of the cylinder is "+ar);
}}

class son extends father{
double volume(int r,double h){
double vol=(3.14)*r*r*h;
return vol;}
}
class constrinherit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of cylinder");
int r=sc.nextInt();
System.out.println("Enter the hieght of cylinder");
int h=sc.nextInt();
System.out.println("Enter the hieght of cylinder");
double h=sc.nextDouble();
son xd=new son();
System.out.println("The volume of the cylinder is "+xd.volume(r,h));
}
}
