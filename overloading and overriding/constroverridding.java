import java.util.*;
class oops{
oops(int a,int b){
System.out.println("The numbers entered are "+a +" & "+b);
}
}
class javaxd extends oops{
javaxd(int x,int y,int a,int b){
super(a,b);
System.out.println("The numbers entered are "+x+" & "+y);
}
}
class constroverridding{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers required for parent and child constructors");
int x=sc.nextInt();
int y=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
javaxd br=new javaxd(x,y,a,b); 

}
}