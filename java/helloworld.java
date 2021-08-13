import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
public class helloworld{
	public static void main(String[] args){
		exe();
		System.exit(0);
	}
	public static void exe(){
		System.out.println("helloworld");
		date();
		try{
			test_exception();
		}catch(ArrayIndexOutOfBoundsException e){//throwable provides three kind of print exception method 
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();//the most infromation showed 
		}catch(customize_exception e){
			e.printStackTrace();
		}
		Randomdemo();
		//collection();
		//input_test();
		//use_ArrayList();
		//use_Stringbuilder(); 
		//show_class(); //duotai
		//interface_fuotai(); //jie kou duotai
		//inner.In In_opp=new inner().new In();In_opp.show();//inner_class
		//inner IN=new inner(); IN.SomePlace();//ju bu inner_class
		//inner IN=new inner(); IN.anonimous();//annonimous class
 		//string_sort();//string sort
		//inner IN=new inner(); IN.eryuetian();//test_CLASS:Calendar
		System.out.println("The End!!");
	}
	public static void test_exception() throws ArrayIndexOutOfBoundsException,customize_exception {
		//throws only give a exception,it does not handle exception
		int[] arr={1,-2,3};
		System.out.println(arr[2]);
		if (arr[1]<0)
		{
			throw new customize_exception("number is illegal");
		}
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
	public static void collection(){
		//collection
		Collection<String> arr=new ArrayList<String>();
		arr.add("hello ");
		arr.add("java ");
		arr.add("hello ");
		arr.add("world");
		System.out.println(arr);
		Iterator<String> it=arr.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		//List
		List<String> att=new ArrayList<String>();
		att.add("hello ");
		att.add("java ");
		att.add("hello ");
		att.add("world");
		att.add(1,"new add");
		att.set(0,"HELLO");
		att.remove(2);
		System.out.println(att);
		Iterator<String> iter=att.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println("--------");// libiao die dai qi bian li 
		ListIterator<String> List=att.listIterator();
		while (List.hasNext()){
			System.out.println(List.next());
		}
		System.out.println("--------");//zeng qiang for xun huan bian li 
		for (String str : att)
			System.out.println(str);
		System.out.println("--------");//common for xun huan bian li 
		for (int i=0;i<att.size();i++)
			System.out.println(att.get(i));
		System.out.println("LinkedList--------");
		LinkedList<String> att2=new LinkedList<String>();
		att2.add("l ");
		att2.add("i ");
		att2.add("l ");
		att2.add("e");
		att2.addFirst("my name is :");
		att2.addLast("i \n");
		for (String i: att2)
			System.out.println(i);
		att2.removeFirst();
		for (String i: att2)
			System.out.println(i);
		System.out.println("HashSet--------");
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello ");
		hs.add("world ");
		hs.add("java ");
		hs.add("code");
		for (String i: hs)
			System.out.println(i);
		System.out.println("--------TreeSet--------");
		TreeSet<String> ts=new TreeSet<String>();
		hs.add("hello ");
		hs.add("world ");
		hs.add("java ");
		hs.add("code");
		for (String i: hs)
			System.out.println(i);
		System.out.println("--------TreeSet Comparable--------");
	    TreeSet<teacher> ts2=new TreeSet<teacher>();
		teacher t1=new teacher("fengqingyang",88,"teacher");
		teacher t2=new teacher("zhangsan",14,"teacher");
		teacher t3=new teacher("lisi",65,"teacher");
		teacher t4=new teacher("wanger",18,"teacher");
		teacher t5=new teacher("cindy",18,"teacher");
		ts2.add(t1);
		ts2.add(t2);
		ts2.add(t3);
		ts2.add(t4);
		ts2.add(t5);
		for (people i: ts2)
			i.show();
		System.out.println("--------TreeSet Comparator--------");
		TreeSet<teacher> ts3=new TreeSet<teacher>(new Comparator<teacher>(){
			public int compare(teacher T1,teacher T2){
				int num=T1.getold()-T2.getold();
				int num2 = num==0?T1.getname().compareTo(T2.getname()):num; 
				return num2;
			}
		});
		ts3.add(t1);
		ts3.add(t2);
		ts3.add(t3);
		ts3.add(t4);
		ts3.add(t5);
		for (people i: ts2)
			i.show();
	}
	public static void Randomdemo(){
		Random a=new Random();
		for (int i=0;i<10;i++)
			System.out.println(a.nextInt(20)+1);
	}
}