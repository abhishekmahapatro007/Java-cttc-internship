import java.util.Scanner;
class bill{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double units,bill;
System.out.println("Enter the unit of electricity used");
units=sc.nextDouble();
if(units<=50){
bill=(0.5)*units;
System.out.println("Total electricity bill is Rs."+bill);
}
else if(units>50 && units<=150){
bill=(0.75)*units;
System.out.println("Total electricity bill is Rs."+bill);
}
else if(units>150 && units<=250){
bill=(1.20)*units;
System.out.println("Total electricity bill is Rs."+bill);
}
else{
bill=(1.50)*units;
System.out.println("Total electricity bill is Rs."+bill);}
}
}
