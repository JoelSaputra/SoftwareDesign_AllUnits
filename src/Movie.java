// Provided simple Movie class
class Movie implements Show {
    private final String aTitle;
    private final int aYear;
    private final int aTime;

    public Movie(String pTitle, int pYear, int pTime) {
        aTitle = pTitle;
        aYear = pYear;
        aTime = pTime;
    }

    @Override
    public String title() { return aTitle; }

    @Override
    public String description() { return String.format("%s (%d)", aTitle, aYear); }

    @Override
    public int time() { return aTime; }

    @Override
    public Show copy() { return new Movie(aTitle, aYear, aTime); }
}
