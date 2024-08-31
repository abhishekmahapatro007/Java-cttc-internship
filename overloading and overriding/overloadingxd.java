import java.util.*;
class lion{
void show(int a,int b){
System.out.println("value of a & b is "+a+" & "+b);}
void show(double x,double y){
System.out.println("value of x & y is "+x+" & "+y);}
}
class overloadingxd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b in int");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter the value of x and y in double");
double x=sc.nextDouble();
double y=sc.nextDouble();
lion op=new lion();
op.show(a,b);
op.show(x,y);
}
}