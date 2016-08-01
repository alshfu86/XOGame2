package seaBattle;

/**
 * Created by User on 29.07.2016.
 */
public class ShipDraw extends Ship {

    public char[][] shipDraw(char[][] pcField) {
        FourDecker fourDecker1 = new FourDecker();
        fourDecker1.fourDeckerCreator(pcField);
        ThreeDecker threeDecker1 = new ThreeDecker();
        threeDecker1.threeDeckerCreator(pcField);
        ThreeDecker threeDecker2 = new ThreeDecker();
        threeDecker2.threeDeckerCreator(pcField);
        TwoDecker twoDecker1 = new TwoDecker();
        twoDecker1.twoDeckerCreator(pcField);
        TwoDecker twoDecker2 = new TwoDecker();
        twoDecker2.twoDeckerCreator(pcField);
        TwoDecker twoDecker3 = new TwoDecker();
        twoDecker3.twoDeckerCreator(pcField);
        OneDecker oneDecker = new OneDecker();
        oneDecker.oneDeckerCreator(pcField);
        OneDecker oneDecker1 = new OneDecker();
        oneDecker1.oneDeckerCreator(pcField);
        OneDecker oneDecker2 = new OneDecker();
        oneDecker2.oneDeckerCreator(pcField);
        OneDecker oneDecker3 = new OneDecker();
        oneDecker3.oneDeckerCreator(pcField);
        System.out.println("All ships was place on the board.....");
        System.out.println("Good luck in game");
        neutralDeliter(pcField);


        return pcField;
    }

}
