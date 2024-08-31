import java.util.Scanner;
class result{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks");
int m=sc.nextInt();
if(m>=90 && m<=100){
System.out.println("outstanding");}
else if(m>=90 && m<=100){
System.out.println("excellent");}
else if(m>=80 && m<90){
System.out.println("very good ");}
else if(m>=70 && m<80){
System.out.println("good");}
else if(m>=60 && m<70){
System.out.println("bad");}
else{System.out.println("fail");}
}
}