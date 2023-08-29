package LGMVIP;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameGui gameGui = new GameGui();// creating an object of the GameGui class

        GameLogic gameLogic = new GameLogic();// creating an object of the GameLogic class
        gameGui.createGui(); // creating the gui for the game
        Thread.sleep(500);
        GameGui.player.setText("      Player X turn"); // setting the player label to player X turn
    }

}
