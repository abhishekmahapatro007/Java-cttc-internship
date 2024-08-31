import java.util.Scanner;
class defaultform{
int r,h;
double vol;
Scanner sc=new Scanner(System.in); 
defaultform(){         //using only constructor
System.out.println("Enter the radius and height of cylinder");
 r=sc.nextInt();
 h=sc.nextInt();
vol=3.14*r*r*h;
System.out.println("The volume of cylinder is "+vol);
}
}
class lecture{
public static void main(String[] args){
defaultform ob=new defaultform();
//even if u dont need object to call the constructor,u still need to declare it so that you can call constructor automatically

}
}