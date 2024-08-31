import java.util.Scanner;
class validtriangle{
public static boolean side(int a,int b,int c){
if(a+b>c || a+c>b || b+c>a){
return true;}
return false;}
public static boolean angle(int x,int y,int z){
if(x+y+z==180){
return true;}
return false;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  three side lengths of the triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("Enter the  three angles of the triangle in degrees");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(side(a,b,c)==true && angle(x,y,z)==true){
System.out.println("This is a valid mathematical triangle");}
else{
System.out.println("This is not a valid mathematical triangle");}
}
}