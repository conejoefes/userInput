package com.window;


import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.time.chrono.JapaneseChronology;

public class Main {

    public static void main(String[] args) {
    JFrame app = new JFrame("User Input");

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(15));

    JLabel label = new JLabel("Type just and an only vowel in the textbox");
    JFormattedTextField text = new JFormattedTextField();
    JButton button = new JButton("Send");

    app.add(label);
    app.add(text);
    app.add(button);


    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setSize(300,400);
    app.setBackground(Color.gray);
    app.setVisible(true);
    app.setLocationRelativeTo(null);

    }
}
