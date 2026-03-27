import java.util.*;


public class Main{



    public static void main(String[] args) {
        Hand hand1 = new Hand(10);
        Hand hand2 = new Hand(10);

        hand1.add(new Card(Rank.ACE, Suit.SPADES)); // size 1
        hand2.add(new Card(Rank.KING, Suit.HEARTS));
        hand2.add(new Card(Rank.QUEEN, Suit.CLUBS)); // size 2

        List<Hand> handList = new ArrayList<>();
        handList.add(hand1);
        handList.add(hand2);

        Collections.sort(handList, Hand.compareByIncrease());



    }




}


