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
		//while (!victory()) {
			// Algo :
				/* 1 = Afficher la board 
				 * 2= Joueur courant identifié par sa piece*
				 * 3= Joueur place son pion 
				 * 4= On vérifie si son coup est possible 
				 *    Si coup est possible alors passer au joueur 2
				 *    Sinon recommencer tour
		         */
				board.print();
				
				
		//}
		
	}
	
	private boolean victory() {
		// TODO Auto-generated method stub
		return false;
	}

	public Player currentPlayer ()
	{
		return player1;
		
	}
	
	

}







