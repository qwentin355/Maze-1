
public class GameCell {
	
	char cVal;
	private int nRow;
	private int nCol;
	private boolean bVisited;
	public int Rabbit_Cost = 10;
	public int Dragon_Cost = 75;
	public int Block_Cost = 20000000;
	public int Open_Cost = 1;
	
	public GameCell(char cVal, int nRow, int nCol) {
		super();
		this.cVal = cVal;
		this.nRow = nRow;
		this.nCol = nCol;
	}

	public boolean isbVisited() {
		return bVisited;
	}

	public void setbVisited(boolean bVisited) {
		this.bVisited = bVisited;
	}
	public int getCurrentCost()
	{
		switch (cVal)
		{
			case 'D':
				return this.Dragon_Cost;
				
			case 'R':
				return this.Rabbit_Cost;
			
			case 'X': 
			return this.Block_Cost;
			
			default:
				return this.Open_Cost;
		}
	}
	public boolean isBlocked()
	{
		if(String.valueOf(this.cVal).equalsIgnoreCase("x"))
		return true;
		 return false;
		
	}
	public boolean isStart() 
	{
		if(String.valueOf(this.cVal).equalsIgnoreCase("s"))
		return true;
		 return false;
	}
	public boolean isEnd()
	{
		if(String.valueOf(this.cVal).equalsIgnoreCase("e"))
			return true;
		return false;
		
	}
	
	public int getRow() 
	{
		return nRow;
	}

	public int getCol() 
	{
		return nCol;
	}
	public char getVal() 
	{
		return cVal;
	}
	public String toString()
	{
		return String.format("%s,%d %d",this.cVal,this.nCol,this.nRow);
	}
	
}
