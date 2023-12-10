

public class TicTacToe5x5 extends TicTacToeFactory {
    public TicTacToe5x5(Customization c) {
        super(5,c,500,500);
    }

    protected boolean checkWin() {
        // Check rows
        for (int i = 0; i < 5; i++) {
            if (!buttons[i][0].getText().equals("") &&
                buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][0].getText().equals(buttons[i][2].getText()) &&
                buttons[i][0].getText().equals(buttons[i][3].getText()) &&
                buttons[i][0].getText().equals(buttons[i][4].getText())) {
                return true;
            }
        }
    
        // Check columns
        for (int i = 0; i < 5; i++) {
            if (!buttons[0][i].getText().equals("") &&
                buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[0][i].getText().equals(buttons[2][i].getText()) &&
                buttons[0][i].getText().equals(buttons[3][i].getText()) &&
                buttons[0][i].getText().equals(buttons[4][i].getText())) {
                return true;
            }
        }
    
        // Check diagonals
        if (!buttons[0][0].getText().equals("") &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[0][0].getText().equals(buttons[2][2].getText()) &&
            buttons[0][0].getText().equals(buttons[3][3].getText()) &&
            buttons[0][0].getText().equals(buttons[4][4].getText())) {
            return true;
        }
    
        if (!buttons[0][4].getText().equals("") &&
            buttons[0][4].getText().equals(buttons[1][3].getText()) &&
            buttons[0][4].getText().equals(buttons[2][2].getText()) &&
            buttons[0][4].getText().equals(buttons[3][1].getText()) &&
            buttons[0][4].getText().equals(buttons[4][0].getText())) {
            return true;
        }
    
        return false;
    }
    


    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> new TicTacToeGUI());
    // }
}
