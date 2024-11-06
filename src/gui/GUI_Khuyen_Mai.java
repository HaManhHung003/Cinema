package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import connectDB.JDBCUtil;

public class GUI_Khuyen_Mai extends JPanel{
	private JLabel sale_img1,sale_img2,sale_title1,sale_title2;
	private JTextArea sale_inform2,sale_inform1;
	private String tieuDe1,tieuDe2,link1,link2,dk1,dk2,dieuKien1,dieuKien2;
	private Connection conn = JDBCUtil.getConnection();
	public GUI_Khuyen_Mai() throws FontFormatException, IOException{
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_21 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		try(CallableStatement stmt = conn.prepareCall("{CALL GetKhuyenMai()}")){
			ResultSet rs = stmt.executeQuery();
			int  i = 1;
			while(rs.next()) {
				switch(i) {
					case 1:
						tieuDe1 = rs.getString("tieude");
						dk1 = rs.getString("dieuKienApDung");
						link1 = rs.getString("hinhAnh");
						break;
					case 2:
						tieuDe2 = rs.getString("tieude");
						dk2 = rs.getString("dieuKienApDung");
						link2 = rs.getString("hinhAnh");
						break;
				}i++;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		
		sale_img1 = new JLabel();
		sale_img1.setIcon(new ImageIcon(link1));
		sale_img1.setBounds(49, 21, 427, 264);
		add(sale_img1);
		
		sale_img2 = new JLabel();
		sale_img2.setIcon(new ImageIcon(link2));
		sale_img2.setBounds(635, 341, 340, 340);
		add(sale_img2);
		
		sale_title1 = new JLabel(tieuDe1);
		sale_title1.setForeground(new Color(255, 130, 62));
		sale_title1.setFont(Dosis_Bold_21);
		sale_title1.setBounds(503, 11, 615, 31);
		add(sale_title1);
		
		sale_title2 = new JLabel(tieuDe2);
		sale_title2.setForeground(new Color(255, 130, 62));
		sale_title2.setFont(Dosis_Bold_21);
		sale_title2.setBounds(50, 362, 465, 31);
		add(sale_title2);
		
		sale_inform2 = new JTextArea();
		sale_inform2.setEnabled(false);
		sale_inform2.setDisabledTextColor(new Color(255, 238, 231));
		sale_inform2.setForeground(new Color(255, 238, 231));
		dieuKien1 = breakDown(dk1.toString());
		sale_inform2.setText(dieuKien1);
		sale_inform2.setEditable(false);
		sale_inform2.setOpaque(false);
		sale_inform2.setFont(Dosis_Bold_21);
		sale_inform2.setBounds(46, 412, 545, 385);
		add(sale_inform2);
		
		sale_inform1 = new JTextArea();
		sale_inform1.setDisabledTextColor(new Color(255, 238, 231));
		sale_inform1.setEnabled(false);
		dieuKien2 = breakDown(dk2.toString());
		sale_inform1.setText(dieuKien2);
		sale_inform1.setOpaque(false);
		sale_inform1.setForeground(new Color(255, 238, 231));
		sale_inform1.setFont(null);
		sale_inform1.setEditable(false);
		sale_inform1.setFont(Dosis_Bold_21);
		sale_inform1.setBounds(503, 53, 615, 313);
		add(sale_inform1);
	}
	
	public static String breakDown(String in) {
		return in.replace("\\n", "\n");
	}
}
