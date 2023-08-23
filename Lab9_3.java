import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Lab9_3 extends JFrame {
    private JTextField jtfAnnualInterestRate = new JTextField();
    private JTextField jtfNumberOfYears = new JTextField();
    private JTextField jtfLoanAmount = new JTextField();
    private JTextField jtfMonthlyPayment = new JTextField();
    private JTextField jtfTotalPayment = new JTextField();
    private JButton jbtComputeLoan = new JButton("Compute Payment");
 
    public Lab9_3() {
       JPanel p1 = new JPanel(new GridLayout(5, 2));
       p1.add(new JLabel("Annual Interest Rate"));
       p1.add(jtfAnnualInterestRate);
       p1.add(new JLabel("Number of Years"));
       p1.add(jtfNumberOfYears);
       p1.add(new JLabel("Loan Amount"));
       p1.add(jtfLoanAmount);
       p1.add(new JLabel("Monthly Payment"));
       p1.add(jtfMonthlyPayment);
       jtfMonthlyPayment.setEditable(false);
       p1.add(new JLabel("Total Payment"));
       p1.add(jtfTotalPayment);
       jtfTotalPayment.setEditable(false);
       p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and years"));
       JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       p2.add(jbtComputeLoan);
       add(p1, BorderLayout.CENTER);
       add(p2, BorderLayout.SOUTH);

       jbtComputeLoan.addActionListener(new ButtonListener());
    }
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get values from text fields
            double interest = Double.parseDouble(jtfAnnualInterestRate.getText());
            int year = Integer.parseInt(jtfNumberOfYears.getText());
            double loanAmount = Double.parseDouble(jtfLoanAmount.getText());
            Loan loan = new Loan(interest, year, loanAmount);
            
            jtfMonthlyPayment.setText(String.format("%.2f",
            loan.getMonthlyPayment()));
            jtfTotalPayment.setText(String.format("%.2f",
            loan.getTotalPayment()));
        }
    }
    public static void main(String[] args) {
        Lab9_3 frame = new Lab9_3();
        frame.pack();
        frame.setTitle("LoanCalculator");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private double monthRate;
    private int termInMonths;
    private double monthlyPayment;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
 
    public Loan(double annualInterestRate, int numberOfYears,
        double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }
    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    
    public double getMonthlyPayment(){
        this.annualInterestRate /= 100;
        this.monthRate = this.annualInterestRate / 12.0;
        termInMonths = this.numberOfYears * 12;
        monthlyPayment = (this.loanAmount*this.monthRate) / (1-Math.pow(1+this.monthRate, -this.termInMonths));
        return monthlyPayment;
    }
    
    public double getTotalPayment(){
        double totalpayment = this.monthlyPayment * this.termInMonths;
        return totalpayment;
    }
 }