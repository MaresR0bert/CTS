package ro.ase.acs.chain;

public class SalesManager extends CallCenterHandler {
    @Override
    public boolean refund(double sum) {
        if(sum < 5000){
            System.out.println("Refund was handled by sales manager");
            return true;
        } else if (nextHandler != null){
            return nextHandler.refund(sum);
        }
        System.out.println("Refund cannot be handled via Call Center");
        return false;
    }
}
