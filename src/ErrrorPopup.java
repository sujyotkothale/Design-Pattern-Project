import javax.swing.*;

public class ErrrorPopup {
    
    ErrrorPopup(String reason){
        createAndShowGUI(reason);
    }
    private static void createAndShowGUI(String err) {
        JFrame frame = new JFrame("Invalid Customixation : ");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel l = new JLabel(err,SwingConstants.CENTER);
        frame.add(l);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
