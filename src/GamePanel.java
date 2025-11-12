import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    private JLabel textLabel=new JLabel("Hello");
    private GroundPanel groundPanel=new GroundPanel();
    private JTextField inputField=new JTextField(20);  //사용자가 답 입력
    private InputPanel inputPanel=new InputPanel();
    private ScorePanel scorePanel=null;  //받은 스코어 패널 저장
    private TextStore tStore=null;

    public  GamePanel(ScorePanel scorePanel,TextStore tStore){
        this.scorePanel=scorePanel;
        this.tStore=tStore;
        this.setLayout(new BorderLayout());
        add(groundPanel,BorderLayout.CENTER);
        add(inputPanel,BorderLayout.SOUTH);        
    }

    class GroundPanel extends JPanel{  //게임 화면
        public GroundPanel(){
            this.setBackground(Color.WHITE);
            this.setLayout(null);
            textLabel.setLocation(100,100);
            textLabel.setSize(200,20);
            add(textLabel);
        }
    }
    class InputPanel extends JPanel{  //답 입력 구역
        public InputPanel(){
            this.setBackground(Color.GRAY);
            add(inputField);
            inputField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JTextField input=(JTextField)e.getSource();
                    if(input.getText().equals(textLabel.getText())){
                        scorePanel.incerase(20);
                        String text=tStore.get();
                        textLabel.setText(text);
                        inputField.setText("");  //입력창 비우기
                    }
                }
            });
        }
    }
}
