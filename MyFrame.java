import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
    JButton button1,button2,button3,button4;
    MyFrame(){
        ImageIcon icon1 = new ImageIcon("Alphabets.png");
        ImageIcon icon2 = new ImageIcon("Numbers.png");
        ImageIcon icon3 = new ImageIcon("Shapes.png");
        ImageIcon icon4 = new ImageIcon("Colours.png");




        button1 = new JButton();
        button1.setBounds(200,100,300,200);
        button1.addActionListener(e -> System.out.println("Deep is mad"));
        button1.setText("Alphabets");
        button1.setBackground(Color.blue );
        button1.setFocusable(false);
        button1.setIcon(icon1);
        button1.setHorizontalTextPosition(JButton.RIGHT);
        button1.setFont(new Font("Arial", Font.BOLD,16));

        button2 = new JButton();
        button2.setBounds(200,400,300,200);
        button2.addActionListener(e -> System.out.println("Deep is mad"));
        button2.setText("Numbers");
        button2.setBackground(Color.blue );
        button2.setFocusable(false);
        button2.setIcon(icon2);
        button2.setFont(new Font("Arial", Font.BOLD,16));


        button3 = new JButton();
        button3.setBounds(600,100,300,200);
        button3.addActionListener(e -> System.out.println("Deep is mad"));
        button3.setText("Shapes");
        button3.setBackground(Color.blue );
        button3.setFocusable(false);
        button3.setIcon(icon3);
        button3.setFont(new Font("Arial", Font.BOLD,16));

        button4 = new JButton();
        button4.setBounds(600,400,300,200);
        button4.addActionListener(e -> System.out.println("Deep is mad"));
        button4.setText("Colour");
        button4.setBackground(Color.blue );
        button4.setFocusable(false);
        button4.setIcon(icon4);
        button4.setFont(new Font("Arial", Font.BOLD,16));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        
        
    }

    
}
