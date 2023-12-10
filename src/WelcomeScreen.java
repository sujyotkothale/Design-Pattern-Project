import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public final class WelcomeScreen extends WelcomeTemplete{
    static JFrame frame;
    WelcomeScreen(){
    }
     public void createAndShowGUI(ActionListener actionl) {
        frame = new JFrame("Welcome Screen ");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1, 5, 5));
        JLabel l = new JLabel("Welcome to TicTacToe",SwingConstants.CENTER);
        JLabel l2 = new JLabel("Click on button below to start",SwingConstants.CENTER);
        frame.add(l);
        frame.add(l2);
        JButton b = new JButton("Start");
        b.setSize(20, 20);
        b.addActionListener(actionl);
        frame.add(b);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        TicTacToeLauncher.getinstance();

    }
    public void SetVisible(){
        frame.setVisible(true);
    }
    
    
}
