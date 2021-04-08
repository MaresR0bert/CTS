package ro.ase.acs.composite;

import java.util.HashSet;
import java.util.Set;

public class Departament implements HierarchicalNode {
    private Set<HierarchicalNode> set = new HashSet<>();
    private String name;

    @Override
    public float getSalary() {
        float sum = 0;
        for (HierarchicalNode node : set) {
            sum += node.getSalary();
        }
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addHierarchicalNode(HierarchicalNode node) {
        set.add(node);
    }

    @Override
    public void deleteHierarchicalNode(HierarchicalNode node) {
        set.remove(node);
    }

    @Override
    public HierarchicalNode searchNodeByName(String name) {
        return set.stream().filter(n -> n.getName().equals(name)).findFirst().get();
    }

    @Override
    public String toString() {
        return name + " Department";
    }
}
