public class Player {

	private final Piece piece;
	private final String name;
	
	public Player(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
	}

	public Piece getPiece() {
		return this.piece;
	}

}