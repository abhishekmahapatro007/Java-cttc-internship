import java.awt.*;
import java.applet.*;
import java.util.concurrent.*;
public class Horse extends Applet
{
    Image img;
    AudioClip a1;
    public void init()
      {
         a1=getAudioClip(getCodeBase(),"dame-tu-cosita.au");
       
         img=getImage(getCodeBase(),"200.gif");
      }
  public void start()
      {  
         a1.loop();
      }
  public void stop()
      {
         a1.stop();
      }
  public void paint(Graphics gr)

      {
         try
           {
              for(int a=0;a<=1350;a++)
	         {
		     TimeUnit.MILLISECONDS.sleep(10);
		     gr.drawImage(img,a,0,this);
                 }
           }catch(Exception e)
              {
                 System.out.println(e);
              }
      }
}



