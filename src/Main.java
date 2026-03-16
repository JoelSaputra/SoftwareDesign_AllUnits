import java.util.Random;


public class Main{



    public static void main(String[] args) {
        // Create original MultiDeck with some decks
        MultiDeck original = new MultiDeck(10);

        // Create a copy using your copy constructor
        MultiDeck copy = new MultiDeck(original, "deepCopyTest");

        // Now verify they share the same Deck objects
        System.out.println("Done");
    }




}


