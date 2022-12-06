import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColoredWindow2 extends JFrame implements ActionListener{

   public static final int WIDTH = 250;
   public static final int LENGTH = 300;

    public static void main(String[] args) {
        
        ColoredWindow2 cw = new ColoredWindow2();
        cw.setVisible(true);

    }

  public ColoredWindow2()
   {
    super("Change background color");
    
       
       
        setSize(LENGTH,WIDTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Change color");
        btn.addActionListener(this);
        add(btn,BorderLayout.SOUTH);

        getContentPane().setBackground(Color.PINK);
        
        
    }

    public void actionPerformed(ActionEvent e){

        if (getContentPane().getBackground() == Color.PINK) {

            getContentPane().setBackground(Color.BLACK);

        } else {
            
            getContentPane().setBackground(Color.PINK);
            
        }
    }

}