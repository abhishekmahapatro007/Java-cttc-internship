package ABHISHEK.packboi2.uwu;
import java.util.*;
public class perfect{
public void test3(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the perfect number");
int n=sc.nextInt();
int temp=n;
int sum=0;
for(int i=1;i<=n;i++){
if(n%i==0){
sum+=i;
}
}
if(sum==temp){
System.out.println("This is a perfect number");}
else{
System.out.println("This is a perfect number");}

}
}