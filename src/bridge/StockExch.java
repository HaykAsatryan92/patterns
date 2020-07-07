package bridge;

public class StockExch extends Program {
    public StockExch(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.writeCode();
    }
}
