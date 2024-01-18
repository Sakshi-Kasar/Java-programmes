sakshi
 class A1 extends Thread
{
 A1()
{
  start();
}
public void run()
{
try
{
  for(int i=0;i<5;i++)
  System.out.println(i);
}
catch(Exception e)
{
}

}

public static void main(String arg[])
{
new A1();
}

}

   
  
  