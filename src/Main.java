import java.util.*;


public class Main{
    public static void main(String[] args) {

        Show showA = new Movie("Tomb Raider", 2001, 1900);
        Show showB = new Movie("Maze Runner", 2018, 130);
        Show showC = new Concert("Concert 1", "Artist X", 100);

        CompositeShow exercise01 = new CompositeShow(showA, showB, showC);

        exercise01.addWeekend();




    }




}


