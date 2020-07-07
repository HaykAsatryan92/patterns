package prototype;

public class VersionControlRunner {
    public static void main(String[] args) {

        Project master =  new Project(1 , "1-st project", "source code of first project");
        System.out.println(master);
     ProjedtFactrory projedtFactrory =  new ProjedtFactrory(master);
     Project masterClone =  projedtFactrory.cloneProject();
        System.out.println("===============================\n"+masterClone);
    }
}
