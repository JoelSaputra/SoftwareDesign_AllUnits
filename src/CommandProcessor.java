import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {

    private final List<Command> commandHistory = new ArrayList<>();



    public void consume(Command pCommand){
        pCommand.execute();
        commandHistory.add(pCommand);
    }

    public void undoLast(){
        assert !commandHistory.isEmpty();
        Command lastCommand = commandHistory.getLast();
        commandHistory.removeLast();
        lastCommand.undo();

    }











}
