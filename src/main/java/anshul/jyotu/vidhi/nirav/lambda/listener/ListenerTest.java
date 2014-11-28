package anshul.jyotu.vidhi.nirav.lambda.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akd on 28/11/2014.
 */
public class ListenerTest {

    public static void main(String[] args) {

        JButton button = new JButton("Ha ha ha!!");

        button.addActionListener((ActionEvent e) -> System.out.println("Yo clicked:  " + e.getActionCommand()));

        JFrame frame = new JFrame("Ho ho frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
    }
}
