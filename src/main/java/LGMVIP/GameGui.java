package LGMVIP;

import javax.swing.*;
import java.awt.*;

public class GameGui {

    static JLabel player;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton[] buttons;

    void createGui() {
        //creating a frame for the game
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocation(500, 200);
        frame.setLayout(null);


        //panel for our player screen
        JPanel playerPanel = new JPanel();
        playerPanel.setLayout(null);
        playerPanel.setBounds(0, 0, 500, 100);
        playerPanel.setBackground(Color.lightGray);
        frame.add(playerPanel);

        //JLabel for player
        player = new JLabel();
        player.setText("       Tic-Tac-Toe ");
        player.setBounds(15, 15, 500, 50);
        player.setFont(new Font("Arial", Font.BOLD, 50));
        player.setForeground(new Color(0x8A2BE2	));
        playerPanel.add(player);


        // panel for our game
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        frame.add(gamePanel);
        gamePanel.setBounds(0, 100, 500, 500);


        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        //adding buttons to an array
        buttons = new JButton[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};

        //setting button names
        button1.setName("button1");
        button2.setName("button2");
        button3.setName("button3");
        button4.setName("button4");
        button5.setName("button5");
        button6.setName("button6");
        button7.setName("button7");
        button8.setName("button8");
        button9.setName("button9");

        //fonts for buttons
        //adding buttons to the frame
        //adding action listener to the buttons
        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 100));
            gamePanel.add(button);
            button.addActionListener(new GameLogic());
            button.setFocusable(false);
        }


        frame.setVisible(true);// making the frames visible

    }


}


