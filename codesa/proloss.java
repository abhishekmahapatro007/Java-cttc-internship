import java.util.Scanner;
class proloss{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the cost price of the item");
int cp=sc.nextInt();
System.out.println("Enter the selling price of the item");
int sp=sc.nextInt();
int profit=sp-cp;
int loss=cp-sp;
if(cp==sp){
System.out.println("Neither profit nor loss");}
else if(sp>cp){
System.out.println("Profit of Rs."+ profit);}
else{
System.out.println("Loss of Rs."+ loss);}
}
}