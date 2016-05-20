package fr.iutvalence.blazyramos.connectfour;

/**
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Board {

	public static final int HEIGHT = 6;

	public static final int WIDTH = 7;

	private Piece[][] board;

	private boolean victory;

	public Board() {
		board = new Piece[HEIGHT][WIDTH];
		victory = false;
	}

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

	public boolean isFullColumn (int column){
		return board[0][column] != null; 
	}

	public boolean isFull() {
		int i = 0;
		while (i<WIDTH && isFullColumn(i)) {
			i++;
		}
		return i==WIDTH;
	}

	private boolean checkVictory(int line, int column) {
		return checkVictoryLine(line) || checkVictoryColumn(line, column) || checkVictoryDiag1(line,column) || checkVictoryDiag2(line, column);
	}

	private boolean checkVictoryLine(int line) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkVictoryColumn(int line, int column) {
		// TODO Auto-generated method stub
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


