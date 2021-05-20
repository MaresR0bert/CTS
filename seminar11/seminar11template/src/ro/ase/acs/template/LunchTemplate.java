package ro.ase.acs.template;

public abstract class LunchTemplate {
    protected abstract void mainCourse();
    protected abstract void dessert();
    protected abstract void appetizer();

    public void takeLunch(){
        System.out.println("Appetizer: ");
        appetizer();
        System.out.println("Main Course: ");
        mainCourse();
        System.out.println("Dessert: ");
        dessert();
    }
}
