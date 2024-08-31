import java.util.*;
class daddy{
double area(int b,int h){
double ar=(0.5)*b*h;
return ar;}}

class son extends daddy{
double perimeter(int p,int q,int r){
double peri=p+q+r;
return peri;}
}
class triinherit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base of triangle");
int b=sc.nextInt();
System.out.println("Enter the hieght of triangle");
int h=sc.nextInt();
System.out.println("Enter the length of side of triangle");
int p=sc.nextInt();
int q=sc.nextInt();
int r=sc.nextInt();
son xd=new son();
System.out.println("The area of given triangle is "+xd.area(b,h));
System.out.println("The perimeter of given triangle is "+xd.perimeter(p,q,r));

}
}
