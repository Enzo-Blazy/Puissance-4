package fr.iutvalence.blazyramos.connectfour;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Piece {
    /** TODO. */
    public static final char PIECE1 = '⊕';
    /** TODO. */
    public static final char PIECE2 = '⊗';
    /** TODO. */
    private final char piece;

    /**
     * TODO.
     *
     * @param choice TODO
     */
    public Piece(char choice) {
        // TODO Check the validity of the "choice" parameter.
        piece = choice;
    }
}
