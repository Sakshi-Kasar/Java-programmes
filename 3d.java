sakshi
import java.util.*;
class th1 extends Thread
{
      Thread t1;
     th1()
   {
   t1=new Thread(this);
   start();
   
   }
 
    public void run()
{
   Random rd=new Random();
   int n=rd.nextInt(10);
   if(n%2==0)
{
    even ob=new even(n);
}
   else
{
   odd ob1=new odd(n);
   }
}
}
class even extends Thread
{
   Thread t2;
  int n;
   even(int n)
{
    this.n=n;
    t2=new Thread(this);
    start();
 }
 public void run()
{
   System.out.println("square of n="+n+" "+n*n);
}
}
 
class odd extends Thread
{
   Thread t3;
  int n;
   odd(int n)
{
    this.n=n;
    t3=new Thread(this);
    start();
 }
 public void run()
{
   System.out.println("cube of n="+n+" "+n*n*n);
}
}
 class d
{
  public static void main(String arg[])
{
    new th1();
}
}

 
   
