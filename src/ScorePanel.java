import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {
    private int score=0;
    private JLabel scoreLabel=new JLabel(Integer.toString(score));

    public ScorePanel(){
        this.setBackground(Color.YELLOW);
        add(new JLabel("점수"));
        add(scoreLabel);
    }

    public void incerase(int amount){
        score+=amount;
        scoreLabel.setText(Integer.toString(score));
    }
}
