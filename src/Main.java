import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {
        createWindow();
    }

    // Self explanitory
    private static void createWindow(){
        JFrame frame = new JFrame("Exam");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        // Creating the Panel
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        // Setting the layout
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        // creating all buttons and labels
        JButton button1 = new JButton("Convert Decimal to Binary");
        panel.add(button1);
        final JLabel label1 = new JLabel();
        panel2.add(label1);
        JButton button2 = new JButton("Convert Decimal to Hexadecimal");
        panel.add(button2);
        JButton button3 = new JButton("Convert Binary to Decimal");
        panel.add(button3);
        JButton button4 = new JButton("Convert Hexadecimal to Decimal");
        panel.add(button4);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(panel2, BorderLayout.SOUTH);

<<<<<<<
        /*
            Buttons below are made to create a secondary window where the user can enter the value for
            converstion, you cannot have 2 miniture windows opened up at once. Sadly there was no way for me
            to find a way to loop the buttons incase the input was bad and caused a error, however it only closes
            the miniture window.
         */

        // label1,2,3 and 4 are used to put the converted number on the GUI Panel

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                int iresult = Integer.parseInt(result);
                String BinString  = Integer.toBinaryString(iresult);
                label1.setText("The value is " +BinString);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                int iresult = Integer.parseInt(result);
                String HexString  = Integer.toHexString(iresult);
                label1.setText("The value is " +HexString);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );


                int decimal = Integer.parseInt(result, 2);

                label1.setText("The value is " + String.valueOf(decimal));
            }
        });


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );


                int decimal = Integer.parseInt(result, 16);

                label1.setText("The value is " + String.valueOf(decimal));
            }
        });
=======

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                int iresult = Integer.parseInt(result);
                String BinString  = Integer.toBinaryString(iresult);
                label1.setText("The value is " +BinString);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                int iresult = Integer.parseInt(result);
                String HexString  = Integer.toHexString(iresult);
                label1.setText("The value is " +HexString);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );


                int decimal = Integer.parseInt(result, 2);

                label1.setText("The value is " + String.valueOf(decimal));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = (String) JOptionPane.showInputDialog(
                        frame,
                        "Enter Number to Convert",
                        "Enter here",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );


                int decimal = Integer.parseInt(result, 16);

                label1.setText("The value is " + String.valueOf(decimal));
            }
        });
>>>>>>>
    }
}