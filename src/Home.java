import javax.management.JMRuntimeException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Home extends JFrame {
    JMenuBar menuBar;
    JMenu ArithmeticOperations,Area,SimpleInterest;
    JMenuItem Add,Subtract,Divide,Multiply,Circle,Triangle;



    public Home() {
//    for main window
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 150, 600, 400);
        getContentPane().setBackground(Color.decode("#A52A2A"));
        setLayout(null);
        setResizable(false);

//    for menu bar
        menuBar = new JMenuBar();
        add(menuBar);
//    for menu
        ArithmeticOperations = new JMenu("Arithmetic Operations");
        Area = new JMenu("Area");
        SimpleInterest = new JMenu("Simple Interest");
//    for menu item
        Add = new JMenuItem("Add");
        Subtract = new JMenuItem("Subtract");
        Divide = new JMenuItem("Divide");
        Circle = new JMenuItem("Circle");
        Multiply = new JMenuItem("Multiply");
        Triangle = new JMenuItem("Triangle");

        menuBar.add(ArithmeticOperations);
        menuBar.add(Area);
        menuBar.add(SimpleInterest);
        ArithmeticOperations.add(Add);
        ArithmeticOperations.add(Subtract);
        ArithmeticOperations.add(Multiply);
        ArithmeticOperations.add(Divide);
        Area.add(Circle);
        Area.add(Triangle);

        setJMenuBar(menuBar);
        SimpleInterest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new SimpleInterest().setVisible(true);
            }
        });



        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Add)) {
                    dispose();
                    new Add().setVisible(true);
                }
            }
        });

        Subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Subtract)) {
                    dispose();
                    new Subtract().setVisible(true);
                }
            }
        });

        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Divide)) {
                    dispose();
                    new Divide().setVisible(true);
                }
            }
        });

        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Multiply)) {
                    dispose();
                    new Multiply().setVisible(true);
                }
            }
        });

        Circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Circle)) {
                    dispose();
                    new Circle().setVisible(true);
                }
            }
        });

        Triangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Triangle)) {
                    dispose();
                    new Triangle().setVisible(true);
                }
            }
        });





    }

    public static void main(String[] args) {
        new Home().setVisible(true);
    }
}
