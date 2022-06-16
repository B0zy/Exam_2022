import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow(){
        JFrame frame = new JFrame("Exam");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        // Creating the Panel
        JPanel panel = new JPanel();
        // Setting the layout
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("Convert Decimal to Binary");
        panel.add(button1);
        JButton button2 = new JButton("Convert Decimal to Hexadecimal");
        panel.add(button2);
        JButton button3 = new JButton("Convert Binary to Decimal");
        panel.add(button3);
        JButton button4 = new JButton("Convert Hexadecimal to Decimal");
        panel.add(button4);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}