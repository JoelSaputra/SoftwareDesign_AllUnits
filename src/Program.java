import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

class Program implements ShowSubject{
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // TODO: Add list of observers
    // TODO: Add observer management methods

    public void add(Show pShow, Day pDay) {
        System.out.println("Adding show: " + pShow.description() + " on " + pDay);
        // TODO: Notify observers
    }

    public void remove(Day pDay) {
        System.out.println("Removing show on " + pDay);
        // TODO: Notify observers
    }
}