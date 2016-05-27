package fr.iutvalence.blazyramos.connectfour;

/**
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Board {
		// The height of the board
	public static final int HEIGHT = 6;
		// The width of the board
	public static final int WIDTH = 7;
		// Board definition
	private Piece[][] board;

	private boolean victory;
		// Board initialization
	public Board() {
		board = new Piece[HEIGHT][WIDTH];
		victory = false;
	}
		// Board printing
	public void print() {
		for ( int i=0; i<HEIGHT;i++)
		{
			for (int j=0;j<WIDTH;j++)
			{
				if (board[i][j] == null) {
					System.out.print("|   ");
				} else {
					System.out.printf("| %s ", board[i][j]);
				}
			}
			System.out.println("|");
		}
		System.out.println("------------------------------");
	}
			//Method to put the piece in a column
	public void putPiece(int column, char piece) {
		for (int i=HEIGHT-1;i>=0; i--){
			if(board[i][column] == null){
				board [i][column] = new Piece(piece);	
				victory = checkVictory(i, column);
				return;
			}
		}
	}

	public boolean isVictory() {
		return victory;
	}
			//The column is Full
	public boolean isFullColumn (int column){
		return board[0][column] != null; 
	}
			//The board is Full
	public boolean isFull() {
		int i = 0;
		while (i<WIDTH && isFullColumn(i)) {
			i++;
		}
		return i==WIDTH;

	}
	// method check victory
	private boolean checkVictory(int line, int column) {
		return checkVictoryLine(line) || checkVictoryColumn(line, column) || checkVictoryDiag1(line,column) || checkVictoryDiag2(line, column);
	}

	//method check victory line
	private boolean checkVictoryLine(int line) {
		for (int j =0; j<WIDTH-3;j++){
			boolean ok = board[line][j] != null  
					&& board[line][j].equals(board[line][j+1])
							&& board[line][j].equals(board[line][j+2])
									&& board[line][j].equals(board[line][j+3]);
			if (ok) return ok;
		}
		return false;
	}
		// method check victory column
	private boolean checkVictoryColumn(int line, int column) {
			boolean ok = board[line][column] != null  
					&& board[line][column].equals(board[line][column+1])
							&& board[line][column].equals(board[line][column+2])
									&& board[line][column].equals(board[line][column+3]);
			if (ok) return ok;
		return false;
	}

	private boolean checkVictoryDiag1(int line, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkVictoryDiag2(int line, int column) {
		// TODO Auto-generated method stub
		return false;
	}
}


