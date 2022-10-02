package decoratorP1;

public class Main {
    public static void main(String[] args) {
        Developer dev = new SeniorDeveloper(new JavaDeveloper());
        Developer dev2 = new JavaTeamLead(new JavaDeveloper());

        System.out.println(dev.makeJob());
        System.out.println(dev2.makeJob());
    }
}
