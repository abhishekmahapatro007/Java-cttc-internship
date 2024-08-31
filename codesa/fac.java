import java.util.Scanner;
class fac{
long factorial(int n){
int prod=1;
for(int i=1;i<n+1;i++){
prod=prod*i;}
return prod;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
fac nom=new fac();
System.out.println(nom.factorial(n));

}
}