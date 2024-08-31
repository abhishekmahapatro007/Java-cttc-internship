import java.util.Scanner;
class formula{
public static double exp1(int x,int y,int z,int m){
double res=((x*y)+(x+y)/(x*y*z))/m;
return res;}
public static double exp2(int m,int n,int o,int p){
double reso=((m*o*n*p)/(o+p+n))*m;
return reso;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Which expression u wanna execute?Press \"1\" to execute expression 1 and \"2\" to execute expression 2") ;
int k=sc.nextInt();
if(k==1){
System.out.println("Enter x");
int x=sc.nextInt();
System.out.println("Enter y");
int y=sc.nextInt();
System.out.println("Enter z");
int z=sc.nextInt();
System.out.println("Enter m");
int m=sc.nextInt();
System.out.println("The solution of expression 1 is "+exp1(x,y,z,m));}
else{
System.out.println("Enter m");
int m=sc.nextInt();
System.out.println("Enter n");
int n=sc.nextInt();
System.out.println("Enter o");
int o=sc.nextInt();
System.out.println("Enter p");
int p=sc.nextInt();
System.out.println("The solution of expression 2 is "+exp2(m,n,o,p));
}
}
}