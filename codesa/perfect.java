import java.util.Scannerl; 
class perfect{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int sum=0;
while(n!=0){
int x=n%10;
n=n/10;
System.out.println(x);}
for(int i=1;i<=n;i++){
if(n%i==0){
sum+=i;}}
if(sum==temp){
System.out.println("It is a perfect number ");}
else{
System.out.println("It is  not a perfect number ");}
