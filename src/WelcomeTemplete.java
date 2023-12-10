import java.awt.event.ActionListener;

public abstract class WelcomeTemplete implements ActionListener{
    public abstract  void createAndShowGUI(ActionListener actionl);
    public abstract  void SetVisible();
    
    public void StartGame(){
        createAndShowGUI(this);
        SetVisible();
    }
}
