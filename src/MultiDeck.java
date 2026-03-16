import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiDeck {
    private final List<Deck> aDecks = new ArrayList<>();


    public MultiDeck(int pNumberOfDecks){
        for(int i = 0; i < pNumberOfDecks; i++){
            aDecks.add(new Deck());
        }

    }


    //Shallow Copy
    public MultiDeck(MultiDeck pMultiDeck){
        assert pMultiDeck != null;
        List<Deck> copyDecks = new ArrayList<>(pMultiDeck.aDecks);

    }

    //Deep Copy
    public MultiDeck (MultiDeck pMultiDeck, String whichCopyConstructor) {

        List<Deck> copyDecks = new ArrayList<>();
        for (Deck deck : pMultiDeck.aDecks) {
            copyDecks.add(deck);
        }
    }











    }

