package facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if(bugTracker.isActiveSpring()) {
            System.out.println("Developer is solving problems...");
        } else System.out.println("developer is reading habr habr...");
    }
}
