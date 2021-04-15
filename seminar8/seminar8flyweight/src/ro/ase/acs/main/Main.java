package ro.ase.acs.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char key = 0;
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        while (key != '^') {
            x++;
            if (x > 10) {
                y++;
                x = 0;
            }
            key = scanner.next().charAt(0);
            CostumCharacter costumCharacter = CharacterFactory.getCharacter(key);
            costumCharacter.display(new Location(x,y));
            //example
            ((CostumFontCharacter)costumCharacter).setFont("Times New Roman");
        }
    }
}
