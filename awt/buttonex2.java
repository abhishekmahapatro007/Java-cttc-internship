import java.awt.*;
class buttonex2 extends Frame
{
buttonex2(String s,int h,int w)
{
setTitle(s);
setSize(h,w);
setVisible(true);
}
public static void main(String ar[])
{
buttonex2 f1=new buttonex2("my first frame",400,400);
buttonex2 f2=new buttonex2("my second frame",400,400);

Button b1=new Button("clickme1");
f1.add(b1);
Button b2=new Button("clickme2");
f2.add(b2);
f1.setLayout(new FlowLayout());
f2.setLayout(new FlowLayout());
}
}