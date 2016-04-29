package fr.iutvalence.blazyramos.connectfour;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Player {
    /** TODO. */
    private final char  piece;
    /** TODO. */
    private final String name;
    


    /** TODO. */
    public Player(String name, char piece) {
        this.name = name;
        this.piece = piece;
    }

    /**
     * TODO.
     *
     * @return TODO
     */
    public char getPiece() {
        return this.piece;
    }

	public String name() {
		return name;
	}
}
