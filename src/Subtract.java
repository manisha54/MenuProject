import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Subtract extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu back;
    JTextField first;
    JTextField second;
    JLabel label;
    JButton Btn;
    public Subtract(){
        //    for menu bar
        menuBar = new JMenuBar();
        add(menuBar);
        //    for menu
        back = new JMenu("Back");
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

        first = new JTextField();
        first.setBounds(50,50,100,20);
        add(first);

        second = new JTextField();
        second.setBounds(50,70,100,20);
        add(second);

        label = new JLabel("Result");
        label.setForeground(Color.BLUE);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("-");
        Btn.setBounds(70,160,50,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new Subtract().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(first.getText());
        int b = Integer.parseInt(second.getText());
        int c=0;

        if (e.getSource().equals(Btn)){
            c =a-b;
            label.setText(String.valueOf(c));
        } else{
            System.out.println("Error");
        }

    }
}
