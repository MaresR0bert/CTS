package ro.ase.acs.adapter;

public class FlightBooking implements AbstractFlightBooking {
    private String[][] places;
    public static final int NO_ROWS=30;
    public static final int NO_SEATS_PER_ROW=6;

    public FlightBooking(){
        places = new String[30][6];
        for(int i=0;i<NO_ROWS;i++){
            for(int j=0;j<NO_SEATS_PER_ROW;j++){
                places[i][j]="O";
            }
        }
    }

    public boolean addBooking(int row, char seat){
        int matrixLine = row-1;
        int matrixColumn = -1;

        switch (seat){
            case 'A':
                matrixColumn=0;
                break;
            case 'B':
                matrixColumn=1;
                break;
            case 'C':
                matrixColumn=1;
                break;
            case 'D':
                matrixColumn=1;
                break;
            case 'E':
                matrixColumn=1;
                break;
            case 'F':
                matrixColumn=1;
                break;
        }

        if(places[matrixLine][matrixColumn].equals("O")){
            places[matrixLine][matrixColumn]="X";
            return true;
        } else {
            return false;
        }
    }

    public void displaySeats(){
        for(int i=0;i<NO_SEATS_PER_ROW;i++){
            for(int j=0;j<NO_ROWS;j++){
                System.out.print(places[j][i]);
                System.out.print(" ");
            }
            if(i==2){
                System.out.println();
            }
            System.out.println();
        }
    }
}
