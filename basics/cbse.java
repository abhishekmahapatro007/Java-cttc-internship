import java.util.Scanner;
class cbse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks in physics,chemistry,biology,maths and computer out of 100");
int p=sc.nextInt();
int c=sc.nextInt();
int b=sc.nextInt();
int m=sc.nextInt();
int comp=sc.nextInt();
double percentage=(p+c+b+m+comp)/5;
if(percentage>=90){
System.out.println("Grade A");}
else if(percentage>=80){
System.out.println("Grade B");}
else if(percentage>=70){
System.out.println("Grade C");}
else if(percentage>=60){
System.out.println("Grade D");}
else if(percentage>=40){
System.out.println("Grade E");}
else{
System.out.println("Grade F");}
}
}
