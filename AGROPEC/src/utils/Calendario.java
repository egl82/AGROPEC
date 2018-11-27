package utils;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.toedter.calendar.JCalendar;

public class Calendario extends JFrame {
	
	public Calendario(){
		
		JCalendar calendario = new JCalendar(); 
		this.add(calendario);
		this.setLayout(new FlowLayout());
		this.setSize(250,250);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    
		
		
	}
	
	

}
