import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public abstract class TicTacToeFactory extends JFrame implements ActionListener {
    protected JButton[][] buttons;
    protected char currentPlayer;
    protected JLabel statusLabel;
    protected int size;
    protected Customization c;

    public TicTacToeFactory(int size,Customization c,int width,int height) {
        this.size = size;
        this.c = c;
        setTitle("Tic Tac Toe");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(size, size));
        gamePanel.setBackground(c.boardColor);
        buttons = new JButton[size][size];
        currentPlayer = 'X';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[i][j].addActionListener(this);
                gamePanel.add(buttons[i][j]);
            }
        }

        add(gamePanel, BorderLayout.CENTER);

        statusLabel = new JLabel("Player " + (currentPlayer == 'X'?c.player1Name:c.player2Name) + "'s turn");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        //setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (buttons[i][j] == buttonClicked && buttons[i][j].getText().equals("")) {
                    buttons[i][j].setText(String.valueOf(currentPlayer));
                    buttons[i][j].setForeground((currentPlayer == 'X') ? c.xColor : c.oColor);

                    if (checkWin()) {
                        statusLabel.setText("Player " + (currentPlayer == 'X'?c.player1Name:c.player2Name) + " wins!");
                        disableButtons();
                    } else if (isBoardFull()) {
                        statusLabel.setText("It's a draw!");
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                        statusLabel.setText("Player " + (currentPlayer == 'X'?c.player1Name:c.player2Name) + "'s turn");
                        
                    }
                }
            }
        }
    }
    protected boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
    protected abstract boolean checkWin();
    protected void disableButtons() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }
}
