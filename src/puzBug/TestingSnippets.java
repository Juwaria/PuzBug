package puzBug;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestingSnippets {

	public static void main(String args[]) throws Exception{
	
		boolean t=testS1IC1();

	}

	public static boolean testS1IC1() throws Exception
	{
		File dir=new File("src/test_snippets/"); 
		//Thread.sleep(200000);
		Process pro1= Runtime.getRuntime().exec("javac S1IC1.java",null,dir);
		pro1.waitFor();
		Process pro2= Runtime.getRuntime().exec("java S1IC1",null,dir);	
	
		System.out.println("Before printline");
		printLines("javac stdout:", pro1.getInputStream());
		
		Result result = JUnitCore.runClasses(TestJunit.class);	
		for (Failure failure : result.getFailures()) 
		{
			System.out.println(failure.toString());
		}
		System.out.println("Result succ:"+result.wasSuccessful());
		if(result.wasSuccessful())
			return true;
		else return false;
	}

	private static int printLines(String name, InputStream ins) throws Exception {
		String line = null;
		int count=0;
		System.out.println("In printline");
		BufferedReader in = new BufferedReader( new InputStreamReader(ins));
		while ((line = in.readLine()) != null) {
			count++;
			System.out.println(name + " " + line);
		}
		if(count==0){
			return 0;
		}
		return 1;
	}
}
