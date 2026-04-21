
import java.util.*;

/**
 * Implementation of a playing card. This class yields immutable objects. This
 * version of the class also implements the Comparable interface and compares
 * cards by rank, with an undefined order for cards of the same rank. The class
 * also includes a static factory method to create Comparator objects that can
 * compare cards according to their rank.
 */
public class Card implements Comparable<Card> {

    private static final Map<Rank, Map<Suit,Card>> CARDS = new IdentityHashMap<>();

    private Rank aRank;
    private Suit aSuit;

    /**
     * Creates a new card object.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     * @pre pRank != null
     * @pre pSuit != null
     */
    private Card(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    public static Card getCard(Rank pRank, Suit pSuit){
        if(CARDS.containsKey(pRank) && CARDS.get(pRank).containsKey(pSuit)){
            return CARDS.get(pRank).get(pSuit);
        }

        Map<Suit, Card> suitCardHashMap = new HashMap<>();
        Card newCard = new Card(pRank, pSuit);
        suitCardHashMap.put(pSuit, newCard );
        CARDS.put(pRank, suitCardHashMap );
        return newCard;

    }

    /**
     * @return The rank of the card.
     */
    public Rank rank() {
        return aRank;
    }

    /**
     * @return The suit of the card.
     */
    public Suit suit() {
        return aSuit;
    }

    @Override
    public int compareTo(Card pCard) {
        return aRank.compareTo(pCard.aRank);
    }

    /**
     * Sample static factory method to create a comparator capable of comparing
     * cards by rank.
     *
     * @return The created comparator.
     */
    public static Comparator<Card> createByRankComparator() {
        return new Comparator<Card>() {
            public int compare(Card pCard1, Card pCard2) {
                return pCard1.aRank.compareTo(pCard2.aRank);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("%s of %s", aRank, aSuit);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(this.getClass() != o.getClass() || o == null ){
            return false;
        }

        Card other = (Card) o;
        return Objects.equals(other.aRank, this.aRank) && Objects.equals(other.aSuit, other.aSuit);
    }

    @Override
    public int hashCode(){
        return Objects.hash(aRank, aSuit);

    }





}

