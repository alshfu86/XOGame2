package seaBattle;

import java.util.Scanner;

/**
 * Created by User on 24.07.2016.
 */
public class Player {
    String name;
    Scanner myScanner = new Scanner(System.in);

    public String name(){
        System.out.println("Hello player please type your name hire: ");
        name=myScanner.nextLine();
        System.out.println("Nice to meet you "+name);
        return name;
    }
}
