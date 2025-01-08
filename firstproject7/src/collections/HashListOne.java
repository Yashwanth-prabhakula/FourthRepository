package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashListOne
//Should have named the class as HashSet actually.
{
	
	public static void main(String[] args)
	{
		HashSet<String> music = new HashSet<String>();
		music.add("Rock");
		music.add("Hip Hop");
		music.add("Reggae");
		music.add("Pop");

		System.out.println(music + "\n");
		
		HashSet<String> genres = new HashSet<String>();
		genres = (HashSet)music.clone(); //Clones one list into another list.
		System.out.println("Genres of music are" + genres + "\n");
		
		LinkedHashSet<Object> lang = new LinkedHashSet<Object>();
		lang.add(genres); //As type is object, objects can also be added.
		lang.add("English");
		lang.add("Hindi");
		lang.add("Telugu");
		System.out.println(lang + "\n");
		
		lang.remove(genres);
		System.out.println(lang + "\n");
		
	}

}
