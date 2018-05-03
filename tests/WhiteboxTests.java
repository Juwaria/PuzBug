package tests;



import puzBug.Level;

import org.junit.*;

public class WhiteboxTests
{
   // Data you need for each test case
   private Level testee;
  
  

@Before public void setup()
{
testee= new Level();
}



@After public void teardown()
{
   System.out.println("\nTest finished.");
}


//test case to check x value of vertex
@Test public void checkeasyPiecesTest()
{
	int pieces;
	pieces=testee.getNoOfPieces("Easy");
	Assert.assertEquals(2, pieces);

}

@Test public void checkMediumPiecesTest()
{
	int pieces;
	pieces=testee.getNoOfPieces("Medium");
	Assert.assertEquals(4, pieces);

}

@Test public void checkHardPiecesTest()
{
	int pieces;
	pieces=testee.getNoOfPieces("Hard");
	Assert.assertEquals(9, pieces);

}

}
