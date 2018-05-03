package puzBug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FileOperations 
{
	public int save(String code,String path,String testPath,String runnerFile, int pieces) throws Exception
	{
		String classFile=null;
		File dir=null;
		System.out.println("Code is: "+code);
		System.out.println("path is "+path);
		System.out.println("runner file is "+runnerFile);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));

		/*BufferedWriter bw1 = new BufferedWriter(new FileWriter(testPath));
		bw1.write("package test_snippets;\n");
		bw1.write(code);
		bw1.close();*/
		bw.write(code);
		bw.close();

		System.out.println("Infile operations");
		if(runnerFile.length()==14)
			classFile=runnerFile.substring(0, 9);
		else
			classFile=runnerFile.substring(0, 11);
		System.out.println(classFile);
		String f="test_snippet/2Pieces/";
		String f1="test_snippet/4Pieces/";
		if(pieces ==2 || pieces ==9){
			dir=new File(f); 
	
		}
		else if (pieces ==4){
			dir=new File(f1);
		}
		
		Process pro1= Runtime.getRuntime().exec("javac "+runnerFile,null,dir);
		pro1.waitFor();
		Process pro2 = Runtime.getRuntime().exec("java "+classFile,null,dir);
		System.out.println("Before printline");
		printLines("javac stdout:", pro1.getInputStream());
		int c=printLines("java stderr:", pro1.getErrorStream());

		System.out.println("After printline");
		System.out.println("process 2:");
		int cOut=printLines("javac stdout:", pro2.getInputStream());
		int c1=printLines("java runtime stderr:", pro2.getErrorStream());
		if(c!=0 && c1!=0)
			JOptionPane.showMessageDialog(null,"There is a compile time and runtime error in the code", "Error", JOptionPane.ERROR_MESSAGE);
		else if(c!=0)
			JOptionPane.showMessageDialog(null,"There is a compile time error in the code", "Error", JOptionPane.ERROR_MESSAGE);
		else if(c1!=0)
			JOptionPane.showMessageDialog(null,"There is a runtime error in the code", "Error", JOptionPane.ERROR_MESSAGE);
		else if(path.equals("test_snippet/2Pieces/S1IC1.java") && cOut==2)
		{
			JOptionPane.showMessageDialog(null,"There is some error in the code.", "Success", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("In else if..checking path");
		}
		else if(path.equals("test_snippet/2Pieces/S5IC5.java"))
		{
			System.out.println("Inside ");
			String line=null;
			int correct=0;
			BufferedReader in = new BufferedReader(new FileReader("test_snippet/2Pieces/S5IC5.java"));
			while ((line = in.readLine()) != null) 
			{
				if(line.contains("&&")){
					correct=1;
					System.out.println("In while of s5 snippet");
					break;
				}
			}
			if(correct!=1)
				JOptionPane.showMessageDialog(null,"There is some error in the code.", "Success", JOptionPane.INFORMATION_MESSAGE);
			else
			{
				JOptionPane.showMessageDialog(null,"Congratulations!! You have successfully debugged this code snippet", "Success", JOptionPane.INFORMATION_MESSAGE);
				return 1;
			}
			System.out.println("In else if..checking path fro S5");
		}
		else 
		{
			//set enable disable flag here
			JOptionPane.showMessageDialog(null,"Congratulations!! You have successfully debugged this code snippet", "Success", JOptionPane.INFORMATION_MESSAGE);
			return 1;
		}

		return 0;
		// System.out.println(command + " exitValue() " + pro.exitValue());
	}
	/*private static boolean checkCode(String name, InputStream inst) throws IOException
	{

		String line = null;int a=0;
		System.out.println("In printline");
		BufferedReader in = new BufferedReader( new InputStreamReader(inst));
		while ((line = in.readLine()) != null) 
		{
			if(!line.contains("5"))
			{
				a=0;
			break;
			}
			else
				a=1;

		}	
		if(a==1)
			return true;
		else
			return false;

	}*/

	private static int printLines(String name, InputStream ins) throws Exception 
	{
		String line = null;
		int count=0,a=0;
		System.out.println("In printline");
		BufferedReader in = new BufferedReader( new InputStreamReader(ins));
		while ((line = in.readLine()) != null) 
		{
			count++;
			System.out.println(name + " " + line);
			if(!line.contains("5"))
				a=2;
			//JOptionPane.showMessageDialog(null,"There is some error in the code.", "Success", JOptionPane.INFORMATION_MESSAGE);
			//else

			//JOptionPane.showMessageDialog(null,"Congratulations!! You have successfully debugged this code snippet", "Success", JOptionPane.INFORMATION_MESSAGE);
		}
		if(count==0)
		{
			return 0;
		}
		else if(a==2)
			return 2;
		return 1;
	}

	public static ArrayList initialLoad() throws IOException
	{

		String f="CodeDB.csv";
		String line = null;
		int r=0;
		ArrayList<String[]> DB=new ArrayList<String[]>();
		BufferedReader br= new BufferedReader(new FileReader(f));
		while ((line = br.readLine()) != null) 
		{
			String[] codeDBline = line.split("	");
			DB.add(codeDBline);

		}

		/*	for(int i=1;i<DB.size();i++)
		{
			System.out.println(++r+" ");
			for(int j=0;j<DB.get(i).length;j++){
				System.out.print(DB.get(i)[j]+" ");
			}
			System.out.println("\n");
		}*/

		return DB;
	}
}