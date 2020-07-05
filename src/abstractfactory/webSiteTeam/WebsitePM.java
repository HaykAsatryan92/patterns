package abstractfactory.webSiteTeam;

import abstractfactory.ProhectManager;

public class WebsitePM implements ProhectManager {
    @Override
    public void manageProhect() {
        System.out.println("Website project manager manages project...");
    }
}
