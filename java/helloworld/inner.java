import java.util.Calendar;
import java.util.Scanner;
public class inner{
	private int old=90;
	private Integer aa=Integer.valueOf(200);
	//nei bu lei 
	public class In{
		public void show(){
			System.out.println("this is inner class and old is "+ old);
		}
	}
	//ju bu nei nei bu lei 
	public void SomePlace(){
		class IN_sp{
			public void show_in(){
				System.out.println("this is IN_sp class and old is "+ old);
				System.out.println("this integer num is  "+ aa);
			}
		}
		IN_sp SP=new IN_sp();
		SP.show_in();
	}
	//ni ming ju bu nei bu lei 
	public void anonimous(){
	//type 1 use anonimous class 
	new my_interface(){
			public void get_married(){
			System.out.println("anonimous class is me !");
			}
		}.get_married();
	//type 2 use anonimous class 
	my_interface temp=new my_interface(){
			public void get_married(){
			System.out.println("anonimous class is me,I am 2nd !");
			}
		};
	System.out.println("This is the second method of anonimous class ");	
	temp.get_married();
	}
	public  void eryuetian(){
		Scanner s1=new Scanner(System.in);
		int year=s1.nextInt();  
		Calendar c=Calendar.getInstance();
		c.set(year,2,1);//yue fen range from 0 to 11
		c.add(Calendar.DATE,-1);
		int day=c.get(Calendar.DATE);
		System.out.println("The second month has "+day +" days");
	}
}