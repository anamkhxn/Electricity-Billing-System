package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class NewCustomer extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;

    NewCustomer(){
        setLocation(350,200);
        setSize(650,600);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2,10,10));

        p.setBackground(Color.WHITE);

        l1 = new JLabel("Name");
        t1 = new JTextField();
        p.add(l1);
        p.add(t1);
        l2 = new JLabel("Meter No.");
        t2 = new JTextField();
        p.add(l2);
        p.add(t2);
        l3 = new JLabel("Address");
        t3 = new JTextField();
        p.add(l3);
        p.add(t3);
        l4 = new JLabel("State");
        t4 = new JTextField();
        p.add(l4);
        p.add(t4);
        l5 = new JLabel("City");
        t5 = new JTextField();
        p.add(l5);
        p.add(t5);
        l6 = new JLabel("Email ID");
        t6 = new JTextField();
        p.add(l6);
        p.add(t6);
        l7 = new JLabel("Phone No.");
        t7 = new JTextField();
        p.add(l7);
        p.add(t7);

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());

        add(p,"Center");

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
        Image i3 = ic1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
        l8 = new JLabel(ic2);

        add(l8, "West");
        //for changing the color of the whole
        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();

        String q1 = "insert into emp values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')";

        try{
            Conn c1 = new Conn();
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null, "Employee Created");
            this.setVisible(false);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        new NewCustomer().setVisible(true);
    }
}
