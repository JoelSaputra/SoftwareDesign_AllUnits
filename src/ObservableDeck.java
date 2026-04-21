

import java.util.function.Consumer;

/**
 * Sample observable object where the Observer design pattern is applied using
 * functional-style design.
 *
 * See Section 9.5.
 */
public class ObservableDeck extends Deck {
    private Consumer<Card> aDrawHandler;

    public ObservableDeck(Consumer<Card> pDrawHandler) {
        aDrawHandler = pDrawHandler;
    }

    public Card draw() {
        Card card = super.draw();
        aDrawHandler.accept(card);
        return card;
    }
}