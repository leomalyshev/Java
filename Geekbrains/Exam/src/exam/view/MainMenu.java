package exam.view;

import exam.view.command.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;
    public MainMenu(ConsoleUI consoleUI) {
        this.commandList = new ArrayList<>();
        commandList.add(new AddAnimal(consoleUI));
        commandList.add(new GetInfo(consoleUI));
        commandList.add(new SortByBirthday(consoleUI));
        commandList.add(new SetCommands(consoleUI));
        commandList.add(new Finish(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void execute(int numCommand) throws IOException, ClassNotFoundException {
        Command command = commandList.get(numCommand - 1);
        command.execute();
    }

    public int size(){
        return commandList.size();
    }
}
