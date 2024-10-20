package page;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class TrangChu extends JPanel{
	private JLabel lbptmodomdom;

	public TrangChu() {
		setLayout(null);
		setSize(1128, 1024);
		setBackground(new Color(35,33,33));
		lbptmodomdom = new JLabel();
		lbptmodomdom.setLocation(160, 0);
		lbptmodomdom.setIcon(new ImageIcon("src/img/ptmodomdom.png"));
//		lbptmodomdom.setIcon(new ImageIcon("C:\\Users\\fptshop\\Desktop\\N4_K1\\HSK\\Project\\Cinema\\src\\img\\ptmodomdom.png"));
		lbptmodomdom.setSize(800, 300);
		add(lbptmodomdom);
		
		//phim1
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(35, 33, 33));
		panel1.setBounds(100, 320, 200, 310);
		add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fptshop\\Desktop\\N4_K1\\HSK\\Project\\Cinema\\src\\img\\quyantang2.png"));
		lblNewLabel.setIcon(new ImageIcon("src/img/quyantang2.png"));
		lblNewLabel.setBounds(0, 0, 200, 200);
		panel1.add(lblNewLabel);
		
		JLabel lbTenPhim1 = new JLabel("<html><u>QUỶ ĂN TẠNG</u></html>");
		lbTenPhim1.setForeground(new Color(255, 255, 255));
		lbTenPhim1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbTenPhim1.setBounds(0, 200, 200, 48);
		panel1.add(lbTenPhim1);
		
		JLabel lbTheLoai1 = new JLabel("Thể loại: Kinh dị");
		lbTheLoai1.setForeground(new Color(255, 255, 255));
		lbTheLoai1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTheLoai1.setBounds(0, 248, 200, 28);
		panel1.add(lbTheLoai1);
		
		JLabel lbThoiLuong1 = new JLabel("Thời lượng: 143 phút");
		lbThoiLuong1.setForeground(new Color(255, 255, 255));
		lbThoiLuong1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbThoiLuong1.setBounds(0, 278, 200, 28);
		panel1.add(lbThoiLuong1);
		
		//phim2
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(35, 33, 33));
		panel2.setBounds(450, 320, 200, 310);
		add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabe2 = new JLabel("");
//		lblNewLabe2.setIcon(new ImageIcon("C:\\Users\\fptshop\\Desktop\\N4_K1\\HSK\\Project\\Cinema\\src\\img\\joker.png"));
		lblNewLabe2.setIcon(new ImageIcon("src/img/joker.png"));
		lblNewLabe2.setBounds(0, 0, 200, 200);
		panel2.add(lblNewLabe2);
		
		JLabel lbTenPhim2 = new JLabel("<html><u>JOKER: FOLIE</u></html>");
		lbTenPhim2.setForeground(new Color(255, 255, 255));
		lbTenPhim2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbTenPhim2.setBounds(0, 200, 200, 48);
		panel2.add(lbTenPhim2);
					
		JLabel lbTheLoai2 = new JLabel("Thể loại: Tâm lý");
		lbTheLoai2.setForeground(new Color(255, 255, 255));
		lbTheLoai2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTheLoai2.setBounds(0, 248, 200, 28);
		panel2.add(lbTheLoai2);
				
		JLabel lbThoiLuong2 = new JLabel("Thời lượng: 123 phút");
		lbThoiLuong2.setForeground(new Color(255, 255, 255));
		lbThoiLuong2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbThoiLuong2.setBounds(0, 278, 200, 28);
		panel2.add(lbThoiLuong2);		
		
		//phim3
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(35, 33, 33));
		panel3.setBounds(800, 320, 200, 310);
		add(panel3);
		panel3.setLayout(null);
		
		JLabel lblNewLabe3 = new JLabel("");
//		lblNewLabe3.setIcon(new ImageIcon("C:\\Users\\fptshop\\Desktop\\N4_K1\\HSK\\Project\\Cinema\\src\\img\\cam.png"));
		lblNewLabe3.setIcon(new ImageIcon("src/img/cam.png"));
		lblNewLabe3.setBounds(0, 0, 200, 200);
		panel3.add(lblNewLabe3);
				
		JLabel lbTenPhim3 = new JLabel("<html><u>CÁM</u></html>");
		lbTenPhim3.setForeground(new Color(255, 255, 255));
		lbTenPhim3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbTenPhim3.setBounds(0, 200, 200, 48);
		panel3.add(lbTenPhim3);
							
		JLabel lbTheLoai3 = new JLabel("Thể loại: Kinh dị");
		lbTheLoai3.setForeground(new Color(255, 255, 255));
		lbTheLoai3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTheLoai3.setBounds(0, 248, 200, 28);
		panel3.add(lbTheLoai3);
						
		JLabel lbThoiLuong3 = new JLabel("Thời lượng: 111 phút");
		lbThoiLuong3.setForeground(new Color(255, 255, 255));
		lbThoiLuong3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbThoiLuong3.setBounds(0, 278, 200, 28);
		panel3.add(lbThoiLuong3);		
	}
}
