package seaBattle;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by User on 25.07.2016.
 */
public class FourDecker extends Ship {

    //public static final char SYMBOL_FOR_SHIP = 'ʙ';
    String name = "battleship";

    public char[][] fourDeckerCreator(char[][] field) {
        boolean ship = true;
        boolean  isWayRight = false;
        do{
            int[] startXY = {4, 6};
            boolean yes = false;

            while (yes != true) {
                startXY = startCoordinates();
                yes = isRightCoordinates(field, startXY);
            }

            int x = startXY[0];
            int y = startXY[1];


            //field[y][x] = 'ʙ';


            //System.out.println(wayFinder);
            //----------Navigator------------------//
            int wayFinder = 0;
            //boolean isWayRight = false;
            //do {
                boolean north = false;
                boolean east = false;
                boolean south = false;
                boolean west = false;
                boolean rightWay=false;
                while (rightWay==false) {
                    ////////////////////////////////////////////////
                    wayFinder = wayFinder();
                    if (wayFinder == 1 && x < 9) {
                        west = true;
                        rightWay = true;
                    } //else wayFinder = 2;

                    if (wayFinder == 2 && y < 9) {
                        south = true;
                        rightWay = true;
                    } //else wayFinder = 3;

                    if (wayFinder == 3 && x > 3) {
                        east = true;
                        rightWay = true;
                    } //else wayFinder = 4;

                    if (wayFinder == 4 && y > 3) {
                        north = true;
                        rightWay = true;
                    } //else wayFinder = 1;
                    if (north != true || west != true || east != true || south != true) {
                        ship = false;
                    }
                }

                if (west == true && field[y][x + 3] == '▓')
                //--------Way To West---------------//
                {
                    //System.out.println("wayFinder=" + wayFinder + "West");
                    field[y][x-1] = CHAR;
                    field[y][x] = SYMBOL_FOR_SHIP;
                    field[y][x + 1] = SYMBOL_FOR_SHIP;
                    field[y][x + 2] = SYMBOL_FOR_SHIP;
                    field[y][x + 3] = SYMBOL_FOR_SHIP;
                    field[y][x + 4] = CHAR;
                    isWayRight = true;
                    ship = true;
                } //else wayFinder=2;

                else if (south == true && field[y + 3][x] == '▓')
                //--------------Way to South----------
                {
                    //System.out.println("wayFinder=" + wayFinder + " South");

                    field[y - 1][x] = CHAR;
                    field[y][x] = SYMBOL_FOR_SHIP;
                    field[y + 1][x] = SYMBOL_FOR_SHIP;
                    field[y + 2][x] = SYMBOL_FOR_SHIP;
                    field[y + 3][x] = SYMBOL_FOR_SHIP;
                    field[y + 4][x] = CHAR;

                    isWayRight = true;
                    ship = true;
                } //else wayFinder=3;

                else if (east == true && field[y][x - 3] == '▓')
                //--------Way To East---------------//
                {
                   //System.out.println("wayFinder=" + wayFinder + "East");

                    field[y][x + 1] = CHAR;
                    field[y][x] = SYMBOL_FOR_SHIP;
                    field[y][x - 1] = SYMBOL_FOR_SHIP;
                    field[y][x - 2] = SYMBOL_FOR_SHIP;
                    field[y][x - 3] = SYMBOL_FOR_SHIP;
                    field[y][x - 4] = CHAR;
                    isWayRight = true;
                    ship = true;
                } //else wayFinder=4;

                else if (north == true && field[y - 3][x] == '▓')
                //--------Way To North---------------//
                {
                    //System.out.println("wayFinder=" + wayFinder + "North");

                    field[y + 1][x] = CHAR;
                    field[y][x] = SYMBOL_FOR_SHIP;
                    field[y - 1][x] = SYMBOL_FOR_SHIP;
                    field[y - 2][x] = SYMBOL_FOR_SHIP;
                    field[y - 3][x] = SYMBOL_FOR_SHIP;
                    field[y - 4][x] = CHAR;
                    isWayRight = true;
                    ship = true;
                }
                //else {wayFinder=3;}
            } while (isWayRight == false);

            field = neutralDeckChecker(field);
        return field;

    }


}

