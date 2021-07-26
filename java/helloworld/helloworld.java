import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
public class helloworld{
	public static void main(String[] args){
		exe();
		System.exit(0);
	}
	public static void exe(){
		System.out.println("helloworld");
		date();
		//input_test();
		//use_ArrayList();
		//use_Stringbuilder(); 
		//show_class(); //duotai
		//interface_fuotai(); //jie kou duotai
		//inner.In In_opp=new inner().new In();In_opp.show();//inner_class
		//inner IN=new inner(); IN.SomePlace();//ju bu inner_class
		inner IN=new inner(); IN.anonimous();//annonimous class
 		//string_sort();//string sort
		//inner IN=new inner(); IN.eryuetian();//test_CLASS:Calendar
	}
	//Scanner输入功能测试
	public static void input_test(){
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();  
		System.out.println("input is :"+a );
		//String  b=s1.nextLine();   //not avoid space
		String  b=s1.next();    //end for space 
		System.out.println("input is :"+b);
		for(int i=0;i<b.length();i++)
		    System.out.println("string["+i+"] is :"+b.charAt(i));
	}
	public static void date(){
		Date date=new Date();
		//System.out.println(date);
		//long temp=1000*60*60;
		//Date date2=new Date(temp);
		//System.out.println(date2);
		//int terminal=(int)(date.getTime()*1.0/1000/60/60/24/365);
		//System.out.println("terminal "+terminal+" years");
		//SimpleDateFormat sdf=new SimpleDateFormat();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s=sdf.format(date);
		System.out.println(s);
		//String ss="2021/01/01 11:11:11";
		//SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date dd=sdf2.parse(ss);
		//System.out.println(dd);
	}
	//String sort
	public static void string_sort(){
		String str="54,12,5,98,65,44,36";
		//1.String to string[]
		String[] st=str.split(",");
		//2.string[] to int[]
		int[] tt=new int[st.length];
		for (int i=0;i<st.length;i++)
			tt[i]=Integer.parseInt(st[i]);
		Arrays.sort(tt);
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<tt.length;i++)
		{
			sb.append(tt[i]);
			if(i<tt.length-1)
				sb.append(",");
		}
		String result=sb.toString();
		System.out.println("result is "+result);
	}
	public static void show_class(){
		emp a=new emp("lixioayao",22,"worker");
		show_info(a);
		//a.show();
		//a.change_info("zhangsan",22);
		//a.change_info("zhanliwei",27);
		teacher t=new teacher("fengqingyang",88,"teacher");
		show_info(t);
		//t.show();
	}
	//ArrayList的使用，相当于C++的vector
	public static void use_ArrayList(){
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("hello");
		arr.add(1,"S");
	    arr.add("B");
		arr.add(1,"BIg");
		//for (int i :arr) //也可以以这种方式遍历
		//for(int i=0;i<arr.length;i++)	
		for(int i=0;i<arr.size();i++)	
			System.out.println("arr:"+arr.get(i));
		arr.set(1,"big");
		for(int i=0;i<arr.size();i++)	
			System.out.println("arr:"+arr.get(i));
		System.out.println("remove:"+arr.remove(1));
		for(int i=0;i<arr.size();i++)	
			System.out.println("arr:"+arr.get(i));
	    arr.remove(arr);
	}
	//StringBilder provides append() and reverse()
	public static void use_Stringbuilder(){
		String a="helloworld";
		StringBuilder S1=new StringBuilder(a);
		//StringBuilder S1=new StringBuilder();
		S1.append("hello java").append("\t hello man");
		System.out.println("arr:"+S1);
		S1.reverse();
		System.out.println("after reverse arr:"+S1);
		a=S1.toString();
		System.out.println("String a="+a);
	}
	/*the common usage of duotai*/
	public static void show_info(people exp){
		exp.show();
		if(exp.getname().equals("lixioayao"))
		{
			emp nn=(emp)exp;
			nn.work();
			if(nn.married == true)
				System.out.println("i am really married !");
			nn.get_married();
		}
		else if(exp.getname().equals("fengqingyang"))
		{
			teacher nn=(teacher)exp;
			nn.teach();
			if(nn.married == true)
				System.out.println("i am really married !");
			nn.get_married();
		}
	}
	//jiekou de duo tai 
	public static void interface_fuotai(){
		my_interface SB = new emp();
		SB.get_married();
		((emp)SB).work();
	}
}