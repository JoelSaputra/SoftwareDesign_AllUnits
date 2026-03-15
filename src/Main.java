

public class Main{
    public static void main (String args[]){
        Card card = new Card(Rank.FIVE, Suit.DIAMONDS);
        System.out.println(card.getSuit().color());

    }
}


