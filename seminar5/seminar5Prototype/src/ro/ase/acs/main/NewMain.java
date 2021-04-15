package ro.ase.acs.main;

import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;
import ro.ase.acs.prototype.registry.BuildingBlockFactory;

import java.util.ArrayList;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        List<BuildingBlock> buildingBlocks = new ArrayList<>();
        BuildingBlock stoneBlock1 = BuildingBlockFactory.getBlock("stone");
        stoneBlock1.setX(0);
        stoneBlock1.setY(1);
        stoneBlock1.setZ(0);

        BuildingBlock stoneBlock2 = BuildingBlockFactory.getBlock("stone");
        stoneBlock2.setX(0);
        stoneBlock2.setY(1);
        stoneBlock2.setZ(1);


        BuildingBlock woodBlock1 = BuildingBlockFactory.getBlock("wood");
        woodBlock1.setX(1);
        woodBlock1.setY(0);
        woodBlock1.setZ(1);


        buildingBlocks.add(stoneBlock1);
        buildingBlocks.add(stoneBlock2);
        buildingBlocks.add(woodBlock1);

        for (BuildingBlock block : buildingBlocks) {
            block.render();
        }
    }
}
