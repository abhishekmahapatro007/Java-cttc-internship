import java.util.*;
class strong{
public static long fac(int n){
int prod=1;
for(int i=1;i<=n;i++){
prod=prod*i;}
return prod;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int temp=a;
int sum=0;
while(a!=0){
int x=a%10;
sum+=fac(x);
a=a/10;
}
if(sum==temp){
System.out.println("This is a strong number");}
else{
System.out.println("This is not a strong number");}

}
}