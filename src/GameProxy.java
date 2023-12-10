import java.awt.Color;
public class GameProxy extends TicTacToeFactory{
    String boardSize;
    TicTacToeFactory t;
    TicTacToeLauncher l;

    public GameProxy(String bs,Customization c,TicTacToeLauncher l) {
        super(2, c,10,10);
        this.l = l;
        boardSize = bs;
        ValidateCustomzation(c);

    }
    private void ValidateCustomzation(Customization c){
        if(c.player1Name.equals(c.player2Name)){
            new ErrrorPopup("Player names cannot be same");
        }
        else if (c.oColor == Color.WHITE || c.xColor == Color.WHITE){
            new ErrrorPopup("Player color cannot be white");

        }else{
            if ("3x3".equals(boardSize)) {
            size = 3;
            c.size = 3;
            l.dispose();
            this.dispose();
            t = new TicTacToe3x3(c);
            t.setVisible(true);
        } else if ("4x4".equals(boardSize)) {
            size = 4;
            c.size = 4;
            l.dispose();
            this.dispose();
            t = new TicTacToe4x4(c);
            t.setVisible(true);
        } else if ("5x5".equals(boardSize)) {
            size = 5;
            c.size = 5;
            l.dispose();
            t = new TicTacToe5x5(c);
            t.setVisible(true);
        } else {
            // Handle the default case if needed
        }
            
        }
    }

    @Override
    protected boolean checkWin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkWin'");
    }
    
}
