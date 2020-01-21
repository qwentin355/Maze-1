import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class GameBoard {
	private GameCell[][] aBoard;
	private int nSquareSize;
	private int nStartRow;
	private int nStartCol;
	Scanner objScanner=null;
	File fMazeFile;
	
	public GameBoard(String sFileName) {
		super();
	}
	protected void loadBoard(String sFileName)
	{
		aBoard = null;
		File file = new File("../InClass/src/Untitled 1");

		if(file.exists() && file.canRead()&& !file.isDirectory())
		{
			
			try
			{
				objScanner = new Scanner(file);

				rs=new char[getSize(file)][];//new array length
				
				
				
				for(int i=0;objScanner.hasNextLine();i++)
				{
					rs[i]=objScanner.nextLine().toCharArray();//fills array
				}
			}
			finally
			{
				if(objScanner!=null)objScanner.close();
			}
		}
		return rs;
	}
	protected int getSize(String sFilename)
	{
		int length=0;
		objScanner = new Scanner(file);
		while(objScanner.hasNextLine())
		{
			length++;
			objScanner.nextLine();
		}
		objScanner.close();
		return length;
	}
	private void findStart()
	{
		
	}
	protected Vector<GameCell>findPath(int nRow,int nCol)
	{	
		Vector<GameCell> newVect = null;
		newVect.add(new GameCell('A',2,3));
		return newVect;
	}

	protected boolean canGoUp(int nRow, int nCol)
	{
	
	}
	protected boolean canGoLeft(int nRow, int nCol)
	{
		
	}
	protected boolean canGoRight(int nRow, int nCol)
	{
		
	}
	protected boolean canGoDown(int nRow, int nCol)
	{
		
	}
	public int pathCost (Vector<GameCell> obPath)
	{
		
	}
	public int printBoard()
	{
		
	}
	


}
