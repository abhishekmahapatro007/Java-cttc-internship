import java.util.Scanner;
class prime{
public static boolean isPrime(int n){
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;}}
if(count==2){
System.out.println("Given number is prime");
return true;}
else{
System.out.println("Given number is composite");
return false;}}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:-");
int n=sc.nextInt();
System.out.println(isPrime(n));
}
}
