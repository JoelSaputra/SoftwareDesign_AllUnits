public class CardUtils {
    public static boolean hasBlackSuit(Card pCard) {
        return pCard.suit().color() != Suit.Color.BLACK;
    }
}