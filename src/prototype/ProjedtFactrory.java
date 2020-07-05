package prototype;

public class ProjedtFactrory {
    Project project;

    public ProjedtFactrory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject() {
        return (Project) project.copy();}
}
