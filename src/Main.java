import java.util.*;


public class Main{
    public static void main(String[] args) {

        Show showA = new Movie("Tomb Raider", 2001, 1900);
        Show showB = new Movie("Maze Runner", 2018, 130);

        ShowDecorator newShow = new ShowDecorator(showB, "Elon Musk", 108);

        CompositeShow shows = new CompositeShow(newShow, showA);

       System.out.println(shows.runningTime());


       Program program1 = new Program();
       program1.addCommand(showA, Program.Day.MONDAY);
       program1.addCommand(showB, Program.Day.SATURDAY);








    }




}


