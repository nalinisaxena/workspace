package AppletDemo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

public class AwtDemo extends Applet {
	
	public void init()
	{
		Button bt1=new Button("Login");
		add(bt1);
		
		
		
		Button bt2=new Button("Ok");
		add(bt2);
		
		Button bt3=new Button("Submit");
		add(bt3);
		
		bt1.setBackground(Color.cyan);
		bt2.setBackground(Color.red);
        bt3.setBackground(Color.yellow);
        
        setLayout(null);
        
        bt1.setBounds(40,40,80,40);	
        bt2.setBounds(150,40,80,40);		
        bt3.setBounds(250,40,80,40);
        
        TextField t=new TextField();
        add(t);
        t.setBounds(200,100, 150, 40);
        
        Label l2=new Label();
        l2.setBounds(100, 100, 100, 40);
        l2.setText("UserName");
        add(l2);
        
        Checkbox c1=new Checkbox("English",true);
        Checkbox c2=new Checkbox("Hindi");
        Checkbox c3=new Checkbox("Marathi");
        
        c1.setBounds(40, 200, 60,30);
        c2.setBounds(40, 240, 60, 30);
        c3.setBounds(40, 280, 60, 30);
        
        add(c1);
        add(c2);
        add(c3);
        
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c4=new Checkbox("Male",true,cg);
        Checkbox c5=new Checkbox("Female",false,cg);
        Checkbox c6=new Checkbox("Other",false,cg);
        
        c4.setBounds(40,350, 60, 30);
        c5.setBounds(40,400, 60, 30);
        c6.setBounds(40,450, 60, 30);

        
        
        add(c4);
        add(c5);
        add(c6);
        
        
        List l=new List();
        l.add("pune");
        l.add("Mumbai");
        l.add("Nasik");
        l.add("Solapur");
        add(l);
        l.setBounds(40, 500, 80,60);
        
        Choice ch=new Choice();
        ch.add("Android");
        ch.add("Testing");
        ch.add("testing");
        add(ch);
        ch.setBounds(250, 500, 60, 30);
        	
	    setSize(800,800);
		
		
		
		
		
	}
	
	public void paint(Graphics g)
	{
		
	}

}
