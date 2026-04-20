
import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Concert implements Show {

    private String aTitle;
    private String aPerformer;
    private int aRunningTime;

    /**
     * @param pTitle     The title of the concert
     * @param pPerformer The name of the artist or orchestra performing
     * @param pTime      The running time of the concert.
     */
    public Concert(String pTitle, String pPerformer, int pTime) {
        aTitle = pTitle;
        aPerformer = pPerformer;
        aRunningTime = pTime;
    }

    public Concert(Concert pConcert) {
        this(pConcert.aTitle, pConcert.aPerformer, pConcert.aRunningTime);
    }

    @Override
    public String description() {
        return String.format("%s by %s", aTitle, aPerformer);
    }

    @Override
    public int runningTime() {
        return aRunningTime;
    }

    @Override
    public Show copy() {
        return new Concert(this);
    }

    @Override
    public void addWeekend() {
        aRunningTime++;

    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aPerformer, aRunningTime);
    }


    @Override
    public boolean equals(Object obj) {
        if( obj == this){
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Concert other = (Concert) obj;

        return Objects.equals(aTitle, other.aTitle) && Objects.equals(aPerformer, other.aPerformer)
                && aRunningTime == other.aRunningTime;

    }


}