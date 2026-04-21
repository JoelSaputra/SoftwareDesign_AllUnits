import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

class Program implements ShowSubject{

    private final List<ShowObserver> aObservers = new ArrayList<>();
    private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);


    @Override
    public void attach(ShowObserver pObserver) {
        assert pObserver != null;
        aObservers.add(pObserver);
    }

    @Override
    public void detach(ShowObserver pObserver) {
        assert pObserver != null;
        aObservers.remove(pObserver);
    }

    @Override
    public void notifyObservers(Day day, String action, Show show) {
        for(ShowObserver showObserver : aObservers){
            showObserver.update(day, action, show);
        }
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }



    public void add(Show pShow, Day pDay) {
        System.out.println("Adding show: " + pShow.description() + " on " + pDay);
        notifyObservers(pDay, "add", pShow);
    }

    public void remove(Day pDay) {
        System.out.println("Removing show on " + pDay);
        notifyObservers(pDay, "Removed", aShows.get(pDay));
    }
}