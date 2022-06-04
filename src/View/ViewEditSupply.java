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
public class ViewEditSupply extends JFrame {
    JLabel title = new JLabel("EDIT SUPPLY");
    JLabel title2 = new JLabel("EDIT SUPPLY");

    JLabel lSupply = new JLabel("Supply: ");
    public JComboBox cbSupply = new JComboBox();
    JLabel lJumlah = new JLabel("Jumlah: ");
    public JTextField tfJumlah = new JTextField();
    JLabel lKategori = new JLabel("Kategori: ");
    public JComboBox cbKategori = new JComboBox();
    JLabel lSupplier = new JLabel("Supplier: ");
    public JComboBox cbSupplier = new JComboBox();


    public JButton btnHome = new JButton("Home");
    public JButton btnEdit = new JButton("Edit");
    public JButton btnReset = new JButton("Reset");

    Color middle  = new Color (25, 42, 86);
    Color spray  = new Color(130, 204, 221);
    Color blue = new Color(176, 208, 211);
    Color red2 = new Color(150, 54, 54);
    Color green2 = new Color(61, 99, 65);
 

    ImageIcon img = new ImageIcon("src\\Assets\\kurir.png");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.PLAIN,20);
    Font font2 = new Font("Garamond",Font.PLAIN,20);

    public JTable table;
    JScrollPane scrollPane;
    DefaultTableModel tableModel;
    public Object[] namaKolom= {"id_supply", "kategori","supplier", "nama_produk", "jumlah_produk"};
    public ViewEditSupply(){
        setTitle("Edit Supplay admin | ALL YOU CAN EAT");
        tableModel = new DefaultTableModel(getNamaKolom(), 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        getContentPane().setBackground(middle);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(315,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(spray);
        add(title2);
        title2.setBounds(330,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(blue);

        add(logo);
        logo.setBounds(700,10,422,634);

        add(lSupply);
        lSupply.setBounds(150,180,200,35);
        lSupply.setFont(font2);
        lSupply.setForeground(Color.white);
        add(cbSupply);
        cbSupply.setBounds(330,180,300,35);

        add(lJumlah);
        lJumlah.setBounds(150,230,200,35);
        lJumlah.setFont(font2);
        lJumlah.setForeground(Color.white);
        add(tfJumlah);
        tfJumlah.setBounds(330,230,300,35);

        add(lKategori);
        lKategori.setFont(font2);
        lKategori.setBounds(330,280,200,35);
        lKategori.setForeground(Color.white);
        add(cbKategori);
        cbKategori.setBounds(430,280,200,35);

        add(lSupplier);
        lSupplier.setFont(font2);
        lSupplier.setBounds(330,330,200,35);
        lSupplier.setForeground(Color.white);
        add(cbSupplier);
        cbSupplier.setBounds(430,330,200,35);

        add(btnEdit);
        btnEdit.setBounds(530, 380, 100, 50);
        btnEdit.setFont(font);
        btnEdit.setBackground(green2);
        btnEdit.setForeground(Color.white);
        
        add(btnReset);
        btnReset.setBounds(530, 450, 100, 50);
        btnReset.setFont(font);
        btnReset.setBackground(red2);
        btnReset.setForeground(Color.white);

        add(btnHome);
        btnHome.setBounds(30, 55, 88, 50);
        btnHome.setFont(font);
        btnHome.setBackground(spray);
        btnHome.setForeground(Color.black);
    }

    public String getSupply(){return cbSupply.getSelectedItem().toString(); }
    public String getJumlah(){
        return tfJumlah.getText();
    }
    public String getKategori(){ return cbKategori.getSelectedItem().toString();}
    public String getSupplier(){ return cbSupplier.getSelectedItem().toString();}

    public Object[] getNamaKolom() {
        return namaKolom;
    }
    public void setNamaKolom(Object[] namaKolom) {
        this.namaKolom = namaKolom;
    }

}
