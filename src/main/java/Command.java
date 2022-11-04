import java.util.List;

public class Command {
    List<String> commands;
    String commandText;

    Command(List<String> commands, String commandText){
        this.commands = commands;
        this.commandText = commandText;
    }
}
