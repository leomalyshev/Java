package exam.presenter;

import exam.model.animal.Animal;
import exam.model.registry.RegistryItem;
import exam.model.service.Service;
import exam.view.View;

import java.util.List;
import java.util.Scanner;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.service = new Service();
        this.view = view;
    }
    public RegistryItem createAnimal(Scanner scanner){
        return service.createAnimal(scanner);
    }
    public String addAnimal(RegistryItem animal){
        return service.addAnimal(animal);
    }

    public void sortByBirthday(){
        service.sortByBirthday();
    }
    public void getInfo(){
        String answer = service.getInfo();
        view.printAnswer(answer);
    }
    public String getCommand(long Id){
        return service.getCommands(Id);
    }
    public void setCommands(Long Id, String command) {
        service.setCommands(Id, command);
    }
}
