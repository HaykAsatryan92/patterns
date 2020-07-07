package facade;

public class BugTracker {
    private boolean activeSprint;
    public boolean isActiveSpring(){
        return  activeSprint;
    }
    public void startSpring() {
        System.out.println("Spring is active");
        activeSprint = true;
    }
    public void finishSpring(){
        System.out.println("Sprint is  not active...");
        activeSprint =  false;
    }
 }
