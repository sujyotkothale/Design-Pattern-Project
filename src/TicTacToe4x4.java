

public class TicTacToe4x4 extends TicTacToeFactory {
    public TicTacToe4x4(Customization c) {
        super(4,c,400,400);
    }

    protected boolean checkWin() {
        // Check rows
        for (int i = 0; i < 4; i++) {
            if (!buttons[i][0].getText().equals("") &&
                    buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][0].getText().equals(buttons[i][2].getText()) &&
                    buttons[i][0].getText().equals(buttons[i][3].getText())) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 4; i++) {
            if (!buttons[0][i].getText().equals("") &&
                    buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[0][i].getText().equals(buttons[2][i].getText()) &&
                    buttons[0][i].getText().equals(buttons[3][i].getText())) {
                return true;
            }
        }

        // Check diagonals
        if (!buttons[0][0].getText().equals("") &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[0][0].getText().equals(buttons[2][2].getText()) &&
                buttons[0][0].getText().equals(buttons[3][3].getText())) {
            return true;
        }

        if (!buttons[0][3].getText().equals("") &&
                buttons[0][3].getText().equals(buttons[1][2].getText()) &&
                buttons[0][3].getText().equals(buttons[2][1].getText()) &&
                buttons[0][3].getText().equals(buttons[3][0].getText())) {
            return true;
        }

        return false;
    }


    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> new TicTacToeGUI());
    // }
}
