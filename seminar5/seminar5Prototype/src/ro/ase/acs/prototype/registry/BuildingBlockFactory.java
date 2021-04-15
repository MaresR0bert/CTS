package ro.ase.acs.prototype.registry;

import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;

import java.util.HashMap;

public class BuildingBlockFactory {
    private static HashMap<String, BuildingBlock> map = new HashMap<>();

    static {
        StoneBlock stoneBlock = new StoneBlock();
        map.put("stone", stoneBlock);
        WoodBlock woodBlock = new WoodBlock();
        map.put("wood", woodBlock);
    }

    public static BuildingBlock getBlock(String blockType) {
        BuildingBlock block = map.get(blockType);
        if (block != null) {
            try {
                return (BuildingBlock) block.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
