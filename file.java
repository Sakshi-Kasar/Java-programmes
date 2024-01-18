import java.util.*;
import java.io.*;
class file11 extends Thread
{
   String fname,msg;
   Thread t1;
file11(String fname,String msg)
{
    this.fname=fname;
     this.msg=msg;
    t1=new Thread(this);
    t1.start();
}

public   void  run()
{
     try
{
       FileReader f1=new FileReader(fname);
       BufferedReader br=new BufferedReader(f1);
       String s1=" ";
       int cnt=0;
       while((s1=br.readLine())!=null)
{  
        cnt++;
       if(s1.equals(msg))
{
      
       System.out.println("found at line= "+cnt);
       System.out.println("file name="+fname);
}
}
}catch(Exception  e)
{
}

}
public static void main(String arg[])
{
//  System.out.println("enter directory name");
//  Scanner sc=new Scanner(System.in);
//  String fn=sc.next();
try
{
 File f1=new File("d:\\adv_java");
 String s1[ ]=f1.list();
 int n=s1.length;
 file11 ob[]=new file11[n];
  for(int i=0;i<s1.length;i++)
{
   ob[i]=new file11(s1[i],"sakshi");
   ob[i].t1.join();
   
 }
}
catch(Exception e)
{
}

}

}



  