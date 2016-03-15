package fr.iutvalence.blazyramos.connectfour;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Player {
    // TODO fr.iutvalence.blazyramos.connectfour.Piece or char?
    /** TODO. */
    private final Piece  piece;
    /** TODO. */
    private final String name;

    /** TODO. */
    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    /**
     * TODO.
     *
     * @return TODO
     */
    public Piece getPiece() {
        return this.piece;
    }
}
