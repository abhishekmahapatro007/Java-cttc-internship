import java.util.Scanner;
class factor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.println(i+" is a factor of n");}
}
int x=0;
for(int i=1;i<=n;i++){
if(n%i==0){
x++;}
}System.out.println(n+" have "+x+" factors");











}}