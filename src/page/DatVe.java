package page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
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
import component.nut_gradient;

public class DatVe extends JPanel{
	nut_gradient book_phim1,book_phim2,book_phim3,book_phim4,book_phim5,book_phim6;
	private GradientPaint mau_gradient;
	private JPanel phim1,phim2,phim3,phim4,phim5,phim6;
	private JLabel hinh_phim1,hinh_phim2,hinh_phim3,hinh_phim4,hinh_phim5,hinh_phim6;
	private JTextArea theloai_phim1,theloai_phim2,theloai_phim3,theloai_phim4,theloai_phim5,theloai_phim6,tieude_phim1,tieude_phim2,tieude_phim3,tieude_phim4,tieude_phim5,tieude_phim6;
	public DatVe(Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		setSize(1128,920);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(14f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_gradient = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		
		phim1 = new JPanel();
		phim1.setOpaque(false);
		phim1.setBounds(53, 34, 262, 395);
		add(phim1);
		phim1.setLayout(null);
		
		hinh_phim1 = new JLabel("New label");
		hinh_phim1.setBorder(null);
		hinh_phim1.setIcon(new ImageIcon("src\\resources\\Image\\banner\\modomdom.jpg"));
		hinh_phim1.setBackground(new Color(0, 0, 0));
		hinh_phim1.setBounds(0, 0, 262, 238);
		phim1.add(hinh_phim1);
		
		book_phim1 = new nut_gradient("Mua vé", mau_gradient);
		book_phim1.setBounds(0, 364, 262, 31);
		phim1.add(book_phim1);
		
		theloai_phim1 = new JTextArea();
		theloai_phim1.setText("Thể loại : Hoạt hình\n\nThời lượng :  89 phút");
		theloai_phim1.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim1.setFont(Dosis_Bold_14);
		theloai_phim1.setOpaque(false);
		theloai_phim1.setEnabled(false);
		theloai_phim1.setEditable(false);
		theloai_phim1.setBounds(0, 289, 262, 64);
		phim1.add(theloai_phim1);
		
		tieude_phim1 = new JTextArea();
		tieude_phim1.setText("MỘ ĐOM ĐÓM");
		tieude_phim1.setOpaque(false);
		tieude_phim1.setBackground(new Color(112, 128, 144));
		tieude_phim1.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim1.setFont(Dosis_Bold_20);
		tieude_phim1.setEnabled(false);
		tieude_phim1.setEditable(false);
		tieude_phim1.setBounds(0, 249, 262, 39);
		phim1.add(tieude_phim1);
		
		phim2 = new JPanel();
		phim2.setOpaque(false);
		phim2.setBounds(419, 34, 262, 395);
		add(phim2);
		phim2.setLayout(null);
		
		hinh_phim2 = new JLabel("New label");
		hinh_phim2.setIcon(new ImageIcon("src\\resources\\Image\\banner\\kumathong.png"));
		hinh_phim2.setBounds(0, 0, 262, 238);
		phim2.add(hinh_phim2);
		
		book_phim2 = new nut_gradient("Mua vé", mau_gradient);
		book_phim2.setBounds(0, 364, 262, 31);
		phim2.add(book_phim2);
		
		theloai_phim2 = new JTextArea();
		theloai_phim2.setText("KUMATHONG");
		theloai_phim2.setOpaque(false);
		theloai_phim2.setFont(null);
		theloai_phim2.setEnabled(false);
		theloai_phim2.setEditable(false);
		theloai_phim2.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim2.setBackground(new Color(112, 128, 144));
		theloai_phim2.setBounds(0, 249, 262, 39);
		theloai_phim2.setFont(Dosis_Bold_20);
		phim2.add(theloai_phim2);
		
		tieude_phim2 = new JTextArea();
		tieude_phim2.setText("Thể loại : Kinh dị\n\nThời lượng :  121 phút");
		tieude_phim2.setOpaque(false);
		tieude_phim2.setFont(null);
		tieude_phim2.setEnabled(false);
		tieude_phim2.setEditable(false);
		tieude_phim2.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim2.setBounds(0, 289, 262, 64);
		tieude_phim2.setFont(Dosis_Bold_14);
		phim2.add(tieude_phim2);
		
		phim3 = new JPanel();
		phim3.setOpaque(false);
		phim3.setBounds(785, 34, 262, 395);
		add(phim3);
		phim3.setLayout(null);
		
		hinh_phim3 = new JLabel("New label");
		hinh_phim3.setBounds(0, 0, 262, 238);
		hinh_phim3.setIcon(new ImageIcon("src\\resources\\Image\\banner\\transformer.jpg"));
		phim3.add(hinh_phim3);
		
		book_phim3 = new nut_gradient("Mua vé", mau_gradient);
		book_phim3.setBounds(0, 364, 262, 31);
		phim3.add(book_phim3);
		
		theloai_phim3 = new JTextArea();
		theloai_phim3.setText("TRANSFORMER MỘT");
		theloai_phim3.setOpaque(false);
		theloai_phim3.setFont(null);
		theloai_phim3.setEnabled(false);
		theloai_phim3.setEditable(false);
		theloai_phim3.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim3.setBackground(new Color(112, 128, 144));
		theloai_phim3.setBounds(0, 249, 262, 39);
		theloai_phim3.setFont(Dosis_Bold_20);
		phim3.add(theloai_phim3);
		
		tieude_phim3 = new JTextArea();
		tieude_phim3.setText("Thể loại : Hoạt hình\n\nThời lượng :  113 phút");
		tieude_phim3.setOpaque(false);
		tieude_phim3.setFont(null);
		tieude_phim3.setEnabled(false);
		tieude_phim3.setEditable(false);
		tieude_phim3.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim3.setBounds(0, 289, 262, 64);
		tieude_phim3.setFont(Dosis_Bold_14);
		phim3.add(tieude_phim3);
		
		phim4 = new JPanel();
		phim4.setOpaque(false);
		phim4.setBounds(53, 482, 262, 395);
		add(phim4);
		phim4.setLayout(null);
		
		hinh_phim4 = new JLabel("New label");
		hinh_phim4.setBounds(0, 0, 262, 238);
		hinh_phim4.setIcon(new ImageIcon("src\\resources\\Image\\banner\\quyantang2.jpg"));
		phim4.add(hinh_phim4);
		
		book_phim4 = new nut_gradient("Mua vé", mau_gradient);
		book_phim4.setBounds(0, 364, 262, 31);
		phim4.add(book_phim4);
		
		theloai_phim4 = new JTextArea();
		theloai_phim4.setText("QUỶ ĂN TẠNG 2");
		theloai_phim4.setOpaque(false);
		theloai_phim4.setFont(null);
		theloai_phim4.setEnabled(false);
		theloai_phim4.setEditable(false);
		theloai_phim4.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim4.setBackground(new Color(112, 128, 144));
		theloai_phim4.setBounds(0, 249, 262, 39);
		theloai_phim4.setFont(Dosis_Bold_20);
		phim4.add(theloai_phim4);
		
		tieude_phim4 = new JTextArea();
		tieude_phim4.setText("Thể loại : Kinh dị\n\nThời lượng :  143 phút");
		tieude_phim4.setOpaque(false);
		tieude_phim4.setFont(null);
		tieude_phim4.setEnabled(false);
		tieude_phim4.setEditable(false);
		tieude_phim4.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim4.setBounds(0, 289, 262, 64);
		tieude_phim4.setFont(Dosis_Bold_14);
		phim4.add(tieude_phim4);
		
		phim5 = new JPanel();
		phim5.setOpaque(false);
		phim5.setBounds(419, 482, 262, 395);
		add(phim5);
		phim5.setLayout(null);
		
		hinh_phim5 = new JLabel("New label");
		hinh_phim5.setBounds(0, 0, 262, 238);
		hinh_phim5.setIcon(new ImageIcon("src\\resources\\Image\\banner\\joker.jpg"));
		phim5.add(hinh_phim5);
		
		book_phim5 = new nut_gradient("Mua vé", mau_gradient);
		book_phim5.setBounds(0, 364, 262, 31);
		phim5.add(book_phim5);
		
		theloai_phim5 = new JTextArea();
		theloai_phim5.setText("Thể loại : Tâm lý\n\nThời lượng :  123 phút");
		theloai_phim5.setOpaque(false);
		theloai_phim5.setFont(null);
		theloai_phim5.setEnabled(false);
		theloai_phim5.setEditable(false);
		theloai_phim5.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim5.setBounds(0, 289, 262, 64);
		theloai_phim5.setFont(Dosis_Bold_14);
		phim5.add(theloai_phim5);
		
		tieude_phim5 = new JTextArea();
		tieude_phim5.setText("JOKER : FOLIE A DEUX");
		tieude_phim5.setOpaque(false);
		tieude_phim5.setFont(null);
		tieude_phim5.setEnabled(false);
		tieude_phim5.setEditable(false);
		tieude_phim5.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim5.setBackground(new Color(112, 128, 144));
		tieude_phim5.setBounds(0, 249, 262, 39);
		tieude_phim5.setFont(Dosis_Bold_20);
		phim5.add(tieude_phim5);
		
		phim6 = new JPanel();
		phim6.setOpaque(false);
		phim6.setBounds(785, 482, 262, 395);
		add(phim6);
		phim6.setLayout(null);
		
		hinh_phim6 = new JLabel("New label");
		hinh_phim6.setBounds(0, 0, 262, 238);
		hinh_phim6.setIcon(new ImageIcon("src\\resources\\Image\\banner\\cam.jpg"));
		phim6.add(hinh_phim6);
		
		book_phim6 = new nut_gradient("Mua vé", mau_gradient);
		book_phim6.setBounds(0, 364, 262, 31);
		phim6.add(book_phim6);
		
		theloai_phim6 = new JTextArea();
		theloai_phim6.setText("Thể loại : Kinh dị\n\nThời lượng :  111 phút");
		theloai_phim6.setOpaque(false);
		theloai_phim6.setFont(null);
		theloai_phim6.setEnabled(false);
		theloai_phim6.setEditable(false);
		theloai_phim6.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim6.setBounds(0, 289, 262, 64);
		theloai_phim6.setFont(Dosis_Bold_14);
		phim6.add(theloai_phim6);
		
		tieude_phim6 = new JTextArea();
		tieude_phim6.setText("CÁM");
		tieude_phim6.setOpaque(false);
		tieude_phim6.setFont(null);
		tieude_phim6.setEnabled(false);
		tieude_phim6.setEditable(false);
		tieude_phim6.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim6.setBackground(new Color(112, 128, 144));
		tieude_phim6.setBounds(0, 249, 262, 39);
		tieude_phim6.setFont(Dosis_Bold_20);
		phim6.add(tieude_phim6);
		
		book_phim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });

	}
}
