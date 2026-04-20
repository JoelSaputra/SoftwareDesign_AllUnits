
import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Concert implements Show
{
    private String aTitle;
    protected String aPerformer;
    private int aTime;

    public Concert(String pTitle, String pPerformer, int pTime)
    {
        aTitle = pTitle;
        aPerformer = pPerformer;
        aTime = pTime;
    }

    public String getTitle()
    {
        return aTitle;
    }

    public void setTitle(String pTitle)
    {
        aTitle = pTitle;
    }

    @Override
    public String title()
    {
        return aTitle;
    }

    @Override
    public String description()
    {
        return String.format("%s by %s", aTitle, aPerformer);
    }

    @Override
    public int time()
    {
        return aTime;
    }

    public void setTime(int pTime)
    {
        aTime = pTime;
    }
}