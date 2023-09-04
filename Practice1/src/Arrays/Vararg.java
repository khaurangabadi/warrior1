package Arrays;
//variable aruguments
public class Vararg {
	
	void accept(String ...a)
	{
		
		for(String i:a)
		{
			System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) {
		 Vararg v=new  Vararg ();
		 v.accept( "kinjal","c","c++");
		 v.accept("ram", "c","c++","java","html");
		 v.accept("ramesh", "java","adv java");
		 v.accept("sonal");
		 v.accept("priya","c");

	}

}
