import java.util.Scanner;
class scholarship{
public static void main(String[] args){
int mathmarks,sciencemarks,age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks in maths");
mathmarks=sc.nextInt();
System.out.println("Enter your marks in science");
sciencemarks=sc.nextInt();
System.out.println("Enter your age");
age=sc.nextInt();
if(mathmarks>=90 || age>=60 || (sciencemarks>=75 && mathmarks>=75)){
System.out.println("You are eligible");}
else{
System.out.println("You are not eligible");}
}
}