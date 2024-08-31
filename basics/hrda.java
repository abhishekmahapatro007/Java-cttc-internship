import java.util.Scanner;
class hrda{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the HRA percentage");
int hra=sc.nextInt();
System.out.println("Enter the DA percentage");
int da=sc.nextInt();
System.out.println("Enter the salary");
int salary=sc.nextInt();
double ex=0.01*(hra*salary+da*salary);
double gross=salary+ex;
System.out.println("The gross salary is "+gross);
}
}