class numbers{//all the perfect,strong and armstrong numbers
public static int fac(int n){
int prod=1;
for(int i=1;i<n+1;i++){
prod=prod*i;}
return prod;}
public static boolean isPerfect(int n){
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
return true;}
else{
return false;}}
public static boolean isStrong(int n){
int temp=n;
int sum=0;
for(int i=1;i<=n;i++){
if(n%i==0){
sum+=i;}}
if(sum==2*temp){
return true;}
else{
return false;}
}
public static void main(String[] args){
int n=10000;
System.out.println("list of perfect numbers");
for(int i=1;i<=n;i++){
if(isPerfect(i)){
System.out.println(i+" ");}}
System.out.println("list of strong numbers");
for(int i=1;i<=n;i++){
if(isStrong(i)){
System.out.print(i+" ");}}










}}








