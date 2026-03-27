import java.util.*;

public class EnhancedHand implements Iterable<Card>, Comparable<EnhancedHand>{

    private final int aNumberOfCards;
    private final List<Card> aHand;
    private final Comparator<Card> aComparator;


    public EnhancedHand(int pNumberOfCards, Comparator<Card> pComparator){

        assert pNumberOfCards > 0;
        assert pComparator != null;
        aNumberOfCards = pNumberOfCards;
        List<Card> pHand = new ArrayList<>();
        aHand = pHand;
        aComparator = pComparator;

    }

    public void add(Card pCard){    //Change this for exercise 9
        assert !this.isFull();
        assert pCard != null;
        aHand.add(pCard);
        Collections.sort(aHand, aComparator);
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
    public int compareTo(EnhancedHand otherHand){
        return this.size() - otherHand.size();
    }

    public static Comparator<EnhancedHand> compareByRank(Rank pRank){
        return new Comparator<EnhancedHand>() {
            @Override
            public int compare(EnhancedHand pHand1, EnhancedHand pHand2) {
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



