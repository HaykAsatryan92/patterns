package bridge;

public class  BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }
    @Override
    public void developProgram() {
        System.out.println("bank Sysytem development in progress...");
        developer.writeCode();
    }
}
