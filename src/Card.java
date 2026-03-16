import java.util.Random;
/**
 * Implementation of a playing card. This class yields immutable objects.
 */
public class Card {
    private Rank aRank;
    private Suit aSuit;
    private static Random aRandom = new Random();

    /**
     * Creates a new card object.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     * @pre pRank != null
     * @pre pSuit != null
     */
    public Card(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * @return The rank of the card.
     */
    public Rank getRank() {
        return aRank;
    }

    /**
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return aSuit;
    }

    public static Card random(){
       return new Card(Rank.values()[aRandom.nextInt(Rank.values().length)], Suit.values()[aRandom.nextInt(Suit.values().length)]);

    }

    public Card nextCard(){
        if(this.getRank() == Rank.KING){
            return new Card(this.getRank().next(), this.getSuit().next());
        }

        else{
            return new Card(this.getRank().next(), this.getSuit());
        }

    }


    @Override
    public String toString(){
        return String.format("%s of %s", aRank, aSuit);

    }
}