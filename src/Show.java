/**
 * Represents a performance that can take place in a theater. All
 * implementations of this interface should be immutable.
 */
public interface Show extends Cloneable
{
    /**
     * @return The title of the show.
     */
    String title();

    /**
     * @return A description of the show.
     */
    String description();

    /**
     * @return The total time required for the show.
     */
    int time();
}