package fr.iutvalence.blazyramos.connectfour;

/**
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Player {

    private final char  piece;
 
    private final String name;
    



    public Player(String name, char piece) {
        this.name = name;
        this.piece = piece;
    }

    public char getPiece() {
        return this.piece;
    }

	public String name() {
		return name;
	}
}
