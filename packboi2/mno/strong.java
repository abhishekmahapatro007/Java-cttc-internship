package ABHISHEK.packboi2.mno;
import java.util.*;
public class strong{

public static void test2(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int fact,sum=0,r;
while(n!=0)
{
	r=n%10;
	fact=1;
	for(int i=1;i<=r;i++)
	{
		fact=fact*i;
	}
	n=n/10;
	sum=sum+fact;
}
if(sum==temp){
System.out.println("This is a strong number");}
else{
System.out.println("This is not a strong number");}

}
}