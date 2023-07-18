import java.util.LinkedList;
import java.util.List;

public class LinkedtListTest {

	public static void main(String[] args) {
		
		List list=new LinkedList<>();
		list.add("First");
		list.add(1);
		list.add('a');
		list.add(12.3f);
		
		
		for(Object x:list)
		{
			System.out.println(x);
		}
		
		

	}

}
