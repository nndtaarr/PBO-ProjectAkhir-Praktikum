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
public class ViewAddSupplier extends JFrame {
    JLabel title = new JLabel("ADD SUPPLIER");
    JLabel title2 = new JLabel("ADD KATEGORI");

    JLabel lSupplier = new JLabel("Nama Supplier: ");
    public JTextField tfSupplier = new JTextField();
    JLabel lContact = new JLabel("Contact: ");
    public JTextField tfContact = new JTextField();
    JLabel lKategori = new JLabel("Nama Kategori: ");
    public JTextField tfKategori = new JTextField();


    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
    public JButton btnReset = new JButton("Reset");
    public JButton btnAdd2 = new JButton("Add");
    public JButton btnReset2 = new JButton("Reset");

    Color horizon  = new Color(75, 101, 132);
    Color soda = new Color (127, 143, 166);
    Color naval = new Color (39, 60, 117);
    Color red = new Color(212, 76, 76);
    Color green = new Color(85, 138, 90);
   

    ImageIcon img = new ImageIcon("src\\Assets\\deliv.jpg");
    JLabel logo = new JLabel(img);

    Font font2 = new Font("Garamond", Font.PLAIN, 20);

    public ViewAddSupplier() {
        setTitle("Add Supplier admin | ALL YOU CAN EAT");
        getContentPane().setBackground(soda);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400, 50, 1200, 700);

        add(title);
        title.setBounds(250, 100, 800, 50);
        title.setFont(new Font("Garamond", Font.BOLD, 45));
        title.setForeground(naval);
        add(title2);
        title2.setBounds(600, 100, 800, 50);
        title2.setFont(new Font("Garamond", Font.BOLD, 45));
        title2.setForeground(Color.white);

        add(logo);
        logo.setBounds(445, 200, 313, 313);

        add(lSupplier);
        lSupplier.setBounds(100, 200, 200, 35);
        lSupplier.setFont(font2);
        add(tfSupplier);
        tfSupplier.setBounds(100, 230, 300, 35);
        tfSupplier.setBackground(Color.white);

        add(lKategori);
        lKategori.setBounds(800, 200, 200, 35);
        lKategori.setFont(font2);
        add(tfKategori);
        tfKategori.setBounds(800, 230, 300, 35);
        tfKategori.setBackground(Color.white);

        add(lContact);
        lContact.setBounds(100, 270, 200, 35);
        lContact.setFont(font2);
        add(tfContact);
        tfContact.setBounds(100, 300, 300, 35);
        tfContact.setBackground(Color.white);

        add(btnAdd);
        btnAdd.setBounds(100, 355, 100, 40);
        btnAdd.setFont(font2);
        btnAdd.setBackground(green);
        btnAdd.setForeground(Color.white);
        
        add(btnReset);
        btnReset.setBounds(100, 410, 100, 40);
        btnReset.setFont(font2);
        btnReset.setBackground(red);
        btnReset.setForeground(Color.white);

        add(btnAdd2);
        btnAdd2.setBounds(800, 280, 100, 40);
        btnAdd2.setFont(font2);
        btnAdd2.setBackground(green);
        btnAdd2.setForeground(Color.white);
        
        add(btnReset2);
        btnReset2.setBounds(800, 330, 100, 40);
        btnReset2.setFont(font2);
        btnReset2.setBackground(red);
        btnReset2.setForeground(Color.white);


        add(btnHome);
        btnHome.setBounds(30, 55, 88, 50);
        btnHome.setFont(font2);
        btnHome.setBackground(horizon);
        btnHome.setForeground(Color.white);
    }

    public String getNama() {

        return tfSupplier.getText();
    }

    public String getContact() {
        return tfContact.getText();
    }
    public String getKategori() {
        return tfKategori.getText();
    }

}
