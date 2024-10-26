package ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class DatVe extends JPanel{
	public DatVe() {
		// TODO Auto-generated constructor stub
		setBackground(Color.black);
		JPanel panel = new JPanel();
		setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Mộ đom đóm");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(112, 226, 101, 41);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thể loại: Hoạt hình");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(112, 226, 121, 73);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Thời lượng: 89 phút");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(112, 250, 143, 51);
		add(lblNewLabel_5);
		
		JButton btnMuaVeButton = new JButton("Mua vé");
		btnMuaVeButton.setForeground(Color.BLACK);
		btnMuaVeButton.setBackground(Color.ORANGE);
		btnMuaVeButton.setBounds(128, 296, 85, 21);
//		btnMuaVeButton.setBackground(Color.FF823E);
		add(btnMuaVeButton);
		
		JLabel lblNewLabel_6 = new JLabel("KUMATHONG");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(405, 236, 101, 21);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thể loại: Kinh dị");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(406, 236, 101, 51);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Thời lượng: 121 phút");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(405, 255, 165, 41);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("TRANSFORMER MỘT");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(733, 242, 185, 13);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Thể loại : Hoạt hình");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(733, 252, 152, 21);
		add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Thời lượng : 113 phút");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(733, 255, 152, 41);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src/img/modomdom.png"));
		lblNewLabel.setBounds(78, 24, 200, 200);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
//		lblNewLabel_1.setIcon(new ImageIcon("D:\\abc\\Cinema\\Cinema\\src\\img\\transformers.png"));
		lblNewLabel_1.setIcon(new ImageIcon("src/img/transformers.png"));

		lblNewLabel_1.setBounds(718, 24, 200, 200);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("src/img/joker.png"));
//		lblNewLabe2.setIcon(new ImageIcon("src/img/joker.png"));

		lblNewLabel_12.setBounds(394, 337, 196, 204);
		add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
//		lblNewLabel_13.setIcon(new ImageIcon("D:\\abc\\Cinema\\Cinema\\src\\img\\cam.png"));
		lblNewLabel_13.setIcon(new ImageIcon("src/img/cam.png"));

		lblNewLabel_13.setBounds(718, 339, 205, 200);
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("Qũy ăn tạng 2");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setBackground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(112, 551, 121, 27);
		add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Thể loại: Kinh dị");
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setBackground(Color.WHITE);
		lblNewLabel_16.setBounds(112, 564, 111, 33);
		add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Thời lượng: 143 phút");
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(114, 573, 141, 42);
		add(lblNewLabel_17);
		
		JButton btnMuaVeButton_1 = new JButton("Mua vé");
		btnMuaVeButton_1.setForeground(Color.BLACK);
		btnMuaVeButton_1.setBackground(Color.ORANGE);
		btnMuaVeButton_1.setBounds(128, 611, 85, 21);
		add(btnMuaVeButton_1);
		
		JLabel lblNewLabel_18 = new JLabel("JOKER : FOLIE À DEUX");
		lblNewLabel_18.setForeground(new Color(255, 255, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(405, 551, 225, 27);
		add(lblNewLabel_18);
		
		JButton btnMuaVeButton_2 = new JButton("Mua vé");
		btnMuaVeButton_2.setForeground(Color.BLACK);
		btnMuaVeButton_2.setBackground(Color.ORANGE);
		btnMuaVeButton_2.setBounds(452, 296, 85, 21);
		add(btnMuaVeButton_2);
		
		JButton btnMuaVeButton_2_1 = new JButton("Mua vé");
		btnMuaVeButton_2_1.setForeground(Color.BLACK);
		btnMuaVeButton_2_1.setBackground(Color.ORANGE);
		btnMuaVeButton_2_1.setBounds(781, 296, 85, 21);
		add(btnMuaVeButton_2_1);
		
		JButton btnMuaVeButton_2_2 = new JButton("Mua vé");
		btnMuaVeButton_2_2.setForeground(Color.BLACK);
		btnMuaVeButton_2_2.setBackground(Color.ORANGE);
		btnMuaVeButton_2_2.setBounds(452, 611, 85, 21);
		add(btnMuaVeButton_2_2);
		
		JButton btnMuaVeButton_2_3 = new JButton("Mua vé");
		btnMuaVeButton_2_3.setForeground(Color.BLACK);
		btnMuaVeButton_2_3.setBackground(Color.ORANGE);
		btnMuaVeButton_2_3.setBounds(781, 611, 85, 21);
		add(btnMuaVeButton_2_3);
		
		JLabel lblNewLabel_19 = new JLabel("Cám");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setBackground(new Color(240, 240, 240));
		lblNewLabel_19.setBounds(755, 559, 45, 13);
		add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Thể loại: Kinh dị");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setBounds(755, 574, 130, 13);
		add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Thời lượng: 111 phút");
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setBounds(755, 588, 130, 13);
		add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Thể loại: Tâm lý");
		lblNewLabel_22.setForeground(new Color(255, 255, 255));
		lblNewLabel_22.setBounds(405, 574, 101, 13);
		add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Thời lượng: 123 phút");
		lblNewLabel_23.setForeground(new Color(255, 255, 255));
		lblNewLabel_23.setBounds(405, 588, 132, 13);
		add(lblNewLabel_23);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("src/img/kummathong.jpg"));
		lblNewLabel_14.setBounds(394, 24, 200, 200);
		add(lblNewLabel_14);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("src/img/quyantang.jpg"));
		label.setBounds(78, 339, 200, 200);
		add(label);
	}
}
