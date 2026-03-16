/**
 * Represents the rank of a playing card.
 */
public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public Rank next(){
        return Rank.values()[(ordinal() + 1) % Rank.values().length ];
    }
}