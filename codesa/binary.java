import java.util.Scanner;
class binary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the decimal number");//decimal to binary
int n=sc.nextInt();
int[] a=new int[8];
int i=0;

while(n>0){
int x=n%2;
a[i++]=x;
n=n/2;}
 
for(int k=i-1;k>=0;k--){
System.out.print(a[k]);}

System.out.println();

System.out.println("Enter the binary number");// binary to decimal
int y=sc.nextInt();
double res=0;
int j=0;
while(y!=0){
int x=y%10;
res=res+(x*Math.pow(2,j));
j++;
y=y/10;
}System.out.println(res);
}
}