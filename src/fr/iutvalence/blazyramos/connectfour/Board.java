package fr.iutvalence.blazyramos.connectfour;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Board {
	/** TODO. */
	public static final int WIDTH = 6;
	/** TODO. */
	public static final int HEIGHT = 5;
	/** TODO. */
	private Piece[][] board;


	public Board() {
		board = new Piece[WIDTH][HEIGHT];
		//	board[i][j]=new Piece(Piece.PIECE1);
	}

	public void print() {
		for ( int i=0; i<WIDTH;i++)
		{
			for (int j=0;j<HEIGHT;j++)
			{
				System.out.printf("| %s ", board[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("-----------------");
	}

	public void putPiece(int column, char piece) {
		
		   
	}
}
