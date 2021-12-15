import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleInterest extends JFrame implements ActionListener{

    JLabel p;
    JLabel t;
    JLabel r;

    JTextField principle;
    JTextField time;
    JTextField rate;
    JLabel label;
    JButton Btn;
    JMenu back;
    JMenuBar menuBar;
    public SimpleInterest(){


        //menubar
        menuBar = new JMenuBar();
        add(menuBar);

        //for menu
        back = new JMenu("Back");
        back.setBounds(30,10,40,20);
        menuBar.add(back);

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Home().setVisible(true);
            }
        });



        setJMenuBar(menuBar);
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p = new JLabel("P");
        p.setBounds(40,50,30,20);
        add(p);

        t = new JLabel("T");
        t.setBounds(40,70,30,20);
        add(t);
        r = new JLabel("R");
        r.setBounds(40,90,30,20);
        add(r);

        principle = new JTextField();
        principle.setBounds(50,50,100,20);
        add(principle);

        time = new JTextField();
        time.setBounds(50,70,100,20);
        add(time);

        rate = new JTextField();
        rate.setBounds(50,90,100,20);
        add(rate);

        label = new JLabel("Result");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("Simple interest");
        Btn.setBounds(50,160,130,20);
        add(Btn);
        Btn.addActionListener(this);




    }
    public static void main(String[] args) {
        new SimpleInterest().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(principle.getText());
        int b = Integer.parseInt(rate.getText());
        int c = Integer.parseInt(time.getText());
        int d=0;

        if (e.getSource().equals(Btn)){
            d = (a*b*c)/100;
            label.setText(String.valueOf(d));
        } else{
            System.out.println("Error");
        }
    }
}
