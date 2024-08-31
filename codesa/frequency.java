import java.util.Scanner;
class frequency{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int d;//mod digits
for(int i=0;i<10;i++){
int temp=n;
int count=0;
while(temp>0){
d=temp%10;
if(d==i){
count++;
}temp=temp/10;
}if(count>0){
System.out.println(i+" is repeating for "+count+" times");}}
}
}

