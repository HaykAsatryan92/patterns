package main;

public class ProgramLoger {
    private static ProgramLoger programLoger;
    private static String logFile = "This is log file \n\n";

    public static synchronized ProgramLoger hetProgramLoger() {
        if (programLoger == null) {
            programLoger = new ProgramLoger();

        }
        return programLoger;
    }

    private ProgramLoger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void shologInfo() {
        System.out.println(logFile);
    }
}
