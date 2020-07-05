package abstractfactory;

import abstractfactory.banking.BankingTeamFactory;

public class SuperbankSystem   {
    public static void main(String[] args) {
        ProjectTeamfactory projectTeamfactory = new BankingTeamFactory();
        Developer developer =  projectTeamfactory.getDeveloper();
        CodeTester codeTester =  projectTeamfactory.getCodeTester();
        ProhectManager prohectManager =  projectTeamfactory.getProjectmanager();
        System.out.println("Creating bank system...");
        developer.writeCod();
        codeTester.codeTest();
        prohectManager.manageProhect();

    }
}
