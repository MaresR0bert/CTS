package ro.ase.acs.models;

import java.util.Scanner;

public class Atm implements IAtm {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public float transaction() {
        System.out.println("Apasati 1 pt retraggere sau 2 pt depunere");
        String tasta = scanner.nextLine();
        boolean isRetragere = false;
        if(tasta.equals("1")){
            isRetragere = true;
        } else if(tasta.equals("2")){
            isRetragere = false;
        }
        System.out.println("Introduceti suma: ");
        float value = Float.valueOf(scanner.nextLine());
        if(isRetragere){
            return -value;
        } else {
            return value;
        }
    }
}
