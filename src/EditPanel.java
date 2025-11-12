import javax.swing.*;
import java.awt.Color;

public class EditPanel extends JPanel {
    private JTextField textField=new JTextField(20);
    private JButton addButton=new JButton("추가");
    public EditPanel(){
        this.setBackground(Color.CYAN);
        add(textField);
        add(addButton);
    }
}
