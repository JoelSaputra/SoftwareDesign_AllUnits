import java.util.Random;


public class Main{




    public static void main(String[] args) {
        Card randomCard = Card.random();
        System.out.println(randomCard.toString());
        System.out.println(randomCard.nextCard().toString());

    }






}


