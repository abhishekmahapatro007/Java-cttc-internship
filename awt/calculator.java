import java.awt.*;
import java.awt.event.*;
import java.util.*;
class calculator
{
public static void main(String ar[])
{
Frame f=new Frame();
f.setTitle("my first frame");
f.setSize(200,200);
f.setVisible(true);
Button b1=new Button("sum");
Button b2=new Button("sub");
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
b1.addActionListener(new sumcal());
b2.addActionListener(new subcal());
}
}
class sumcal implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("ohh!!!you want to perform addition....Then,");
System.out.println("enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("sum is:"+c);
}
}
class subcal implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("ohh!!!you want to perform subtraction....Then,");
System.out.println("enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=a-b;
System.out.println("sub is:"+c);
}
}