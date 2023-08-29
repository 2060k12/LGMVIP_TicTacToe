package LGMVIP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JTextArea IODisplay;

    public GUI() {
        // Create the JFrame and set its properties
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("AIT BANK");
        frame1.setSize(400, 400);
        frame1.setLayout(null); // Set layout to null

        // Create components
        JLabel greeting = new JLabel("Welcome to AIT Bank ATM");
        greeting.setBounds(0, 0, 400, 20); // Set bounds for the greeting label
        IODisplay = new JTextArea(7, 20);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonPoint = new JButton(".");
        JButton buttonClear = new JButton("Clear");

        JButton buttonWithdraw = new JButton("Withdraw");
        JButton buttonDeposit = new JButton("Deposit");
        JButton buttonInquiry = new JButton("Balance Inquiry");
        JButton buttonHelp = new JButton("Help");

        JButton buttonCancel = new JButton("Cancel");
        JButton buttonEnter = new JButton("Enter");

        // Set ActionListeners for buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonWithdraw.addActionListener(this);
        buttonDeposit.addActionListener(this);
        buttonInquiry.addActionListener(this);
        buttonHelp.addActionListener(this);
        buttonCancel.addActionListener(this);
        buttonEnter.addActionListener(this);

        // Create panels to organize components
        JPanel displayPanel = new JPanel(new GridLayout(2, 1));
        displayPanel.setBounds(0, 20, 400, 100); // Set bounds for the displayPanel
        displayPanel.add(greeting);
        displayPanel.add(IODisplay);

        JPanel numberPanel = new JPanel(new GridLayout(4, 3));
        numberPanel.setBounds(0, 120, 300, 180); // Set bounds for the numberPanel
        numberPanel.add(button1);
        numberPanel.add(button2);
        numberPanel.add(button3);
        numberPanel.add(button4);
        numberPanel.add(button5);
        numberPanel.add(button6);
        numberPanel.add(button7);
        numberPanel.add(button8);
        numberPanel.add(button9);
        numberPanel.add(button0);
        numberPanel.add(buttonPoint);
        numberPanel.add(buttonClear);

        JPanel actionPanel = new JPanel(new GridLayout(4, 1, 5, 0));
        actionPanel.setBounds(300, 120, 100, 180); // Set bounds for the actionPanel
        actionPanel.add(buttonWithdraw);
        actionPanel.add(buttonDeposit);
        actionPanel.add(buttonInquiry);
        actionPanel.add(buttonHelp);

        JPanel controlPanel = new JPanel(new GridLayout(1, 2));
        controlPanel.setBounds(0, 300, 400, 100); // Set bounds for the controlPanel
        controlPanel.add(buttonCancel);
        controlPanel.add(buttonEnter);

        // Add panels to the frame
        frame1.add(displayPanel);
        frame1.add(numberPanel);
        frame1.add(actionPanel);
        frame1.add(controlPanel);

        // Set frame visibility
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks here
        if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            String buttonText = clickedButton.getText();

            // Store the clicked button's text in the public variable
            String lastClickedButton = buttonText;

            // Append the clicked button's text to the text area
            IODisplay.append(buttonText);
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
