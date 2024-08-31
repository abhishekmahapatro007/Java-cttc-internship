class sum{
public static int sum(int [] a){
int sum=0;
for(int i=0;i<a.length;i++){
sum+=a[i];}
return sum;}

public static int sum(int a,int b){
int sum=a+b;
return sum;
}
public static void main(String [] args){
int[] arr={1,2,3,4,5};
System.out.println("The sum of the given array is "+sum(arr));
System.out.println(sum(7,14));

}
}