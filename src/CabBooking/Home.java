package CabBooking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener {

    JLabel imgl;
    JPanel panel;

    Home() {

        //main frame configuration
        super("GoRider");
        setVisible(true);
        setLocation(0, 0);
        setSize(1366, 700);
        
        //background Image
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("CabBooking/img/Home.jpg"));
        Image im1 = img.getImage().getScaledInstance(1366, 700, Image.SCALE_DEFAULT);
        ImageIcon background = new ImageIcon(im1);
        imgl = new JLabel(background);
        
        // menuBar
        JMenuBar menuBar = new JMenuBar();

        JMenu BookRide = new JMenu("Book a Ride");
        JMenuItem brItem = new JMenuItem("Book a Local Ride");

        JMenuItem brItem2 = new JMenuItem("Book a Long Distance Ride");

        JMenu transport = new JMenu("Transport Services");
        JMenuItem transMenu = new JMenuItem("Cargo Transport");
        

        JMenu bill = new JMenu("Ride Information");
        JMenuItem billMenu = new JMenuItem("Total Bill");
        
        JMenu LogOut = new JMenu("End Session");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem LogOutBtn = new JMenuItem("Log Out");
        

        

        BookRide.add(brItem);
        BookRide.add(brItem2);

        transport.add(transMenu);
        bill.add(billMenu);
        
        LogOut.add(exit);
        LogOut.add(LogOutBtn);


        menuBar.add(BookRide);
        menuBar.add(transport);
        menuBar.add(bill);
        menuBar.add(LogOut);

        panel = new JPanel(new BorderLayout());
        panel.add(menuBar, BorderLayout.NORTH);
        setJMenuBar(menuBar);
        add(panel);
        add(imgl);
        imgl.setBounds(0, 0, 1366, 700);
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Desktop\\CabBookingApp\\src\\CabBooking\\img\\favicon.png");
        setIconImage(icon.getImage());
        
        
        exit.addActionListener(this);
        LogOutBtn.addActionListener(this);
        billMenu.addActionListener(this);
        transMenu.addActionListener(this);
        brItem2.addActionListener(this);
        brItem.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Book a Local Ride")) {
            System.out.println("LocalRide Clicked");
        }
        else if(cmd.equals("Book a Long Distance Ride")){
            System.out.println("LongRide Clicked");
        }
        else if(cmd.equals("Cargo Transport")){
        System.out.println("Cargo Clicked");
        }
        else if(cmd.equals("Total Bill")){
            System.out.println("Bill Clicked");
        }
        else if(cmd.equals("Exit")){
            System.out.println("Exit Clicked");
        }
        else if(cmd.equals("Log Out")){
            System.out.println("Logout Clicked");
        }
        
        

    }

    public static void main(String[] args) {
        new Home();
    }

}
