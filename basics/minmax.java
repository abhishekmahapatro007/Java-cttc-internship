import java.util.Scanner;
class minmax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number u wanna check");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("The minimum among the two is "+Math.min(a,b)+" and the maximum among the two is "+Math.max(a,b));
}
}