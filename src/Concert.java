
import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Concert extends AbstractShow
{
    private final String aPerformer;


    public Concert(String pTitle, String pPerformer, int pTime)
    {
       super(pTitle, pTime);
       aPerformer = pPerformer;

    }

    @Override
    protected String getSpecificDescription() {
        // Only provide the year - title and time handled by template
        return aPerformer;
    }


    public String getPerformer(){
        return aPerformer;
    }

    @Override
    public Show clone(){
        return (Concert) super.clone();
    }
}