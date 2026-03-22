import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Iterable<Card>, Comparable<Hand>{

    private int aNumberOfCards;
    private List<Card> aHand;


    public Hand(int pNumberOfCards){

        assert pNumberOfCards > 0;
        aNumberOfCards = pNumberOfCards;
        List<Card> pHand = new ArrayList<>();
        aHand = pHand;
    }

    public void add(Card pCard){
        assert !this.isFull();
        assert pCard != null;
        aHand.add(pCard);
    }

    public void remove(Card pCard){
        assert !this.isEmpty();
        assert pCard != null;
        aHand.remove(pCard);
    }

    public boolean contains(Card pCard){
        assert !this.isEmpty();
        assert pCard != null;
        return aHand.contains(pCard);
    }

    public boolean isEmpty(){
        if (this.size() == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (this.size() == aNumberOfCards){
            return true;
        }
        return false;
    }

    public int size(){
        return aHand.size();
    }

    public Card getCard(Card pCard){
        for(Card card : this){
            if(card.equals(pCard)){
                return card;
            }
        }

        return null;

    }

    public Card getCardWithIterator(Card pCard){

        Iterator<Card> iterator = this.iterator();

        while(iterator.hasNext()){
            Card nextCard = iterator.next();

            if(pCard.equals(nextCard)){
                return nextCard;
            }
        }
        return null;
    }


    @Override
    public Iterator<Card> iterator(){
        return aHand.iterator();
    }

    @Override
    public int compareTo(Hand otherHand){
        return this.size() - otherHand.size();
    }

    public static Comparator<Hand> compareByRank(Rank pRank){
        return new Comparator<Hand>() {
            @Override
            public int compare(Hand pHand1, Hand pHand2) {
                int total_pHand1 = 0;
                int total_pHand2 = 0;

                for(Card card : pHand1){
                    if(card.rank().equals(pRank)){
                        total_pHand1++;
                    }
                }

                for(Card card : pHand2){
                    if(card.rank().equals(pRank)){
                        total_pHand2++;
                    }
                }

                return total_pHand1 - total_pHand2;

            }

        };
    }


    public static Comparator<Hand> compareByIncrease(){
        return new Comparator<Hand>() {
            public int compare(Hand pHand1, Hand pHand2){
                return pHand1.size() - pHand2.size();
            }
        };


    }

    public static Comparator<Hand> compareByDecrease() {
        return new Comparator<Hand>() {
            public int compare(Hand pHand1, Hand pHand2) {
                return pHand2.size() - pHand1.size();
            }
        };

    }






    }



