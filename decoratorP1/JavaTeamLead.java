package decoratorP1;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String weekReport(){
        return " Week report of code";
    }

    @Override
    public String makeJob(){
        return developer.makeJob() + weekReport();
    }
}
