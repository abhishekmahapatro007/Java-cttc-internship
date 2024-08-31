import java.awt.*;
import java.awt.event.*;
class frameclose 
{
public static void main(String ar[])
{
Frame f=new Frame();
f.setTitle("my first frame");
f.setSize(400,400);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);
	}

}
);
}
}