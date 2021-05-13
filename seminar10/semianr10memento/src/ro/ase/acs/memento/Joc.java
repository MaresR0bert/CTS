package ro.ase.acs.memento;

public class Joc {
    ManagerSalvari managerSalvari;
    TablaJoc tablaJoc;

    public Joc() {
        this.managerSalvari = new ManagerSalvari();
        tablaJoc = new TablaJoc();
    }

    public boolean verificaCastigator() {
        return false;
    }

    public void afiseazaTable() {
        if (tablaJoc != null) {
            char[][] m = tablaJoc.getTabla();
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(" "+m[i][j]+" ");
                }
                System.out.print(System.lineSeparator());
            }
        }
    }

    public void adaugaX(int linie, int coloana){
        this.tablaJoc.adaugaSimbol('X', linie, coloana);
    }

    public void adaugaO(int linie, int coloana){
        this.tablaJoc.adaugaSimbol('O', linie, coloana);
    }

    public void salvareJoc(){
        managerSalvari.salvare(tablaJoc);
    }

    public void restaurare(){
        this.tablaJoc = managerSalvari.restaureaza();
    }
}
