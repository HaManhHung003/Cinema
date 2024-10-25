package page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

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

public class Khuyen_Mai extends JPanel{
	private JLabel sale_img1,sale_img2,sale_title1,sale_title2;
	private JTextArea sale_inform2,sale_inform1;
	public Khuyen_Mai() throws FontFormatException, IOException{
		setSize(1128,920);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);

		
		sale_img1 = new JLabel("New label");
		sale_img1.setIcon(new ImageIcon("src\\Image\\promotion1.png"));
		sale_img1.setBounds(42, 42, 487, 302);
		add(sale_img1);
		
		sale_img2 = new JLabel("New label");
		sale_img2.setIcon(new ImageIcon("src\\Image\\promotion2.jpg"));
		sale_img2.setBounds(633, 429, 430, 430);
		add(sale_img2);
		
		sale_title1 = new JLabel("C’STUDENT - 45K CHO HỌC SINH SINH VIÊN ");
		sale_title1.setForeground(new Color(255, 130, 62));
		sale_title1.setFont(Dosis_Bold);
		sale_title1.setBounds(561, 48, 465, 31);
		add(sale_title1);
		
		sale_title2 = new JLabel("RA MẮT LY MỚI MÙA HALLOWEEN!");
		sale_title2.setForeground(new Color(255, 130, 62));
		sale_title2.setFont(Dosis_Bold);
		sale_title2.setBounds(46, 454, 465, 31);
		add(sale_title2);
		
		sale_inform2 = new JTextArea();
		sale_inform2.setEnabled(false);
		sale_inform2.setDisabledTextColor(new Color(255, 238, 231));
		sale_inform2.setForeground(new Color(255, 238, 231));
		sale_inform2.setText("- Điều kiện\n\n+ Mỗi vé chỉ nhận được duy nhất một phần quà.\n\n- Lưu ý\n\n+ Chương trình sẽ kết thúc khi hết phần quà hoặc \n\nvào hạn cuối của chương trình, tùy vào điều kiện \n\nnào đến trước nhất.");
		sale_inform2.setEditable(false);
		sale_inform2.setOpaque(false);
		sale_inform2.setFont(Dosis_Bold);
		sale_inform2.setBounds(42, 504, 558, 380);
		add(sale_inform2);
		
		sale_inform1 = new JTextArea();
		sale_inform1.setDisabledTextColor(new Color(255, 238, 231));
		sale_inform1.setEnabled(false);
		sale_inform1.setText("- Điều kiện\r\n\r\r\n+ HSSV xuất trình thẻ SV hoặc CCCD từ dưới 22 tuổi.\r\r\n\r\n+ Giảng viên/ giáo viên xuất trình thẻ giảng viên.\r\n\r\r\n- Lưu ý\r\n\r\r\n+ Mỗi thẻ mua được một vé.\r\r\n\r\n+ Không áp dụng cho các ngày Lễ, Tết, hoặc suất chiếu có phụ thu từ nhà phát hành phim.");
		sale_inform1.setOpaque(false);
		sale_inform1.setForeground(new Color(255, 238, 231));
		sale_inform1.setFont(null);
		sale_inform1.setEditable(false);
		sale_inform1.setFont(Dosis_Bold);
		sale_inform1.setBounds(561, 90, 533, 313);
		add(sale_inform1);
	}
}
