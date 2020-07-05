package factory;

public class PHPdeveloperfactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }
}
