import java.util.Observer;

public interface ShowSubject {
    void attach (ShowObserver pObserver);
    void detach (ShowObserver pObserver);
    void notifyObservers (Program.Day day, String action, Show show);
}
