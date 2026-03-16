import java.awt.*;

/**
 * Represents the suit of a playing card.
 */
public enum Suit {
    CLUBS, DIAMONDS, SPADES, HEARTS;

    public Suit next(){
        return Suit.values()[(ordinal() + 1) % Suit.values().length ];
    }

    public enum Color{
        RED, BLACK;
    }

    public Color color(){
        if (this == DIAMONDS || this == HEARTS){
            return Color.RED;
        }
        else{
            return Color.BLACK;
        }
    }
}