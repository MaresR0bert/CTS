package ro.ase.acs.main;

import ro.ase.acs.observer.Abonat;
import ro.ase.acs.observer.Website;

public class Main {
    public static void main(String[] args) {
        Website website = new Website();
        website.setAdresa("facemsoft.com");

        Abonat abonat1 = new Abonat("cosmin@gg.ro");
        Abonat abonat2 = new Abonat("cosmin2@gg.ro");
        Abonat abonat3 = new Abonat("cosmin3@gg.ro");

        website.abonareNewsletter(abonat1);
        website.abonareNewsletter(abonat2);
        website.abonareNewsletter(abonat3);

        website.adaugaArticol("Articol");

        website.dezabonareNewsletter(abonat3);

        website.adaugaArticol("Articol 2");
    }
}
