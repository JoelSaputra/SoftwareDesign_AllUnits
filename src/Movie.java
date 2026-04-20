
import java.util.Objects;


/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Movie implements Show {

    private String aTitle;
    private int aYear;
    private int aRunningTime;

    /**
     * @param pTitle The title of the movie
     * @param pYear  The release year of the movie
     * @param pTime  The running time of the movie.
     */
    public Movie(String pTitle, int pYear, int pTime) {
        aTitle = pTitle;
        aYear = pYear;
        aRunningTime = pTime;
    }


    public Movie(Movie pMovie) {
        aTitle = pMovie.aTitle;
        aYear = pMovie.aYear;
        aRunningTime = pMovie.aRunningTime;
    }

    @Override
    public String description() {
        return String.format("%s (%d)", aTitle, aYear);
    }

    @Override
    public int runningTime() {
        return aRunningTime;
    }

    @Override
    public Show copy() {
        return new Movie(this);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aRunningTime, aTitle, aYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Movie other = (Movie) obj;
        return (this.aRunningTime == other.aRunningTime && Objects.equals(aTitle, other.aTitle) && this.aYear == other.aYear);

    }

    @Override
    public void addWeekend(){
        aRunningTime++;
    }


}