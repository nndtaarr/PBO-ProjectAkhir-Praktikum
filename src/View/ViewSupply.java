/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/**
 *
 * @author Ardya
 */
public class ViewSupply extends JFrame{
    JLabel title = new JLabel("BOGA RASA SUPPLY");
    JLabel title2 = new JLabel("BOGA RASA SUPPLY");


    public JButton btnHome = new JButton("Home");

    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane jScrollPane;
    public Object[] namaKolom = {"Supply","Kategori","Supplier","Nama Produk","Jumlah Produk"};
    
    Color croco = new Color (209, 204, 192);
    Color officer  = new Color(44, 58, 71);

    ImageIcon img = new ImageIcon("src\\Assets\\4.jpg");
    JLabel logo = new JLabel(img);


    Font font = new Font("Garamond",Font.PLAIN,20);

    public ViewSupply(){
        setTitle("Lihat Supplay admin | ALL YOU CAN EAT");
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        jScrollPane = new JScrollPane(tabel);
        getContentPane().setBackground(officer);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(340,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(croco);
        add(title2);
        title2.setBounds(370,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(Color.white);

        add(jScrollPane);
        jScrollPane.setBounds(100,180,1000,400);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(logo);
        logo.setBounds(1000,80,100,100);

        add(btnHome);
        btnHome.setBounds(30, 55, 88, 50);
        btnHome.setFont(font);
        btnHome.setBackground(croco);
        btnHome.setForeground(Color.black);

    }
}
