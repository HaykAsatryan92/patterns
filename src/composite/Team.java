package composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements  Developer {
    private List<Developer> developers = new ArrayList<>();
    public  void addDeveloper( Developer developer) {
        developers.add(developer);
    }
    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        createProject();
    }

    public void createProject() {
        System.out.println("Team is starting create project...\n");
        for(Developer developer: developers) {
            developer.writeCode();
        }
    }
}
