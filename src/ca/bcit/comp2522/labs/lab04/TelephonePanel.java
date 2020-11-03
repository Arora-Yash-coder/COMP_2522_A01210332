package ca.bcit.comp2522.labs.lab04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelephonePanel extends JPanel {
    /**
     * Value 3.
     */
    private final int three = 3;

    /**
     * Value 4.
     */
    private final int four = 4;

    /**
     * Gui For a Telephone Panel.
     */
    public TelephonePanel() {
    //set BorderLayout for this panel
        setLayout(new BorderLayout());

    //create a JLabel with "Your Telephone" title
        JLabel title = new JLabel("Your Telephone");

    //add title label to north of this panel
        add(title, BorderLayout.NORTH);

    //create panel to hold keypad and give it a 4x3 GridLayout
        GridLayout layout = new GridLayout(four, three);

    //add buttons representing keys to key panel
        JPanel keypanel = new JPanel(layout);

    //Buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttona = new JButton("*");
        JButton button0 = new JButton("0");
        JButton buttonp = new JButton("#");

    //add key panel to center of this panel
        keypanel.add(button1);
        keypanel.add(button2);
        keypanel.add(button3);
        keypanel.add(button4);
        keypanel.add(button5);
        keypanel.add(button6);
        keypanel.add(button7);
        keypanel.add(button8);
        keypanel.add(button9);
        keypanel.add(buttona);
        keypanel.add(button0);
        keypanel.add(buttonp);

    // add keypanel to center of the panel
        add(keypanel, BorderLayout.CENTER);

    // create a new panel for the title "Your Telephone"
        JPanel titlePanel = new JPanel();

    // add "Your Telephone" to title panel
        titlePanel.add(title);

    // add the titlePanel to the north of the panel
        add(titlePanel, BorderLayout.NORTH);

    //Action Listners
        buttona.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {
                        System.out.println("Key Pressed: *");
                    }
                }
        );

        buttonp.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {
                        System.out.println("Key Pressed: #");
                    }
                }
        );

        ActionListener listner = new Listerner();
        button0.addActionListener(listner);
        button1.addActionListener(listner);
        button2.addActionListener(listner);
        button3.addActionListener(listner);
        button4.addActionListener(listner);
        button5.addActionListener(listner);
        button6.addActionListener(listner);
        button7.addActionListener(listner);
        button8.addActionListener(listner);
        button9.addActionListener(listner);

    }
}

class Listerner implements ActionListener {

    @Override
    public void actionPerformed(final ActionEvent e) {
        String s = e.getActionCommand();
        System.out.println("Key Pressed: " + s);
    }
}
