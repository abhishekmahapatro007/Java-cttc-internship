import java.awt.*;
class frameex3 extends Frame
{
frameex3(String s,int h,int w)
{
setTitle(s);
setSize(h,w);
setVisible(true);
}
public static void main(String ar[])
{
frameex3 f1=new frameex3("my first frame",400,400);
frameex3 f2=new frameex3("my second frame",300,300);
frameex3 f3=new frameex3("my third frame",200,200);
frameex3 f4=new frameex3("my fourth frame",100,100);
}
}