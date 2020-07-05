package abstractfactory.banking;

import abstractfactory.CodeTester;

public class QAtester implements CodeTester {
    @Override
    public void codeTest() {
        System.out.println("QA tester tests banking code");
    }
}
