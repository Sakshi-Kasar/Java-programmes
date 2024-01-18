sakshi
import java.util.*;
class dmd extends Thread
{
    
      dmd()
    {
       start();
     }
    public void run()   
{
   try
{
   for(char i='Z';i>='A';i--)
{
    
   System.out.print(i+ " ");
    sleep(2000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String arg[])
{
   new dmd();
}
}
