/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Ardya
 */
public class ViewMain extends JFrame {
    JLabel title = new JLabel("WELCOME");

    JLabel lUser = new JLabel("Username : ");
    JTextField tfUser = new JTextField();
    JLabel lPass = new JLabel("Password : ");
    JTextField tfPass = new JTextField();

    public JButton btnLogin = new JButton("Log In");

    Color abu = new Color(45, 52, 54);
    Color whitegrey  = new Color(210, 218, 226); 
    Color green = new Color(85, 138, 90);

    ImageIcon img = new ImageIcon("src\\Assets\\u.png");
    JLabel logo = new JLabel(img);

    Font font = new Font("Helvetica",Font.PLAIN,25);

    public ViewMain(){
        setTitle("Login | ALL U CAN EAT");
        getContentPane().setBackground(abu);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(470,50,500,50);
        title.setFont(new Font("Helvetica",Font.BOLD,50));
        title.setForeground(Color.white);

        add(logo);
        logo.setBounds(100,150,626,417);

        add(lUser);
        lUser.setBounds(850, 150, 200, 25);
        lUser.setFont(font);
        lUser.setForeground(Color.white);
        
        add(tfUser);
        tfUser.setBounds(850, 200, 200, 30);
        tfUser.setBackground(whitegrey);
        
        add(lPass);
        lPass.setBounds(850, 250, 200, 25);
        lPass.setFont(font);
        lPass.setForeground(Color.white);
        
        add(tfPass);
        tfPass.setBounds(850, 300, 200, 30);
        tfPass.setBackground(whitegrey);

        add(btnLogin);
        btnLogin.setBounds(900, 350, 100, 40);
        btnLogin.setBackground(green);
        btnLogin.setForeground(Color.white);

    }

    public String getUser(){
        return tfUser.getText();
    }
    public String getPass(){
        return tfPass.getText();
    }

}
