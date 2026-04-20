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
    public String description() {
        StringJoiner description = new StringJoiner("; ", "[", "]");
        for(Show show : aShows){
            description.add(show.description());

        }
        return description.toString();

    }

    @Override
    public int runningTime() {
        int time = 0;
        for (Show show : aShows) {
            time += show.runningTime();
        }
        return time;
    }

    public void addWeekend(){
        for(Show show : aShows){
            show.addWeekend();
            System.out.println(show.runningTime());
        }
    }

    public Show getShow(Show pShow){
        for(Show show : this){
            if (pShow.equals(this)){
                return pShow;
            }
        }
        return null;
    }


    @Override
    public Show copy(){
        List<Show> showCopies = new ArrayList<>();
        for(Show show : this){
            if (show instanceof CompositeShow){
                show.copy();
            }
            else{
                showCopies.add(show);
            }
        }

        return new CompositeShow(showCopies.toArray(new Show[0]));

    }

    @Override
    public Iterator<Show> iterator() {
        return aShows.iterator();
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if( o == null || o.getClass() != this.getClass()){
            return false;
        }

        CompositeShow other = (CompositeShow) o;
        return Objects.equals(aShows, other.aShows);

    }

    @Override
    public int hashCode(){
        return Objects.hash(aShows);
    }
}
