package abstractfactory.webSiteTeam;

import abstractfactory.Developer;

public class PHPdeveloepr implements Developer {
    @Override
    public void writeCod() {
        System.out.println("PHP developer writes PHP code");
    }
}
