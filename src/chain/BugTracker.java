package chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier =  new SimpleReportNotify(Priority.RUITINE);
        Notifier emailNotifier =  new EmailNotifier(Priority.IMPORTANT);
        Notifier ssmNotifier = new SimpleReportNotify(Priority.ASAP);

        reportNotifier.setNextnotifier(emailNotifier);
        emailNotifier.setNextnotifier(ssmNotifier);

        reportNotifier.notifyManager("Everything is okay", Priority.RUITINE);
        reportNotifier.notifyManager("Everything is bad", Priority.IMPORTANT);
        reportNotifier.notifyManager("we have shit", Priority.ASAP);
    }
}
