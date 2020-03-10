//Design an applet with 2 buttons which if clicked will change background
//of applet

import java.applet.*;
import java.awt.*;	//Color,Button classes in this package

import java.awt.event.*;	//ActionEvent and ActionListener

/*<applet code="Prog90.class" width="500" height="500"></applet>*/

public class Prog90 extends Applet
{
	Button btnred,btnblue;
	
	public void init()
	{
		//create objects of button
		
		btnred = new Button("Red");	//"Red" is caption of button
		btnblue = new Button("Blue");
		
		//add button to applet interface
		add(btnred);
		add(btnblue);
		
		//delegate the events generated by buttons
		
		BtnHandler list_obj = new BtnHandler();
		btnred.addActionListener(list_obj);
		btnblue.addActionListener(list_obj);
	}
	/* the listener object class has to be inner class(nested) so that it can 
	access the outer class members*/
	
	class BtnHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			//check which button is clicked
			if(ae.getSource() == btnred)
				setBackground(Color.RED);
			else
				setBackground(Color.BLUE);
		}
	}
}
