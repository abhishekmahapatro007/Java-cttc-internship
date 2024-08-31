import java.util.*;
class number1{
public static int first(int n){
return n/100;}
}
class number2 extends number1{
public static int second(int n){
n=n/10;
return n%10;}
}
class number3 extends number1{
public static int third(int n){
return n%10;}
}
class sum {
public static double summ(int n){
int summation=0;
while(n>0){
summation+=n%10;
n=n/10;}
return summation;}
}
class digisum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 3 digit number as the input");
int n=sc.nextInt();
number2 ob=new number2();
number3 xd=new number3();
sum yt=new sum();
System.out.println("The first digit of given 3-digit number is "+ob.first(n));
System.out.println("The second digit of given 3-digit number is "+ob.second(n));
System.out.println("The third digit of given 3-digit number is "+xd.third(n));
System.out.println("The sum of all the digits is "+yt.summ(n));
}
}
