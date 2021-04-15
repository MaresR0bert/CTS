package ro.ase.acs.main;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<Character,CostumCharacter> map = new HashMap<>();

    public static CostumCharacter getCharacter(char aChar){
        if(!map.containsKey(aChar)){
            CostumCharacter costumCharacter = new CostumFontCharacter(aChar, "Arial");
            map.put(aChar, costumCharacter);
            System.out.println("Character created");
        } else {
            System.out.println("Character reused");
        }
        return map.get(aChar);
    }
}
