package ro.ase.acs.memento;

public class TablaJoc implements Cloneable {
    private char[][] tabla = new char[3][3];

    public char[][] getTabla() {
        char[][] newTable = new char[3][3];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                newTable[i][j] = tabla[i][j];
            }
        }
        return newTable;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TablaJoc clona = (TablaJoc) super.clone();
        clona.tabla = new char[3][3];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                clona.tabla[i][j] = tabla[i][j];
            }
        }
        return clona;
    }

    public void resetareTabla() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = 0;
            }
        }
    }

    public void adaugaSimbol(char simbol, int linie, int coloana) {
        tabla[linie][coloana] = simbol;
    }
}
