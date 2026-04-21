public interface Filter {

    /**
     * @param pCard The card to test
     * @return True if this filter accepts pCard
     * @pre pCard != null
     */
    boolean accept(Card pCard);
}