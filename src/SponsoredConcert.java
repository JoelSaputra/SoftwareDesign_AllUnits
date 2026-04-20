public class SponsoredConcert extends Concert{

    private String aSponsorName;
    private int aSponsorTime;


    public SponsoredConcert(String pTitle, String pPerformer, int pTime, String pSponsorName, int pSponsorTime){
        super( pTitle,  pPerformer, pTime );
        aSponsorName = pSponsorName;
        aSponsorTime = pSponsorTime;
    }

    @Override
    protected String getSpecificDescription() {
        // Only provide the year - title and time handled by template
        return super.getSpecificDescription();
    }
    @Override
    public int time(){
        return super.time() + aSponsorTime;
    }
}
