package seaBattle;

import java.util.Random;

import static javafx.scene.input.KeyCode.X;

/**
 * Created by User on 24.07.2016.
 */
public class Ship {


    public static final char CHAR = 'N';
    public static final char SYMBOL_FOR_SHIP = 'S';

    public int wayFinder() {
        Random random = new Random();
        int wayFinder = random.nextInt(4) + 1;
        return wayFinder;
    }


    boolean isRightCoordinates(char[][] field, int[] startCoordinates) {
        boolean isRightCoordinates;
        if (field[startCoordinates[1]][startCoordinates[0]] == '▓') {

                isRightCoordinates = true;
              //  System.out.print("X=" + startCoordinates[0] + " Y=" + startCoordinates[1] + "isRightCoordinates :" + field[startCoordinates[1]][startCoordinates[0]]);
              // System.out.println(" This is right Coordinates:_" + isRightCoordinates);
            }

        else {
            isRightCoordinates=false;
           // System.out.println(field[startCoordinates[1]][startCoordinates[0]]);
           // System.out.println("Can't be used:_" + isRightCoordinates);
        }
        return isRightCoordinates;
    }


    int[] startCoordinates() {
        int[] startCoordinates = new int[2];
        Random random = new Random();
        int X = random.nextInt(10) + 1;
        int Y = random.nextInt(10) + 1;
        startCoordinates[0] = X;
        startCoordinates[1] = Y;
        return startCoordinates;
    }

    char[][] neutralDeckChecker(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {

                if (field[i][j] == SYMBOL_FOR_SHIP) {

                    if (field[i + 1][j] != SYMBOL_FOR_SHIP) {
                        field[i + 1][j] = CHAR;

                    }
                    if (field[i + 1][j + 1] != SYMBOL_FOR_SHIP) {
                        field[i + 1][j + 1] = CHAR;

                    }
                    if (field[i + 1][j - 1] != SYMBOL_FOR_SHIP) {
                        field[i + 1][j - 1] = CHAR;

                    }
                    if (field[i - 1][j] != SYMBOL_FOR_SHIP) {
                        field[i - 1][j] = CHAR;
                    }

                    if (field[i - 1][j + 1] != SYMBOL_FOR_SHIP) {
                        field[i - 1][j + 1] = CHAR;
                    }

                    if (field[i - 1][j - 1] != SYMBOL_FOR_SHIP) {
                        field[i - 1][j - 1] = CHAR;
                    }
                }

            }

        }
        return field;
    }
    char[][] neutralDeliter(char[][]field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j]== CHAR){
                    field[i][j]='▓';
                }
                if(i==0||i==11||j==0||j==11){
                    field[i][j] = '■';
                }
            }

        }
        return field;
    }


}
