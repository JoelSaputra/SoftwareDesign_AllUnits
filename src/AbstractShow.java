public abstract class AbstractShow implements Show{
    private final String aTitle;
    private final int aTime;

    protected AbstractShow(String pTitle, int pTime){
        assert pTitle != null;
        assert pTime > 0;
        aTitle = pTitle;
        aTime = pTime;
    }

    @Override
    public String title()
    {
        return aTitle;
    }

    @Override
    public int time()
    {
        return aTime;
    }

    @Override
    public final String description() {
        // The template: TITLE: [specific details] (TIME minutes)
        return String.format("%s: [%s] (%d minutes)",
                aTitle,
                getSpecificDescription(),
                aTime);
    }

    protected abstract String getSpecificDescription();
}
