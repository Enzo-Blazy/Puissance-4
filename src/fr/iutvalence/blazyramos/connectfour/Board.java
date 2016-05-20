package fr.iutvalence.blazyramos.connectfour;

/**
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Board {
	
	public static final int HEIGHT = 6;
	
	public static final int WIDTH = 7;
	
	private Piece[][] board;
	


	public Board() {
		board = new Piece[HEIGHT][WIDTH];
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
				// TODO Implement victory
				
				return;
			}
		}
	}
	
	public boolean isFullColumn (int column){
		return board[0][column] != null; 
	}

	public boolean isVictory() {
		
		return false;
	}

	public void isFull(int column) {
		for(int i=HEIGHT-1;i>=0;i--){
			while (isFullColumn(column)&& i!=6){
			column++;
		}
		}
		return;
	}
}
	

