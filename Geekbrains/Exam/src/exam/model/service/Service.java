package exam.model.service;

import exam.model.animal.Animal;
import exam.model.animal.AnimalComparatorByBirthday;
import exam.model.registry.Registry;
import exam.model.registry.RegistryItem;

import java.util.Scanner;

public class Service {

    private Registry registry;

    public Service() {
        this.registry = new Registry();
    }
    public RegistryItem createAnimal(Scanner scanner){
        return registry.createAnimal(scanner);
    }
    public String addAnimal(RegistryItem animal){
        return registry.addAnimal(animal);
    }

    public String getInfo(){
        return registry.toString();
    }
    public void sortByBirthday(){
        registry.sortByBirthday();
    }
    public String getCommands(long Id){
        return registry.getCommands(Id);
    }

    public void setCommands(Long Id, String command) {
        registry.setCommands(Id, command);
    }
}
