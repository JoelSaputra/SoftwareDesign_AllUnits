public class ShowDecorator implements Show {

    private final Show aShow;
    private final String aSpeaker;
    private final int aSpeechTime;


    public ShowDecorator(Show pShow, String pSpeaker, int pSpeechTime){
        aShow = pShow;
        aSpeaker = pSpeaker;
        aSpeechTime = pSpeechTime;

    }


    @Override
    public String title() {
        return "";
    }

    @Override
    public String description() {
        return "[" + aSpeaker + " introduces " + aShow.description() + "]";
    }

    @Override
    public int time() {
        return 0;
    }



    public int runningTime() {
        return aSpeechTime;
    }




    public Show copy() {
        return null;
    }


    public void addWeekend() {
    }
}
