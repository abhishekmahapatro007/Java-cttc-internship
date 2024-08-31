import java.util.Scanner;
class exam{
public static boolean result(int marks){
if(marks>=60){
System.out.println("pass");
return true;}
return false;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks");
int marks=sc.nextInt();
result(marks);
}
}