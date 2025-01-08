package collections;

import java.util.ArrayList;

public class ArrayListOne
{
	public static void main(String[] args)
	{
		//Arrays store variables. ArrayLists store object entities.
		//An ArrayList is heterogeneous. Individual data types are also accepted.
		//They only accept Wrapper classes.
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("one");
		list.add(2);
		list.add(3.5);
		list.add('4');
		list.add("five");
		list.add(6.5d);
		System.out.println(list);
		
		list.set(5, 6.7); //Replaces an object entity.
		System.out.println(list);
		
		System.out.println(list.get(3)); //get method retrieves an element.
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		ArrayList<Object> newlist = new ArrayList<Object>();
		System.out.println(list.equals(newlist));
		//Checks if lists are similar. Returns true if size and elements match.
		
		System.out.println(list.subList(0, 4));//Prints first four elements.
		//Retrieves sublist. Ending index value should be one value higher.
		
		
		
	}

}
