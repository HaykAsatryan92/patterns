package factory;

public class CppDeveloeprfactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CPP();
    }
}
