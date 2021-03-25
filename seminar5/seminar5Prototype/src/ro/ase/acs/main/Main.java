package ro.ase.acs.main;

import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BuildingBlock> buildingBlocks = new ArrayList<>();
        StoneBlock stoneBlock1 = new StoneBlock();
        stoneBlock1.setX(0);
        stoneBlock1.setY(1);
        stoneBlock1.setZ(0);

        //StoneBlock stoneBlock2 = new StoneBlock();
        StoneBlock stoneBlock2 = null;
        try {
            stoneBlock2 = (StoneBlock) stoneBlock1.clone();
            stoneBlock2.setX(1);
            stoneBlock2.setY(1);
            stoneBlock2.setZ(0);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        StoneBlock stoneBlock3 = null;
        try {
            stoneBlock3 = (StoneBlock) stoneBlock1.clone();
            stoneBlock3.setX(1);
            stoneBlock3.setY(1);
            stoneBlock3.setZ(0);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        WoodBlock woodBlock1 = new WoodBlock();
        woodBlock1.setX(1);
        woodBlock1.setY(0);
        woodBlock1.setZ(1);

        WoodBlock woodBlock2 = null;
        try {
            woodBlock2 = (WoodBlock) woodBlock1.clone();
            woodBlock2.setX(1);
            woodBlock2.setY(1);
            woodBlock2.setZ(0);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        buildingBlocks.add(stoneBlock1);
        buildingBlocks.add(stoneBlock2);
        buildingBlocks.add(stoneBlock3);
        buildingBlocks.add(woodBlock1);
        buildingBlocks.add(woodBlock2);

        for(BuildingBlock block : buildingBlocks){
            block.render();
        }
    }
}
