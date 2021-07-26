public class people{
	private String name ;
	private int old  ;
	public people(){
		name="xxx";
		old=0;
	}
	public people(String name,int old)
	{
		this.name =name;
		this.old= old;
	}
	public void show(){
		switch (old)
		{
			case 20:
			case 21:
			case 22:
					System.out.println("welcone young people");
					break;
			default:
					System.out.println("gun!");
		}
		System.out.println("neme:"+name);
		System.out.println("old:" +old);
	}
	public void change_info(String name,int old){
		if(!name.equals(this.name))
		{
			System.out.println("will update name and old");
			this.name=name;
			this.old=old;
			show();
		}else{
			System.out.println("do not need update , will do nothing");
		}
		
	}
	public String getname(){
		return name;
	}
}