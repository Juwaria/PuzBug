package puzBug;
import java.util.ArrayList;


public class Level 
{
	private ArrayList<String> levelName;
	private ArrayList<Integer> noOfPieces;

	public Level()
	{
		levelName=new ArrayList<String>();
		noOfPieces=new ArrayList<Integer>();
		levelName.add(0, "Easy");
		levelName.add(1, "Medium");
		levelName.add(2, "Hard");
		noOfPieces.add(0, 2);
		noOfPieces.add(1,4);
		noOfPieces.add(2, 9);
	}
	public int getNoOfPieces(String level) 
	{
		int number=0;
		for(int i=0;i<levelName.size();i++)
		{
			if(level.equals(levelName.get(i)))
			{
				number=noOfPieces.get(i);
				System.out.println("No. of pieces"+number);
			}
		}
		return number;
	}
}