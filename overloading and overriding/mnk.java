import java.util.Scanner;
abstract class shape{
abstract double area(int y);
}
class square extends shape{
public double area(int s){
double area1=Math.pow(s,2);
return area1;
}
}
class circle extends shape{
public double area(int r){
double area2=3.14*Math.pow(r,2);
return area2;
}
}
class mnk{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of one side of square");
int s=sc.nextInt();
square xd=new square();
System.out.println("The area of square is "+xd.area(s));
System.out.println("Enter the radius of circle");
int r=sc.nextInt();
circle x=new circle();
System.out.println("The area of circle is "+x.area(s));
}
}