import java.util.Scanner;
class roots{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("If ur eqn is in form ax2+bx+c,then enter a,b and c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double d=Math.pow(b,2)-4*a*c;
double r1=(-b+d)/2*a;
double r2=(-b-d)/2*a;
if(d<0){
System.out.println("the roots are imaginery");}
else if(d==0){
System.out.println("the roots are equal and real,roots are "+ r1+"&"+r2);}
else{
System.out.println("the roots are distinct and real,roots are "+ r1+"&"+r2);}
}
}