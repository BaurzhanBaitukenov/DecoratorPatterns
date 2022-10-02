package decoratorP1;

public class SeniorDeveloper extends DeveloperDecorator{


    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String codReview(){
        return " Making code review";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + codReview();
    }
}
