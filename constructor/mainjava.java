import java.util.Scanner;
class volcyl{
int r,h;
double vol;
Scanner sc=new Scanner(System.in);
volcyl(){
System.out.println("Enter the radius and height of cylinder");
 r=sc.nextInt();
 h=sc.nextInt();
}
void ip(){
vol=3.14*r*r*h;
System.out.println("The volume of cylinder is "+vol);
}
}
class mainjava{
public static void main(String[] args){
volcyl ob=new volcyl();
ob.ip();



}
}