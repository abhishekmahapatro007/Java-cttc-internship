import java.util.Scanner;
class case2{
int r,h;
double vol;
Scanner sc=new Scanner(System.in); 
case2(){
System.out.println("Enter the radius and height of cylinder");
 r=sc.nextInt();
 h=sc.nextInt();
ip();                    //calling a method inside constructor without using object
}
void ip(){
vol=3.14*r*r*h;
System.out.println("The volume of cylinder is "+vol);
}
}
class mainjava1{
public static void main(String[] args){
case2 ob=new case2();



}
}