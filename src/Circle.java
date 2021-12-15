import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Circle extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu back;

    JLabel r;
    JTextField radius;
    JLabel label;
    JButton Btn;
    public Circle(){
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

        r = new JLabel("radius");
        r.setBounds(10,50,50,20);
        r.setForeground(Color.RED);
        add(r);

        radius = new JTextField();
        radius.setBounds(70,50,100,20);
        add(radius);


        label = new JLabel("Result");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("Area of Circle");
        Btn.setBounds(40,160,140,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new Circle().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = Integer.parseInt(radius.getText());
        int A = 0;

        if (e.getSource().equals(Btn)){
            A = 22/7*r*r;
            label.setText(String.valueOf(A));
        } else{
            System.out.println("Error");
        }

    }
}
