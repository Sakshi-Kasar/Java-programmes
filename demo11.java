import java.awt.*;
import java.applet.*;
public class demo11 extends Applet implements Runnable
{
    Thread th;
public void init()
{
   th=new Thread(this);
   th.start();

}
public void paint(Graphics g)
{
try
{
    th.sleep(1000);
    g.fillRect(100,100,20,200);
   th.sleep(1000);
    g.fillRect(140,100,20,200);
    th.sleep(1000);
    g.fillRect(180,100,20,200);
    th.sleep(1000);
   }catch(Exception e){}

}

   public void run()
{
  repaint();
  }
}
/*<applet code="demo11" width="500" height="500"></applet>
*/
