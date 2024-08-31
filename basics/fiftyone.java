import java.util.Scanner;
class fiftyone{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
if(n%5==0 && n%11==0){
System.out.println("This is the desired input");}
else{
System.out.println("This number don't fulfill the conditions");}
}
}