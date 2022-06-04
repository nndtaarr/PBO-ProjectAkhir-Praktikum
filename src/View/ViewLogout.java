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
public class ViewLogout extends JFrame{
    JLabel title = new JLabel("TERIMA KASIH");

    public JButton btnLogin = new JButton("Kembali Login");

    Color horizon  = new Color(75, 101, 132);

    ImageIcon img = new ImageIcon("src\\Assets\\cb.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Helvetica",Font.PLAIN,25);

    public ViewLogout(){
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(420,50,800,50);
        title.setFont(new Font("Helvetica",Font.BOLD,50));

        add(logo);
        logo.setBounds(280,120,626,417);

        add(btnLogin);
        btnLogin.setBounds(500, 540, 180, 40);
        btnLogin.setFont(new Font("Helvetica",Font.BOLD,20));
        btnLogin.setBackground(horizon);
        btnLogin.setForeground(Color.white);

    }
}
