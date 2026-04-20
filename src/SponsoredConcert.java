public class SponsoredConcert extends Concert{

    private String aSponsorName;
    private int aSponsorTime;


    public SponsoredConcert(String pTitle, String pPerformer, int pTime, String pSponsorName, int pSponsorTime){
        super( pTitle,  pPerformer, pTime );
        aSponsorName = pSponsorName;
        aSponsorTime = pSponsorTime;
    }

    @Override
    public String description() {
        return String.format("%s by %s", title(), aPerformer);
    }

    @Override
    public int time(){
        return super.time() + aSponsorTime;
    }
}
