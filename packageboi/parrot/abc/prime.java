package ABHISHEK.packageboi.parrot.abc;
import java.util.Scanner;
public class prime{
public static boolean isPrime(int n){
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;}
}
if(count==2){
System.out.println("Given number is prime");
return true;}
else{
System.out.println("Given number is composite");
return false;}
}
}