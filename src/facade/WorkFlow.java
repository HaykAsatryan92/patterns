package facade;

public class WorkFlow {
    Developer developer =  new Developer();
    Job job =  new Job();
    BugTracker bugTracker =  new BugTracker();
    public void solveProblems() {
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeforeDeadLine(bugTracker);

    }
}
