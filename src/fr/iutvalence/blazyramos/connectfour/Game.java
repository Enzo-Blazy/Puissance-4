package fr.iutvalence.blazyramos.connectfour;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Game 
{
	/** TODO. */
	private Player player1;
	/** TODO. */
	private Player player2;
	/** TODO. */
	private Board board;
	
	// TODO Joueur courant.
	// TODO Tour de jeu (nombre).
	
	/** TODO. */
	public Game() {
		player1 = new Player("Momo", Piece.PIECE1);
		player2 = new Player("Toto", Piece.PIECE2);
		board = new Board();
		
	}

	public void start() {
		System.out.printf("New game: %s vs. %s\n",player1.name(), player2.name()) ;
		board.print();
	}
	
	public Player CurrentPlayer ()
	{
		return player1;
		
	}
	
	

}







