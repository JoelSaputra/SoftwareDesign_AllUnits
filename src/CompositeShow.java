import java.util.*;

public class CompositeShow implements Show, Iterable<Show>{

    private List<Show> aShows = new ArrayList<>();

    public CompositeShow(Show... pShows){
       if( pShows.length > 5 || pShows.length < 2){
           throw new IllegalArgumentException("Arguments should be between two and five shows inclusively");
       }
       aShows.addAll(List.of(pShows));
    }


    @Override
    public String title() {
        return "";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public int time() {
        return 0;
    }

    @Override
    public Iterator<Show> iterator() {
        return null;
    }
}
