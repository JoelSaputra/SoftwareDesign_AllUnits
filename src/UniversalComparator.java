import java.util.Comparator;

public class UniversalComparator implements Comparator<Hand> {

    private final ComparatorType aComparatorType;

    public enum ComparatorType{
        ASCENDING, DESCENDING;
    }

    public UniversalComparator(ComparatorType pComparatorType){
        assert (pComparatorType == ComparatorType.ASCENDING || pComparatorType == ComparatorType.DESCENDING);
        aComparatorType = pComparatorType;
        }




    public int compare(Hand pHand1, Hand pHand2){
        if (aComparatorType == ComparatorType.ASCENDING) {
            return pHand1.size() - pHand2.size();
        }

        else{
            return pHand2.size() - pHand1.size();
        }
    }



















}
