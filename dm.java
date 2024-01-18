 class A extends Thread
{
 A()
{
  start();
}
public void run()
{
  for(int i=0;i<5;i++)
  System.out.println(i);
}
public static void main(String arg[])
{
  A ob=new A();
}
}

   
  
  