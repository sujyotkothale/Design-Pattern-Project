import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class TicTacToeLauncher extends JFrame {
    Customization c;
    public JTextField player1Field, player2Field;
    public JComboBox<String> boardSizeComboBox;
    public JButton boardColorBtn, xColorBtn, oColorBtn;
    private JButton startGameBtn;
    private static TicTacToeLauncher selfobj = new TicTacToeLauncher();

    private TicTacToeLauncher() {
        c = new Customization();
        setTitle("Tic Tac Toe Settings");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 3, 5, 5));

        JLabel player1Label = new JLabel("Player 1 Name:");
    player1Field = new JTextField();
        add(player1Label);
        add(player1Field);

        JLabel player2Label = new JLabel("Player 2 Name:");
        player2Field = new JTextField();
        add(player2Label);
        add(player2Field);

        JLabel boardSizeLabel = new JLabel("Board Size:");
        String[] boardSizes = {"3x3", "4x4", "5x5"};
        boardSizeComboBox = new JComboBox<>(boardSizes);
        add(boardSizeLabel);
        add(boardSizeComboBox);

        JLabel boardColorLabel = new JLabel("Board Color:");
        boardColorBtn = new JButton("Choose Color");
        boardColorBtn.setOpaque(true);
        boardColorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.boardColor = JColorChooser.showDialog(null, "Choose Board Color", c.boardColor);
                boardColorBtn.setBackground(c.boardColor);
            }
        });
        add(boardColorLabel);
        add(boardColorBtn);

        JLabel xColorLabel = new JLabel("Player 1 Color:");
        xColorBtn = new JButton("Choose Color");
        xColorBtn.setOpaque(true);
        xColorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.xColor = JColorChooser.showDialog(null, "Choose Player 1 Color", c.xColor);
                xColorBtn.setBackground(c.xColor);
            }
        });
        add(xColorLabel);
        add(xColorBtn);

        JLabel oColorLabel = new JLabel("Player 2 Color:");
        oColorBtn = new JButton("Choose Color");
        oColorBtn.setOpaque(true);
        oColorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.oColor = JColorChooser.showDialog(null, "Choose Player 2 Color", c.oColor);
                oColorBtn.setBackground(c.oColor);
            }
        });
        add(oColorLabel);
        add(oColorBtn);

        startGameBtn = new JButton("Start Game");
        startGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.player1Name =player1Field.getText();
                c.player2Name = player2Field.getText();
                String selectedBoardSize = (String) boardSizeComboBox.getSelectedItem();

                // Pass the settings to the game setup method
                setupGame(selectedBoardSize);
            }
        });
        add(startGameBtn);

        //setVisible(true);
    }
    public static TicTacToeLauncher getinstance(){
        selfobj.setVisible(true);
        return selfobj;
    }

    // Method to setup the game with selected settings
    private void setupGame(String boardSize) {
        SwingUtilities.invokeLater(() -> new GameProxy(boardSize,c,this));
        
    }
}