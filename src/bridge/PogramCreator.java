package bridge;

public class PogramCreator {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper()), new StockExch(new CppDeveloper())};
        for(Program p: programs) {
            p.developProgram();
        }
    }
}
