public abstract class AbstractShow implements Show{
    private String aTitle;
    private  int aTime;

    protected AbstractShow(String pTitle, int pTime){
        assert pTitle != null;
        assert pTime > 0;
        aTitle = pTitle;
        aTime = pTime;
    }

    @Override
    public String title()
    {
        return aTitle;
    }

    @Override
    public int time()
    {
        return aTime;
    }

    @Override
    public final String description() {
        // The template: TITLE: [specific details] (TIME minutes)
        return String.format("%s: [%s] (%d minutes)",
                title(),
                getSpecificDescription(),
                time());
    }

    protected abstract String getSpecificDescription();

    public void setTitle(String pTitle){
        aTitle = pTitle;

    }

    public void setTime(int pTime){
        assert pTime > 0;
        aTime = pTime;
    }

    @Override
    public Show clone(){
        try{
            return (Show) super.clone();
        }

        catch(CloneNotSupportedException e){
            throw new AssertionError(e);
        }
    }

    }


