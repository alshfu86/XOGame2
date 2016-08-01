package seaBattle;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;

/**
 * Created by User on 29.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        player.name();
        Field fieldPlayer = new Field();
        char[][] field = fieldPlayer.fieldCrater();
        ShipDraw shipDraw = new ShipDraw();
        shipDraw.shipDraw(field);
        fieldPlayer.showField(field);

    }
}