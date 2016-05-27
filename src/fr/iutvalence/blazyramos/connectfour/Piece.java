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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + piece;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (piece != other.piece)
			return false;
		return true;
	}


}
