import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Optional;
/**
 * Implementation of a playing card. This class yields immutable objects.
 */
public class CardWithJoker {

    private final Optional<Rank> aRank;
    private final Optional<Suit> aSuit;
    private boolean isJoker ;
    private static final Random aRandom = new Random();




    public CardWithJoker(Rank pRank, Suit pSuit) {
            aRank = Optional.of(pRank);
            aSuit = Optional.of(pSuit);
            isJoker = false;

    }

    public CardWithJoker(){
        isJoker = true;
        aRank = Optional.empty();
        aSuit = Optional.empty();


    }



    /**
     * @return The rank of the card.
     */
    public Optional<Rank> getRank() {
        return aRank;
    }

    public boolean isJokerCheck(){
        return this.isJoker;
    }

    /**
     * @return The suit of the card.
     */
    public Optional<Suit> getSuit() {
        return aSuit;
    }

    public static CardWithJoker random(){
        Random newRandom = new Random();
        List<CardWithJoker> randomHolder = new ArrayList<>();
        randomHolder.add(new CardWithJoker(Rank.values()[aRandom.nextInt(Rank.values().length)], Suit.values()[aRandom.nextInt(Suit.values().length)]));
        randomHolder.add(new CardWithJoker());

        CardWithJoker randomCard = randomHolder.get(newRandom.nextInt(2));


        for (CardWithJoker card : randomHolder){
            randomHolder.remove(card);
        }

        return randomCard;

    }


    public CardWithJoker nextCard(){
        if(this.getRank().equals(Rank.KING)){

            return new CardWithJoker(this.getRank().get().next(), this.getSuit().get().next());

        }

        else if(this.isJokerCheck()){
            return null;
        }
        else{
            return new CardWithJoker(this.getRank().get(), this.getSuit().get());
        }

    }


    @Override
    public String toString(){
        return String.format("%s of %s", aRank, aSuit);

    }
}