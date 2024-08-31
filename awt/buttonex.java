import java.awt.*;
import java.awt.event.*;
class buttonex
{
public static void main(String ar[])
{
Frame f=new Frame();
f.setTitle("my first frame");
f.setSize(400,400);
f.setVisible(true);
Button b1=new Button("clickme1");
Button b2=new Button("clickme2");
f.add(b1);
f.add(b2);
f.setLayout(new FlowLayout());
f.addWindowListener(new WindowAdapter()
{
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);
	}

}
);
b1.addActionListener(new kite());
b2.addActionListener(new lion());
}
}
class kite implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
System.out.println("hello friends!!!");
}
}
class lion implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
System.out.println("hii friends!!!");
}
}