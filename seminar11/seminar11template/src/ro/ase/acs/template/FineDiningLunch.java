package ro.ase.acs.template;

public class FineDiningLunch extends LunchTemplate{
    @Override
    protected void mainCourse() {
        System.out.println("Shaorma cu maioneza");
    }

    @Override
    protected void dessert() {
        System.out.println("Shaorma cu ciocolata");
    }

    @Override
    protected void appetizer() {
        System.out.println("Mini-shaorma");
    }
}
