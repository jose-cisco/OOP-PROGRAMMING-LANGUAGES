import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewClass extends JFrame{
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel("US Dollars");
    JLabel l2 = new JLabel("Canadian Dollars");
    JTextField f1 = new JTextField(10);
    JTextField f2 = new JTextField(10);
    JButton b1 = new JButton("Convert");
    NewClass(){
        p1.setLayout(new GridLayout(2,2));
        p1.add(l1);
        p1.add(f1);
        f1.setHorizontalAlignment(JTextField.RIGHT);
        p1.add(l2);
        p1.add(f2);
        f2.setHorizontalAlignment(JTextField.RIGHT);
        f2.setEditable(false);
        //add(p1);
        
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        p2.add(b1);
        b1.addActionListener(new ButtonListener());
    }
    
    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(f1.getText());
            double sum = a * (1.5);
            f2.setText(" " + sum);
        }
    }
}

public class Lab9_4 {
    public static void main(String[] args){
        JFrame a = new NewClass();
        a.setSize(400, 200);
        a.setVisible(true);
        a.setTitle("Convert US Dollars to Canadian Dollars");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
