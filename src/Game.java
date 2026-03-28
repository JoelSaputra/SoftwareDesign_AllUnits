import java.util.Comparator;

public class Game {

    private static final Comparator<Card> NULL_COMPARATOR = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            return 0;
        }
    };

    private static final Comparator<Card> aComparator = NULL_COMPARATOR;





}
