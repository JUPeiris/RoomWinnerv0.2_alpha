
import java.awt.*;
import java.util.*;
public class LotteryCard {
    private static final int MAX_NUMBER=15;
    private static final int MIN_NUMBER=10;
    private static final int NO_NUMBER=0;
    private static final int MAX_COLOUR=3;
    private static final int MIN_COLOUR=1;
    private static final int NO_COLOUR=0;
    private static final int HEIGHT = 40;
    private static final int WIDTH = 30;
    private int number;
    private int colour;

    private Random random;

    public LotteryCard() {
        random = new Random();
        number=NO_NUMBER;
        colour=NO_COLOUR;

    }
    public void spin() {
        number= random.nextInt(MAX_NUMBER-MIN_NUMBER+1)+MIN_NUMBER;
        colour= random.nextInt(MAX_COLOUR-MIN_COLOUR+1)+MIN_COLOUR;
    }
    public int getNumber() {
        return number;
    }
    public int getColour() {
        return colour;
    }
    public void draw(Graphics g, int xOrigin, int yOrigin) {

        switch(colour) {
            case 1:
                g.setColor(Color.RED);
                break;
            case 2:
                g.setColor(Color.GREEN);
                break;
            case 3:
                g.setColor(Color.BLUE);
                break;
        }
        g.fillRect(xOrigin, yOrigin, WIDTH, HEIGHT);
        g.setColor(Color.black);
        g.drawString(""+number, xOrigin + WIDTH/4,yOrigin + HEIGHT/2);
    }
}