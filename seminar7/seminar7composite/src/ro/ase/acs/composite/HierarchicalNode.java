package ro.ase.acs.composite;

public interface HierarchicalNode {
    public float getSalary();
    public String getName();
    default public void addHierarchicalNode(HierarchicalNode node){
        throw new UnsupportedOperationException();
    }

    default public void deleteHierarchicalNode(HierarchicalNode node){
        throw new UnsupportedOperationException();
    }

    default public HierarchicalNode searchNodeByName(String name){
        throw new UnsupportedOperationException();
    }
}
