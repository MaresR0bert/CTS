package ro.ase.acs.template;

public class RomanianCusineLunch extends LunchTemplate{
    @Override
    protected void mainCourse() {
        System.out.println("Shaorma romaneasca");
    }

    @Override
    protected void dessert() {
        System.out.println("Shaorma cu ceva dulce romanesc idk");
    }

    @Override
    protected void appetizer() {
        System.out.println("Mini Shaorma de romani, un fel de aperitiv, idk nu ma pricep nu sunt roman, sunt magyar");
    }
}
