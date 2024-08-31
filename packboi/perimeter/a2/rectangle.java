package ABHISHEK.packboi.perimeter.a2;
import java.util.*;
public class rectangle{
public void peri1(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length and breadth of rectangle");
int a=sc.nextInt();
int b=sc.nextInt();
int peri=2*(a+b);
System.out.println("Perimeter of rectangle is "+peri);
}
}