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
    public String description() {
        return "[" + aSpeaker + " introduces " + aShow.description() + "]";
    }


    @Override
    public int runningTime() {
        return aSpeechTime + aShow.runningTime();
    }



    @Override
    public Show copy() {
        return null;
    }

    @Override
    public void addWeekend() {
    }
}
