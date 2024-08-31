import java.util.Scanner;
class month{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month number");
int x=sc.nextInt();
switch(x){
case 1: System.out.println("JANUARY");break;
case 2: System.out.println("FEBRUARY");break;
case 3: System.out.println("MARCH");break;
case 4: System.out.println("APRIL");break;
case 5: System.out.println("MAY");break;
case 6: System.out.println("JUNE");break;
case 7: System.out.println("JULY");break;
case 8: System.out.println("AUGUST");break;
case 9: System.out.println("SEPTEMBER");break;
case 10: System.out.println("OCTOBER");break;
case 11: System.out.println("NOVEMBER");break;
case 12: System.out.println("DECEMBER");break;
default: System.out.println("OUT OF BOUNDS");}
if(x==1 || x==3 ||x==5||x==7||x==8||x==10||x==12){
System.out.println("Given month have 31 days");}
else if(x==2){
System.out.println("Given month have 28/29 days");}
else{
System.out.println("Given month have 30 days");}
}
}