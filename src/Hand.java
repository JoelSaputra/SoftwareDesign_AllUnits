import java.util.ArrayList;
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


}
