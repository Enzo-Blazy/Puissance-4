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
    private final Piece[][] board;
	
    
	public Board() {
		board = new Piece[WIDTH][HEIGHT];
	}
	
	public void print() {
		for ( int i=0; i<WIDTH;i++)
		{
			for (int j=0;j<HEIGHT;j++)
			{
				//board [i][j]= null   ;
			}
		}
		System.out.println(board[WIDTH-1][HEIGHT-1]);
	}
}
