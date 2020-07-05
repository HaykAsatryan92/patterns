package abstractfactory.banking;

import abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCod() {
        System.out.println("java developer writes code on java...");
    }
}
