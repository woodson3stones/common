public class emp extends people implements my_interface,Comparable<teacher> {
	private String profession;
	public emp(){
		super();
		profession="worker";
	}
	public emp(String name ,int old,String profession){
		super(name,old);
		this.profession=profession;
	}
	public void show(){
		//super.show();
		System.out.println("i am a worker!!!!");
		System.out.println("profession:"+profession);
	}
	public void work(){
		//super.show();
		System.out.println("Just DO it !");
	}
	public void get_married(){
		System.out.println("i am not happy although i get married ,i want more money!");
	}
}