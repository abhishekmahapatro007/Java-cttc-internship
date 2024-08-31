interface wild{//all methods in interface will be abstract
void show();
void enter();
}
class dom implements wild{
public void show(){
System.out.println("Hello world");}
public void enter(){
System.out.println("Java is fun hehe");}
}
interface utopia extends wild{
void display();
}
class interfacehehe{
public static void main(String[] args){
dom xd=new dom();
xd.show();
xd.enter();


}
}