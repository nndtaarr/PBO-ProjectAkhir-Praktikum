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
public class ViewHome extends JFrame{
    JLabel title = new JLabel("ALL YOU CAN EAT");
    JLabel title2 = new JLabel("BOGA RASA");

    public JButton btnSee = new JButton("Lihat Supply");
    public JButton btnAdd = new JButton("Tambah Supply");
    public JButton btnEdit = new JButton("Edit Supply");
    public JButton btnAdd2 = new JButton("Tambah Supplier / Kategori");
    public JButton btnOut = new JButton("Log Out");


    Color horizon  = new Color(75, 101, 132);
    Color red = new Color(212, 76, 76);
    Color pink = new Color(255, 148, 177);
    Color blue2 = new Color(51, 56, 173);
    Color blue = new Color(176, 208, 211);

    ImageIcon img = new ImageIcon("src\\Assets\\fd.png");
    JLabel logo = new JLabel(img);
    ImageIcon img2 = new ImageIcon("src\\Assets\\3.jpg");
    JLabel logo2 = new JLabel(img2);

    Font font = new Font("Garamond",Font.BOLD,25);
    Font font2 = new Font ("Garamond", Font.BOLD,  50);

    public ViewHome(){
        setTitle("Home | ALL YOU CAN EAT");
        getContentPane().setBackground(horizon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(180,50,800,50);
        title.setFont(font2);
        title.setForeground(blue);
        add(title2);
        title2.setBounds(280,110,500,50);
        title2.setFont(font2);
        title2.setForeground(blue);

        add(logo);
        logo.setBounds(100,180,626,444);
        add(logo2);
        logo2.setBounds(800,20,209,209);

        add(btnSee);
        btnSee.setBounds(800, 230, 320, 60);
        btnSee.setFont(font);
        btnSee.setBackground(blue);
        btnSee.setForeground(blue2);

        add(btnAdd);
        btnAdd.setBounds(800, 330, 320, 60);
        btnAdd.setFont(font);
        btnAdd.setBackground(blue);
        btnAdd.setForeground(blue2);

        add(btnEdit);
        btnEdit.setBounds(800, 430, 320, 60);
        btnEdit.setFont(font);
        btnEdit.setBackground(blue);
        btnEdit.setForeground(blue2);

        add(btnAdd2);
        btnAdd2.setBounds(800, 530, 320, 60);
        btnAdd2.setFont(new Font("Garamond",Font.BOLD,22));
        btnAdd2.setBackground(blue);
        btnAdd2.setForeground(blue2);

        add(btnOut);
        btnOut.setBounds(1050, 50, 110, 50);
        btnOut.setFont(new Font("Garamond",Font.BOLD, 20));
        btnOut.setBackground(red);
        btnOut.setForeground(Color.white);


    }
}



