class twodarray{
public static void main(String[] args){
for(int i=0;i<18;i++){
for(int j=0;j<18;j++){
if(i>=j){
System.out.print("*");}
else{
System.out.print("+");}
}System.out.println();
}
for(int i=0;i<18;i++){
for(int j=0;j<18;j++){
if(i<=j){
System.out.print("*");}
else{
System.out.print("+");}
}System.out.println();
}
System.out.println("\n");
for(int i=0;i<9;i++){
for(int j=0;j<9;j++){
if(i>=j){
System.out.print("*");}
else{
System.out.print(" ");}
}System.out.println();
}
}
}