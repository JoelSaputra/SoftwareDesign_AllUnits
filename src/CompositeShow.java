import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CompositeShow implements Show{

    private List<Show> aShows = new ArrayList<>();

    public CompositeShow(Show... pShows){
       if( pShows.length > 5 || pShows.length < 2){
           throw new IllegalArgumentException("Arguments should be between two and five shows inclusively");
       }
       aShows.addAll(List.of(pShows));
    }



    @Override
    public String description() {
        StringJoiner description = new StringJoiner("; ", "[", "]");
        for(Show show : aShows){
            description.add(show.description());

        }
        return description.toString();
    }

    @Override
    public int runningTime() {
        return 0;
    }

    @Override
    public Show copy() {
        return null;
    }

    public void addWeekend(){
        for(Show show : aShows){
            show.addWeekend();
            System.out.println(show.runningTime());
        }
    }
}
