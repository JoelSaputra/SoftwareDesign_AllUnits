import java.util.Iterator;

public interface StateOfHand extends Iterable<Card> {

    public boolean contains(Card pCard);

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public Card getCardWithIterator(Card pCard);

    public Card getCard(Card pCard);

    public Iterator<Card> iterator();


}
