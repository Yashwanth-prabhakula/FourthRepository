package automate.prac;

public class TestCase_1 extends BaseAutoTest //testcase for baseautotest
{

	public static void main(String[] args) throws Exception
	{
	
		browserlaunch("chrome");

		openwebsite("https://www.imdb.com/?ref_=nv_home");

		selectDDoption("//*[@id=\"nav-search-form\"]/div[1]/div/span[1]/label");
		
		selectDDoptionselect("//*[@id=\"nav-search-form\"]/div[1]/div/div/div/div/ul/li[2]");
		
		search("suggestion-search", "Inception");
		 
		clickelement("suggestion-search-button");
		
	}

}
