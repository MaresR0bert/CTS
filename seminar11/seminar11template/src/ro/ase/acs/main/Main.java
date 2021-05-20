package ro.ase.acs.main;

import ro.ase.acs.template.FineDiningLunch;
import ro.ase.acs.template.LunchTemplate;
import ro.ase.acs.template.RomanianCusineLunch;

public class Main {
    public static void main(String[] args) {
        LunchTemplate lunchTemplate = new FineDiningLunch();
        lunchTemplate.takeLunch();
        System.out.println(System.lineSeparator());
        lunchTemplate = new RomanianCusineLunch();
        lunchTemplate.takeLunch();
    }
}
