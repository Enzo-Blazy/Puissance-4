package fr.iutvalence.blazyramos.connectfour;

import java.util.Scanner;

/*
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Game 
{
	private Player player1;

	private Player player2;

	private Board board;


	public Game() {
		player1 = new Player("Momo", Piece.PIECE1);
		player2 = new Player("Toto", Piece.PIECE2);
		board = new Board();

	}

	public void start() {
		
		Scanner scanner = new Scanner(System.in);// create a keyboard enter
		System.out.printf("New game: %s vs. %s\n",player1.name(), player2.name()) ;
		Player player = player1;

		while (!victory()) {
			
			board.print();
			System.out.println("Choose a column number:");
			int col = scanner.nextInt();
			System.out.println("You choosed the column number : " + col);
		
			if(col>6){
				System.out.println("Wrong column number");	 
			}
			// Check if player enter right column's number
			else{
			if (!board.isFullColumn(col)){
				board.putPiece(col, player.getPiece());
					if (player == player1) {
							player = player2;   
							}
					else {
						player = player1;
						}
				}
				else {
					System.err.println("The selected column is full");
	
				}
		
	
		}	
		}
			scanner.close();
		}
			
		

private boolean victory() {
		return board.isVictory() || board.isFull();
	}

}







