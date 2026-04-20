
import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Movie extends AbstractShow
{
    private final int aYear;

    public Movie(String pTitle, int pYear, int pTime)
    {
       super( pTitle, pYear);
       aYear = pYear;
    }

    @Override
    public String description()
    {
        return String.format("%s (%d)", title(), aYear);
    }

}