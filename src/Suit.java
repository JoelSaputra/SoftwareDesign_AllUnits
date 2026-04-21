public enum Suit {
    CLUBS, DIAMONDS, SPADES, HEARTS;

    public enum Color { RED, BLACK }

    /**
     * @return The color of the suit.
     */
    public Color color() {
        if (this == CLUBS || this == SPADES) {
            return Color.BLACK;
        }
        else {
            return Color.RED;
        }
    }
}