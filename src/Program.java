import java.util.EnumMap;

public class Program {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);

    private static Show createNoShow(){
        return new Show() {
            @Override
            public String description() {
                return "";
            }

            @Override
            public int runningTime() {
                return 0;
            }

            @Override
            public Show copy() {
                return null;
            }

            @Override
            public void addWeekend() {

            }
        };
    }

    private static final Show NoShow = createNoShow();



    public Program() {
        clear();
    }

    /**
     * Clear the program by removing all existing shows.
     */
    public void clear() {
        for(Day day : Day.values()){
            aShows.put(day, NoShow);
        }


    }

    /**
     * Adds a new show to the program. Overrides any existing show on that day.
     *
     * @param pShow The show to add.
     * @param pDay  The day when the show takes place.
     */
    public void add(Show pShow, Day pDay) {
        assert pShow != null && pDay != null;
        aShows.put(pDay, pShow);

    }

    /**
     * Removes a show from the program.
     *
     * @param pDay The day when we want to zap the show.
     */
    public void remove(Day pDay) {
        assert pDay != null;
        aShows.put(pDay, NoShow);
    }

    /**
     * @param pDay The day of the requested show.
     * @return A copy of the show on a given day.
     */
    public Show get(Day pDay) {
        assert pDay != null;
        return aShows.get(pDay).copy();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Day day : aShows.keySet()) {
            if (aShows.containsKey(day)) {
                result
                        .append(String.format("%9s", day.name()))
                        .append(": ")
                        .append(aShows.get(day).description())
                        .append("\n");
            }
        }
        return result.toString();
    }


    public Command clearCommand(){
        return new Command() {
            @Override
            public void execute() {
                clear();
            }
        };
    }

    public Command addCommand(Show pShow, Day pDay){
        return new Command() {
            @Override
            public void execute() {
                add(pShow, pDay);

            }
        };
    }

    public Command removeCommand(Day pDay){
       return new Command() {
           @Override
           public void execute() {
               remove(pDay);
           }
       };
    }
}