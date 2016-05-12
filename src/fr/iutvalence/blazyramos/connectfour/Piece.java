package fr.iutvalence.blazyramos.connectfour;

/**
 * Authors: Cyril Ramos, Enzo Blazy	
 */
public class Piece {
    
    public static final char PIECE1 = 'X';
    
    public static final char PIECE2 = 'O';
    
    private final char piece;
    
  
    public Piece(char choice) {
      
        piece = choice;
    }
    
    @Override
    public  String toString()
    {
    	return String.valueOf(piece);
    }
}
