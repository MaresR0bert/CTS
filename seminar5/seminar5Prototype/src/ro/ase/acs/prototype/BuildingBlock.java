package ro.ase.acs.prototype;

import java.io.Closeable;

public abstract class BuildingBlock implements Cloneable {
    private int x;
    private int y;
    private int z;

    public abstract void render();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuildingBlock copy = (BuildingBlock) super.clone();
        copy.x = x;
        copy.y = y;
        copy.z = z;
        return copy;
    }
}
