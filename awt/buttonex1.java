import java.awt.*;
class buttonex1
{
public static void main(String ar[])
{
Frame f=new Frame();
f.setTitle("my first frame");
f.setSize(400,400);
f.setVisible(true);
Button b1=new Button("clickme1");
f.add(b1);
Button b2=new Button("clickme2");
f.add(b2);
f.setLayout(new FlowLayout());
}
}