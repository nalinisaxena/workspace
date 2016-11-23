package comparabledemo;

public class Emp implements Comparable<Emp> 

{
	int id;
	String name;
	int salary;
	
	Emp(int i,String name,int s)
	{
		this.id=i;
		this.name=name;
		this.salary=s;
	}
	
	public int compareTo(Emp st) {

		if(salary==st.salary)
			return 0;
			else if(salary>st.salary)
				return 1;
			else
				return -1;
              		
	}

}
