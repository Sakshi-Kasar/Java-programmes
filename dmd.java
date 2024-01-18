class demo extends Thread
{
 demo()
{
  start();
}
 public void run()
{
  for(int i=0;i<5;i++)
  System.out.println("A of i="+i);
}
}

class demo1 extends Thread
{
 demo1()
{
  start();
}
 public void run()
{
  for(int i=0;i<5;i++)
  System.out.println("B of i="+i);

}

public static void main(String arg[])
{
  new demo();
 new demo1();
}

}
