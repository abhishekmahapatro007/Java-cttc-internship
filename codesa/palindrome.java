 import java.util.*;
class palindrome{
public static boolean isPal(String n){
int count=0;
for(int i=0;i<n.length()/2;i++){
for(int j=n.length()-1;j>n.length()/2;j--){
if(n.charAt(i)==n.charAt(j)){
 count++;}}}
if(count==n.length()/2){
System.out.println("The given string is a palindrome");
return true;}
else{
System.out.println("The given string is not a palindrome");
return false;}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string u wanna check");
String n=sc.next();
isPal(n);
}
}
