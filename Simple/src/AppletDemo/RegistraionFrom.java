package AppletDemo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class RegistraionFrom extends Applet {
	
	public void init()
	
	{
		   setLayout(null);
		    
		
		    Label l=new Label();
	        l.setBounds(150,15, 800, 80);
	        l.setText("Registraion Form For IOS Developer");
	        add(l);
	        Font ft=new Font("Red",Font.BOLD,30);
	        l.setFont(ft);
		
	        Label l1=new Label();
	        l1.setBounds(100,80,120, 70);
	        l1.setText("Developer Id:");
	        add(l1);
	        Font ft1=new Font("Red",Font.BOLD,14);
	        l1.setFont(ft1);
		   
	        
	        TextField t=new TextField();
	        add(t);
	        t.setBounds(180,95,140,30);
	        
	        Label sy=new Label();
	        sy.setBounds(700,80,120, 70);
	        sy.setText("Joining Year:");
	        add(sy);
	        sy.setFont(ft1);
	        
	        
	        Choice ch1=new Choice();
	        ch1.add("2013-2014");
	        ch1.add("2015-2016");
	        ch1.add("2017-2018");
	        add(ch1);
	        ch1.setBounds(820,100, 160, 30);
	        	
		   
	        
	        
	        
	        
	        Label l2=new Label();
	        l2.setBounds(100,150,120, 70);
	        l2.setText("First Name:");
	        add(l2);
            l2.setFont(ft1);
            
            
	        TextField t1=new TextField();
	        add(t1);
	        t1.setBounds(180,175,180,30);
	        
	        Label l5=new Label();
	        l5.setBounds(400,150,120, 70);
	        l5.setText("Middle Name:");
	        add(l5);
            l5.setFont(ft1);
            
            
	        TextField t4=new TextField();
	        add(t4);
	        t4.setBounds(470,175,180,30);
	        
	        
	        Label l6=new Label();
	        l6.setBounds(700,150,120, 70);
	        l6.setText("Last Name:");
	        add(l6);
            l6.setFont(ft1);
            
            
	        TextField t5=new TextField();
	        add(t5);
	        t5.setBounds(800,175,180,30);
	        
	        
	        
	        
	        Label l3=new Label();
	        l3.setBounds(100,250,120, 70);
	        l3.setText("Address:");
	        add(l3);
            l3.setFont(ft1);
            
            TextField t2=new TextField();
	        add(t2);
	        t2.setBounds(180,270,180,30);
	        
	        Label dob=new Label();
	        dob.setBounds(400,250,120, 70);
	        dob.setText("Date of Birth:");
	        add(dob);
            dob.setFont(ft1);
            
            TextField db=new TextField();
	        add(db);
	        db.setBounds(470,270,180,30);
	        
	        Label pob=new Label();
	        pob.setBounds(700,250,120, 70);
	        pob.setText("Place of Birth:");
	        add(pob);
            pob.setFont(ft1);
            
            TextField pb=new TextField();
	        add(pb);
	        pb.setBounds(700,270,280,30);
	        
	        
	        Label l4=new Label();
	        l4.setBounds(100,350,120, 70);
	        l4.setText("Age:");
	        add(l4);
            l4.setFont(ft1);
            
            TextField t3=new TextField();
	        add(t3);
	        t3.setBounds(180,370,100,30);
	        
	        Label y=new Label();
	        y.setBounds(100,400,120, 70);
	        y.setText("Year:");
	        add(y);
            y.setFont(ft1);
            
	        Choice ch=new Choice();
	        ch.add("1st");
	        ch.add("IInd");
	        ch.add("IIIrd");
	        add(ch);
	        ch.setBounds(220,430, 100, 30);
	        
	        Label gen=new Label();
	        gen.setBounds(400,350,120, 70);
	        gen.setText("Gender:");
	        add(gen);
            gen.setFont(ft1);
            
            CheckboxGroup cg=new CheckboxGroup();
            Checkbox c4=new Checkbox("Male",true,cg);
            Checkbox c5=new Checkbox("Female",false,cg);
            
            c4.setBounds(520,370, 60, 30);
            c5.setBounds(580,370, 60, 30);
            
            
            add(c4);
            add(c5);
            
            Label g=new Label();
	        g.setBounds(400,400,120, 70);
	        g.setText("Guardian:");
	        add(g);
            g.setFont(ft1);
            
            TextField gt=new TextField();
	        add(gt);
	        gt.setBounds(470,415,180,30);
	        
	        
            Label s=new Label();
	        s.setBounds(700,350,120, 70);
	        s.setText("Status:");
	        add(s);
            s.setFont(ft1);
            
            TextField st=new TextField();
	        add(st);
	        st.setBounds(700,370,280,30);
	        
            
            
         

            
            
            
	        
            Label r=new Label();
	        r.setBounds(700,400,120, 70);
	        r.setText("Relation:");
	        add(r);
            r.setFont(ft1);
            
            TextField rt=new TextField();
	        add(rt);
	        rt.setBounds(700,420,280,30);
	        
	        Label c=new Label();
	        c.setBounds(550,450,120, 70);
	        c.setText("Contact#:");
	        add(c);
            c.setFont(ft1);
            
            TextField ct=new TextField();
            add(ct);
            ct.setBounds(650,470,280,30);
	        
            
            
            
            Button bt1=new Button("|<");
    		add(bt1);
    		
    		Button bt2=new Button("<<");
    		add(bt2);
    		
    		Button bt3=new Button(">>");
    		add(bt3);
    		
    		Button bt4=new Button(">|");
    		add(bt4);
    		
    		Button bt5=new Button("New");
    		add(bt5);
    		
    		Button bt6=new Button("Save");
    		add(bt6);
    		
    		bt1.setBounds(100,550, 70,40);
    		bt2.setBounds(190,550, 70,40);
    		bt3.setBounds(280,550, 70,40);
    		bt4.setBounds(360,550, 70,40);
    		bt5.setBounds(500,550, 200,40);
    		bt6.setBounds(720,550, 200,40);
    		
    		
            
          
            
	        
            
            
            
            
            
            
	        	
	        
	        
	        
            
            
	        
	        
	        
	        
	        
            
            
	        
	        
	        
	        
	        
	        
		  
          
		    
		   
		   setSize(1000,1000);
	}
	
	public void paint(Graphics g)
	{
		
	}

}
