
class Test
{

	public void show() {
		
		System.out.println("Hi from show");
	}
	
}



class Test1
{

	public void show() {
		
		System.out.println("Hi from show 1");
	}
	
}


public class First {
	
	public static void main(String[] args) {
		Test test=new Test();
		Test1 test1=new Test1();
		System.out.println(test);
		System.out.println(test1);
		
	}

}
