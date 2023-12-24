package exam.model.animal;

import exam.model.registry.RegistryItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pet implements Animal, RegistryItem {
    private String name;
    private LocalDate age;
    private long Id;
    private List<String> commands = new ArrayList<>();
    private LocalDate birthday;
    public void setCommands(String command) {
        List<String> commandArray = List.of(command.split(", "));
        this.commands.addAll(commandArray);
    }

    public List<String> getCommands(long Id) {
        return commands;
    }
    public String BeKind(){
        return "Меня начали гладить, класс!";
    }
    public String Play(){
        return "Начал играть";
    }
    public String getName() {
        return name;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getAge() {
        return age;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: " + this.Id + ", имя: " + getName() + ", дата рождения: " + getBirthday() + ", команды: " );
        for (String cd: getCommands(this.Id)){
            sb.append(cd + ", ");
        }
        return sb.toString();
    }
}
