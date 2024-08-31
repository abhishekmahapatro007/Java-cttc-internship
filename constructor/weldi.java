import java.util.Scanner;
class parameter{
int a,b,c;
parameter(int m,int n){
a=m;
b=n;
c=a+b;
System.out.println("The result is "+c);}

void sum(int a,int b){
c=a+b;
System.out.println("The result is "+c);}
}
class weldi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter m");
int m=sc.nextInt();
System.out.println("enter n");
int n=sc.nextInt();
parameter obj=new parameter(m,n);
obj.sum(m,n);
}
}

