sakshi.....
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class d1 extends JFrame implements ActionListener,Runnable

{
	Button b1,b2;
	TextField t1;
	Thread th=new Thread(this);
      d1()
      {
    	 
    	  setSize(500,500);
    	  setLayout(new FlowLayout());
    	  setVisible(true);
    	  TextField t1=new TextField();
    	  Button b1=new Button("start");
    	  Button b2=new Button("stop");
    	  add(t1);
    	  add(b1);
    	  add(b2);
    	  b1.addActionListener(this);
    	  b2.addActionListener(this);
      }
	
	
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
		if(ae.getSource()==b1)
		{
			th.start();
			
		}
		if(ae.getSource()==b2)
		{
			th.stop();
		}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(this,"error="+e);
		}
		
	}
	public void run()
	{
                           try{
		for(int i=0;i<=100;i++)
		{
		
			t1.setText(""+i);	
			
		}
                             }catch(Exception  e){}
	
	}
	public static void main(String arg[])

	{
		new d1();
	}
	

}
