package ro.ase.acs.main;

import ro.ase.acs.template.FineDiningLunch;
import ro.ase.acs.template.LunchTemplate;
import ro.ase.acs.template.RomanianCusineLunch;

public class Main {
    public static void main(String[] args) {
//        LunchTemplate lunchTemplate = new FineDiningLunch();
//        lunchTemplate.takeLunch();
//        System.out.println(System.lineSeparator());
//        lunchTemplate = new RomanianCusineLunch();
//        lunchTemplate.takeLunch();

        String s = "something";
        String t = "something";
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println(Integer.toHexString(t.hashCode()));
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(t));
        System.out.println(System.identityHashCode("something"));
        if(s == t){
            System.out.println("Correct");
        }
    }
}
