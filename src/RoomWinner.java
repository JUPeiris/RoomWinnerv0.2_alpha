

import javax.swing.*;
import java.awt.*;

public class RoomWinner {
    public static void start () {
        LotteryCard one, two, three;
        one=new LotteryCard();
        two=new LotteryCard();
        three=new LotteryCard();
        JFrame jframe=new JFrame();
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setTitle("Room Winner 1.0 Alpha");
        Container contentPane;
        contentPane=jframe.getContentPane();
        contentPane.setBackground(Color.WHITE);

        Graphics g=contentPane.getGraphics();

        one.spin();
        two.spin();
        three.spin();
        System.out.println("Card 1:   "+ one.getColour()+"    "+one.getNumber());
        one.draw(g, 10, 20);
        two.draw(g, 50, 20);
        three.draw(g, 90, 20);
//	System.out.println("Winning Card Combination: ");
//	System.out.println("1 -red; 2 -green; 3 -blue");
//	System.out.println(" ");
//	System.out.println("    	colour  number");

        System.out.println("Card 2:   "+ two.getColour()+"    "+two.getNumber());
        System.out.println("Card 3:   "+ three.getColour()+"    "+three.getNumber());

    }

}