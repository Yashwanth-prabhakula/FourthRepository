package testNG.prac;

import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;

public class SuitesParallel
{

	public static void main(String[] args)
	{
		TestNG obj = new TestNG();
		
		String[] path = new String[] {System.getProperty("user.dir") + "/MegaSuite.xml"};
		
		List<String> listpath = Arrays.asList(path);
		
		obj.setTestSuites(listpath);
		
		//or the below line.
		//obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir") + "\\MegaSuite.xml"}));
		
		//obj.setSuiteThreadPoolSize(2);
		
		obj.run();
		
	}

}
