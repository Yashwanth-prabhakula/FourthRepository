package automate.prac;

public class TestCase_3 extends BaseTest //testcase for waittest
{

	public static void main(String[] args) throws Exception
	{
		fileload();
		
		openbrowser("chromebrowser");
		
		openurl("imdb");
		
		entersearchkeyword("imdbsearch_id", "Inception");
		
		submitsearch("imdbsearchbutton_id");
	
	}

}
