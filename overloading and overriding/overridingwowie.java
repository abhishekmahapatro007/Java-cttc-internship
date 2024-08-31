import java.util.*;
class cow{
void cast(int a,int b){
System.out.println("the cow is of type "+a +" and of expt "+b);}
}
class calf extends cow{
void cast(int x,int y){
super.cast(x,y);
System.out.println("the calf is of type "+x +" and of expt "+y);}
}
class overridingwowie{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the type and expt no of cow and the calf");
int x=sc.nextInt();
int y=sc.nextInt();
calf jk=new calf();
jk.cast(x,y);
}
}
