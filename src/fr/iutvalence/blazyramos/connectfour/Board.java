package fr.iutvalence.blazyramos.connectfour;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Board {
	/** TODO. */
	public static final int HEIGHT = 6;
	/** TODO. */
	public static final int WIDTH = 7;
	/** TODO. */
	private Piece[][] board;
	


	public Board() {
		board = new Piece[HEIGHT][WIDTH];
		//	board[i][j]=new Piece(Piece.PIECE1);
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
				return;
			}
		}
	}
	public boolean isFull(int column) {
		for (int i=HEIGHT-1;i>=0; i--){
			if(board[i][column] != null){
			  System.out.printf("The selected column is full");
			  return false;
			  
			}
		}
		return false;
		
	}
	
}
