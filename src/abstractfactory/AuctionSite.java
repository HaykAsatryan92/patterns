package abstractfactory;

import abstractfactory.webSiteTeam.WebSIteProjectTeamfactory;
import org.w3c.dom.ls.LSOutput;

import java.awt.event.AdjustmentEvent;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamfactory projectTeamfactory =  new WebSIteProjectTeamfactory();
        Developer developer = projectTeamfactory.getDeveloper();
        CodeTester codeTester = projectTeamfactory.getCodeTester();
        ProhectManager prohectManager  =projectTeamfactory.getProjectmanager();
        System.out.println("Creating auction site...");
        developer.writeCod();
        codeTester.codeTest();
        prohectManager.manageProhect();
        System.out.println("happy end");

    }



}
