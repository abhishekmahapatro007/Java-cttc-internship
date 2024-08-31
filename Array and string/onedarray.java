import java.util.*;
class onedarray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();}
System.out.println("The array is ");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");}

}
}