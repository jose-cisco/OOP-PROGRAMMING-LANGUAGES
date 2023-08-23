import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame{
    String display = "";
    double temp = 0;
    double sumtemp = 0;
    int checkplusremove = 0;
    Boolean addBool = false;
    Boolean removeBool = false;
    Boolean konBool = false;
    Boolean hanBool = false;
    JTextField f1 = new JTextField(30);
    JButton root = new JButton("root");
    JButton x2 = new JButton("X^2");
    JButton plusremove = new JButton("+-");
    JButton C = new JButton("C");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton plus = new JButton("+");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton remove = new JButton("-");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton kon = new JButton("*");
    JButton zero = new JButton("0");
    JButton dot = new JButton(".");
    JButton sum = new JButton("=");
    JButton han = new JButton("/");
    
    A(){
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 1));
        p1.add(f1);
        f1.setPreferredSize(new Dimension(0,30));
        f1.setHorizontalAlignment(JTextField.RIGHT);
        f1.setEditable(false);
        add(p1, BorderLayout.NORTH);
        
        JPanel p2 = new JPanel(new GridLayout(5, 4));
        p2.add(root);
        p2.add(x2);
        p2.add(plusremove);
        p2.add(C);
        C.setForeground(Color.red);
        p2.add(seven);
        p2.add(eight);
        p2.add(nine);
        p2.add(plus);
        p2.add(four);
        p2.add(five);
        p2.add(six);
        p2.add(remove);
        p2.add(one);
        p2.add(two);
        p2.add(three);
        p2.add(kon);
        p2.add(zero);
        p2.add(dot);
        p2.add(sum);
        p2.add(han);
        add(p2, BorderLayout.CENTER);
        one.addActionListener(new ListenToOne());
        two.addActionListener(new ListenToTwo());
        three.addActionListener(new ListenToThree());
        four.addActionListener(new ListenToFour());
        five.addActionListener(new ListenToFive());
        six.addActionListener(new ListenToSix());
        seven.addActionListener(new ListenToSeven());
        eight.addActionListener(new ListenToEight());
        nine.addActionListener(new ListenToNine());
        zero.addActionListener(new ListenToZero());
        dot.addActionListener(new ListenToDot());
        x2.addActionListener(new ListenTox2());
        root.addActionListener(new ListenToRoot());
        
        plus.addActionListener(new ListenToAdd());
        remove.addActionListener(new ListenToRemove());
        kon.addActionListener(new ListenToKon());
        han.addActionListener(new ListenToHan());
        sum.addActionListener(new ListenToSum());
        plusremove.addActionListener(new ListenToPlusRemove());
        
        C.addActionListener(new ListenToClear());
    }
    
    class ListenToClear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            f1.setText("");
            addBool = false;
            removeBool = false;
            konBool = false;
            hanBool = false;
            
            temp = 0;
            sumtemp = 0;
        }
    }
    
    class ListenToOne implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "1");
        }
    }
    
    class ListenToTwo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "2");
        }
    }
    
    class ListenToThree implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "3");
        }
    }
    
    class ListenToFour implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "4");
        }
    }
    
    class ListenToFive implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "5");
        }
    }
    
    class ListenToSix implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "6");
        }
    }
    
    class ListenToSeven implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "7");
        }
    }
    
    class ListenToEight implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "8");
        }
    }
    
    class ListenToNine implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "9");
        }
    }
    
    class ListenToZero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display = f1.getText();
            f1.setText(display + "0");
        }
    }
    
    class ListenToDot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = f1.getText();
            f1.setText(display + ".");
        }
    }
    
    class ListenToRoot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(sumtemp == 0){
                display = f1.getText();
                temp = Double.parseDouble(f1.getText());
                temp = Math.sqrt(temp);
                f1.setText("");
                f1.setText(" " + temp);
            }
            else if(sumtemp != 0){
                display = f1.getText();
                sumtemp = Double.parseDouble(f1.getText());
                sumtemp = Math.sqrt(sumtemp);
                f1.setText("");
                f1.setText(" " + sumtemp);
            }
        }
    }
    
    class ListenToPlusRemove implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(sumtemp == 0){
                if(checkplusremove == 0){
                    display = f1.getText();
                    temp = Double.parseDouble(f1.getText());
                    temp = temp * -1;
                    f1.setText("");
                    f1.setText(" " + temp);
                }
                else if(checkplusremove == 1){
                    display = f1.getText();
                    temp = Double.parseDouble(f1.getText());
                    temp = temp * +1;
                    f1.setText("");
                    f1.setText(" " + temp);
                }
            }
            else if(sumtemp != 0){
                if(checkplusremove == 0){
                    display = f1.getText();
                    sumtemp = Double.parseDouble(f1.getText());
                    sumtemp = sumtemp * -1;
                    f1.setText("");
                    f1.setText(" " + sumtemp);
                }
                else if(checkplusremove == 1){
                    display = f1.getText();
                    sumtemp = Double.parseDouble(f1.getText());
                    sumtemp = sumtemp * +1;
                    f1.setText("");
                    f1.setText(" " + sumtemp);
                }
            }
        }
    }
    
    class ListenTox2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(sumtemp == 0){
                display = f1.getText();
                temp = Double.parseDouble(f1.getText());
                temp = temp * temp;
                f1.setText("");
                f1.setText(" " + temp);
            }
            else if(sumtemp != 0){
                display = f1.getText();
                sumtemp = Double.parseDouble(f1.getText());
                sumtemp = sumtemp * sumtemp;
                f1.setText("");
                f1.setText(" " + sumtemp);
            }
        }
    }
    
    class ListenToAdd implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            temp = Double.parseDouble(f1.getText());
            f1.setText("");
            addBool = true;
        }
    }
    
    class ListenToRemove implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            temp = Double.parseDouble(f1.getText());
            f1.setText("");
            removeBool = true;
        }
    }
    
    class ListenToKon implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            temp = Double.parseDouble(f1.getText());
            f1.setText("");
            konBool = true;
        }
    }
    
    class ListenToHan implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            temp = Double.parseDouble(f1.getText());
            f1.setText("");
            hanBool = true;
        }
    }
    
    class ListenToSum implements ActionListener{
        public void actionPerformed(ActionEvent e){
            sumtemp = Double.parseDouble(f1.getText());
            if(addBool == true)
                sumtemp = temp + sumtemp;
            else if(removeBool == true)
                sumtemp = temp - sumtemp;
            else if(konBool == true)
                sumtemp = temp * sumtemp;
            else if(hanBool == true)
                sumtemp = temp / sumtemp;
            
            f1.setText(Double.toString(sumtemp));
            addBool = false;
            removeBool = false;
            konBool = false;
            hanBool = false;
        }
    }
}

public class Lab9_5 {
    public static void main(String[] args){
        JFrame a = new A();
        a.setSize(350,400);
        a.setVisible(true);
        a.setTitle("Simple Calculator");
    }
}
