package AppletDemo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;

public class CalculatorDemo extends Applet {
	
	public void init()
	{
		TextField t=new TextField();
		add(t);
		t.setBounds(20, 20, 300, 200);
		
		Button bt1=new Button("7");
		add(bt1);
		bt1.setBounds(20, 240, 80, 40);
		

		Button bt2=new Button("8");
		add(bt2);
		bt2.setBounds(100, 240, 80, 40);
		

		Button bt3=new Button("9");
		add(bt3);
		bt3.setBounds(180, 240, 80, 40);
		
		Button bt13=new Button("DEL");
		add(bt13);
		bt13.setBounds(260, 240, 60, 40);
		
		
		
		Button bt4=new Button("4");
		add(bt4);
		bt4.setBounds(20, 300, 80, 40);
		

		Button bt5=new Button("5");
		add(bt5);
		bt5.setBounds(100, 300, 80, 40);
		

		Button bt6=new Button("6");
		add(bt6);
		bt6.setBounds(180, 300, 80, 40);
		
		Button bt14=new Button("%");
		add(bt14);
		bt14.setBounds(260, 285, 60, 40);
		
		
		
		Button bt7=new Button("1");
		add(bt7);
		bt7.setBounds(20, 360, 80, 40);
		

		Button bt8=new Button("2");
		add(bt8);
		bt8.setBounds(100, 360, 80, 40);
		

		Button bt9=new Button("3");
		add(bt9);
		bt9.setBounds(180, 360, 80, 40);
		
		Button bt15=new Button("*");
		add(bt15);
		bt15.setBounds(260, 330, 60, 40);
	
		
		
		Button bt10=new Button(".");
		add(bt10);
		bt10.setBounds(20, 420, 80, 40);
		

		Button bt11=new Button("0");
		add(bt11);
		bt11.setBounds(100, 420, 80, 40);
		

		Button bt12=new Button("=");
		add(bt12);
		bt12.setBounds(180, 420, 80, 40);
		
		Button bt16=new Button("-");
		add(bt16);
		bt16.setBounds(260, 375, 60, 40);
		
		Button bt17=new Button("+");
		add(bt17);
		bt17.setBounds(260, 420, 60, 40);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		setLayout(null);
		setSize(500,500);
	}
	
	public void paint(Graphics g)
	{
		
	}

}
