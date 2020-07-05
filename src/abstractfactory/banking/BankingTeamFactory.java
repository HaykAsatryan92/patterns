package abstractfactory.banking;

import abstractfactory.CodeTester;
import abstractfactory.Developer;
import abstractfactory.ProhectManager;
import abstractfactory.ProjectTeamfactory;

public class BankingTeamFactory implements ProjectTeamfactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public CodeTester getCodeTester() {
        return  new QAtester();
    }

    @Override
    public ProhectManager getProjectmanager() {
        return new BankProjectManager();
    }
}
