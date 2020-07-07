package decorator;

public class DeveloeprDecaorator  implements Developer{
    Developer developer;

    public DeveloeprDecaorator(Developer developer) {
        this.developer = developer;
    }


    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
