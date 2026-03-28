//In a given design context simulated by some stub method performShuffle,
// we need objects that can be shuffled, but where shufflable objects can also be absent.
// Using interfaces, design a type hierarchy where the client code only requires a method shuffle() from some other object.
// In addition, use the Null Object pattern to support the situation where shufflable objects can be null.
//
// Consider that the following code is the design context:
//
//public static void performShuffle(SOME_TYPE pSomeArgument) {
//    if ( /* pSomeArgument is not absent */ ) {
//       pSomeArgument.shuffle();
//    }
//}


public interface Shuffable {

    public static final Shuffable NULL_SHUFFABLE = new Shuffable() {
        public void shuffle(){}
    };


    void shuffle();



}
