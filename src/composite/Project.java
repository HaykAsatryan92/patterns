package composite;



public class Project {
    public static void main(String[] args) {
        Team team =  new Team();
        Developer fistJavaDeveloper =  new JavaDeveloper();
        Developer secondJavaDeveloper =  new JavaDeveloper();
         Developer cppDeveloper = new CppDeveloper();
        team.addDeveloper(fistJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();


    }
}
