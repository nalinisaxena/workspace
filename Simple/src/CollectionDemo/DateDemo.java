package CollectionDemo;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateDemo {

	

	public static void main(String[] args) {

            Date date=new Date();
            System.out.println(date);
            
            SimpleDateFormat ft=new SimpleDateFormat("dd.MMM.yyyy hh:mm:ss a");
            
            System.out.println("current date:"+ft.format(date));
	}

}
