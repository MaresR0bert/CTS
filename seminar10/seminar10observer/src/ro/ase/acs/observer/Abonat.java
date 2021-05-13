package ro.ase.acs.observer;

public class Abonat implements Observer {
    private String email;

    public Abonat(String email) {
        this.email = email;
    }

    @Override
    public void primesteMail(String subiect) {
        System.out.println("Mesaj trimis catre: "+this.email);
    }


}
