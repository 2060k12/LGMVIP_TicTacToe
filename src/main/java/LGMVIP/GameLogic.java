package LGMVIP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLogic implements ActionListener {

    static public String[] board = {"z", "z", "z", "z", "z", "z", "z", "z", "z"};
    static int count = 0;
    GameGui gamegui;
    // making all the values of the board array as x to avoid null pointer exception in checkGameEnd() method


    // setting the board as an array and initializing it with random values to avoid null pointer exception in checkGameEnd() method
    boolean player1Turn;
    boolean player2Turn;

    void xWins() {
        if ((board[0].equals("X")) &&
                (board[1].equals("X")) &&
                (board[2].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);
        } else if ((board[3].equals("X")) &&
                (board[4].equals("X")) &&
                (board[5].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);
        } else if ((board[6].equals("X")) &&
                (board[7].equals("X")) &&
                (board[8].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);
        } else if ((board[0].equals("X")) &&
                (board[3].equals("X")) &&
                (board[6].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);
        } else if ((board[1].equals("X")) &&
                (board[4].equals("X")) &&
                (board[7].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);

        } else if ((board[2].equals("X")) &&
                (board[5].equals("X")) &&
                (board[8].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);

        } else if ((board[0].equals("X")) &&
                (board[4].equals("X")) &&
                (board[8].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);

        } else if ((board[2].equals("X")) &&
                (board[4].equals("X")) &&
                (board[6].equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X wins");
            System.exit(0);

        }
    }


    public void oWins() {
        if ((board[0].equals("O")) &&
                (board[1].equals("O")) &&
                (board[2].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[3].equals("O")) &&
                (board[4].equals("O")) &&
                (board[5].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[6].equals("O")) &&
                (board[7].equals("O")) &&
                (board[8].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[0].equals("O")) &&
                (board[3].equals("O")) &&
                (board[6].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[1].equals("O")) &&
                (board[4].equals("O")) &&
                (board[7].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[2].equals("O")) &&
                (board[5].equals("O")) &&
                (board[8].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[0].equals("O")) &&
                (board[4].equals("O")) &&
                (board[8].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        } else if ((board[2].equals("O")) &&
                (board[4].equals("O")) &&
                (board[6].equals("O"))) {

            JOptionPane.showMessageDialog(null, "Player O wins");
            System.exit(0);

        }
    }

    void currentPlayer() {
        if (count % 2 == 0) {
            player1Turn = true;
            player2Turn = false;
        } else {
            player1Turn = false;
            player2Turn = true;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressedButton = (JButton) e.getSource();
        String buttonName = pressedButton.getName();
        currentPlayer();
        if (player1Turn) {

            pressedButton.setText("X");
            pressedButton.setForeground(Color.red);
            pressedButton.setMultiClickThreshhold(1000000);// setting the multi click threshold to a large value to avoid the button being clicked multiple times

            // when a button is clicked, by the first player, x is set in the board array
            switch (buttonName) {
                case "button1":
                    board[0] = "X";
                    break;
                case "button2":
                    board[1] = "X";
                    break;
                case "button3":
                    board[2] = "X";
                    break;
                case "button4":
                    board[3] = "X";
                    break;
                case "button5":
                    board[4] = "X";
                    break;
                case "button6":
                    board[5] = "X";
                    break;
                case "button7":
                    board[6] = "X";
                    break;
                case "button8":
                    board[7] = "X";
                    break;

                case "button9":
                    board[8] = "X";
                    break;
            }
            xWins();
            count++; // incrementing the count variable to keep track of the number of turns
            GameGui.player.setText("      Player O turn");

            // if the count variable is equal to 9, then the game is a draw
            if (count == 9) {
                GameGui.player.setText("      Game Draw");
                GameGui.player.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Game Draw");
                System.exit(0);
            }


        } else if (player2Turn) {

            pressedButton.setText("O");
            pressedButton.setEnabled(false);
            pressedButton.setBackground(Color.blue);

            // when a button is clicked, by the second player, o is set in the board array
            switch (buttonName) {
                case "button1":
                    board[0] = "O";
                    break;
                case "button2":
                    board[1] = "O";
                    break;
                case "button3":
                    board[2] = "O";
                    break;
                case "button4":
                    board[3] = "O";
                    break;
                case "button5":
                    board[4] = "O";
                    break;
                case "button6":
                    board[5] = "O";
                    break;
                case "button7":
                    board[6] = "O";
                    break;
                case "button8":
                    board[7] = "O";
                    break;

                case "button9":
                    board[8] = "O";
                    break;
            }
            oWins();
            count++; // incrementing the count variable to keep track of the number of turns
            GameGui.player.setText("      Player X turn");
            if (count == 9) {
                GameGui.player.setText("      Game Draw");
                GameGui.player.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Game Draw");
                System.exit(0);
            }

        }

    }
}
