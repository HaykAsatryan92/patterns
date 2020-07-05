package abstractfactory.banking;

import abstractfactory.ProhectManager;
import abstractfactory.ProjectTeamfactory;

public class BankProjectManager implements ProhectManager {
    @Override
    public void manageProhect() {
        System.out.println("bank proect manager manages project...");
    }
}
