package chain;

public abstract class Notifier {
    private  int priority;
    private Notifier nextnotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextnotifier(Notifier nextnotifier) {
        this.nextnotifier = nextnotifier;
    }
    public  void  notifyManager( String message, int level) {
        if(level >= priority) {
            write(message);
        }
        if(nextnotifier!=null) {
            nextnotifier.notifyManager(message,level );
        }
    } ;
    public abstract void  write(String message) ;
}
