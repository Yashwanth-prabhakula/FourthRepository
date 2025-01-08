package automate.prac;

public class TestCase_2 extends DynaBaseAutoTest //testcase for dynabaseautotest
{

	public static void main(String[] args) throws Exception
	{
		fileload();
		
		openbrowser("chromebrowser");
		
		openurl("imdb");
		
		selectDDoption("imdbdropdown_xpath");
		
		selectDDoptionselect("imdbdropdownoption_xpath");
		
		entersearchkeyword("imdbsearch_id", "Inception");
		
		submitsearch("imdbsearchbutton_id");
	}

}
