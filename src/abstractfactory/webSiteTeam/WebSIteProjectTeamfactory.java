package abstractfactory.webSiteTeam;

import abstractfactory.CodeTester;
import abstractfactory.Developer;
import abstractfactory.ProhectManager;
import abstractfactory.ProjectTeamfactory;

public class WebSIteProjectTeamfactory implements ProjectTeamfactory {
    @Override
    public Developer getDeveloper() {

        return new PHPdeveloepr();
    }

    @Override
    public CodeTester getCodeTester() {
        return new TesterPHP();
    }

    @Override
    public ProhectManager getProjectmanager() {
        return new WebsitePM();
    }
}
