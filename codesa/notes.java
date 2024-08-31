import java.util.Scanner;
class notes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//int note500=0,note200=0,note100=0,note50=0,note20=0,note10=0,note5=0,note2=0,note1=0;
System.out.println("Enter the amount");
int amt=sc.nextInt();
if(amt==500){
note500=amt/500;
amt-=note500*500;}
if(amt==200){
note200=amt/200;
amt-=note200*200;}
if(amt==100){
note100=amt/100;
amt-=note100*100;}
if(amt==50){
note50=amt/50;
amt-=note50*50;}
if(amt==20){
note20=amt/20;
amt-=note20*20;}
if(amt==10){
note10=amt/10;
amt-=note10*10;}
if(amt==5){
note5=amt/5;
amt-=note5*5;}
if(amt>=2){
note2=amt/2;
amt-=note2*2;}
if(amt==1){
 note1=amt;}
System.out.println("The number of notes in "+amt +" is");
System.out.println("The number of 500 notes are "+ note500);
System.out.println("The number of 200 notes are "+ note200);
System.out.println("The number of 100 notes are "+ note100);
System.out.println("The number of 50 notes are "+ note50);
System.out.println("The number of 20 notes are "+ note20);
System.out.println("The number of 10 notes are "+ note10);
System.out.println("The number of 5 notes are "+ note5);
System.out.println("The number of 2 notes are "+ note2);
System.out.println("The number of 1 note are "+ note1);
}
}
