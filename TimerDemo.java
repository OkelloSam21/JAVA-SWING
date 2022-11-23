import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class TimerDemo extends JFrame implements ActionListener {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private Timer timer;
    private JLabel label;
    
    public TimerDemo(){
        super("Timer Demo");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer = new Timer(1000,this);
        timer.start();
        label = new JLabel("Hello");
        label.setHorizontalAlignment(JLabel.CENTER);
        Font fonts = new Font("Dialog", Font.BOLD,500);
        label.setFont(fonts);
        label.setForeground(Color.RED);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
       
        
    }

    public void actionPerformed(ActionEvent e ){
        if (label.isVisible()) {
            label.setVisible(false);
        } else {
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        
        TimerDemo td = new TimerDemo();
        td.setVisible(true);
    }
}