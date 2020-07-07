package decorator;

public class JavaTeamLead extends SeniorJavaDeveloper {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob()+"\n chek the code";
    }
}
