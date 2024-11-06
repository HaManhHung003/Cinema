package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;

import javax.print.attribute.AttributeSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import component.nut_gradient;

public class GUI_ChonGhe extends JPanel{
	private JTextField txtKhuyenMai;
	private JSeparator thanh_ngang1,thanh_ngang2;
	private JLabel lbManHinh,lbNgayGio,lbSuat,lbGheChon,lbGhe,lbPhim,lbGheDon,lbGheDoi,lbGheDangChon,lbGheDaDat,lbGheTrong;
	private JLabel rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI,rowK;
	private nut_gradient A01, A02, A03, A04, A05, A06, A07, A08, A09, A010, A011,B01, B02, B03, B04, B05, B06, B07, B08, B09, 
					B010, B011,C01, C02, C03, C04, C05, C06, C07, C08, C09, C010, C011,D01, D02, D03, D04, D05, D06, D07, D08, D09, D010, D011,
					E01, E02, E03, E04, E05, E06, E07, E08, E09, E010, E011,F01, F02, F03, F04, F05, F06, F07, F08, F09, F010, F011,
					G01, G02, G03, G04, G05, G06, G07, G08, G09, G010, G011,H01, H02, H03, H04, H05, H06, H07, H08, H09, H010, H011,
					I01, I02, I03, I04, I05, I06,gheTrong,gheDaDat,gheDangChon,gheDon,gheDoi,btn_DatVe;
	private GradientPaint mau_Trong,mau_DaDat,mau_DangChon;
	private JLabel lbTongCong;
	private JLabel sum;
	public GUI_ChonGhe(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		setSize(1128,705);
		setBackground(new Color(36, 34, 34));
		setLayout(null);
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_Trong = new GradientPaint(p1,new Color(217,217,217),p2,new Color(217,217,217));
		mau_DaDat = new GradientPaint(p1,new Color(113,101,101),p2,new Color(113,101,101));
		mau_DangChon = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(19f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Bold_13 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(12f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
        
        thanh_ngang1 = new JSeparator();
        thanh_ngang1.setBounds(60, 58, 1050, 4);
        add(thanh_ngang1);
        
        lbManHinh = new JLabel(" Màn hình");
        lbManHinh.setForeground(new Color(255, 255, 255));
        lbManHinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbManHinh.setBounds(520, 20, 100, 30);
        lbManHinh.setFont(Dosis_Bold);
        add(lbManHinh);
        
        rowA = new JLabel("A");
        rowA.setHorizontalAlignment(SwingConstants.CENTER);
        rowA.setForeground(new Color(255, 255, 255));
        rowA.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowA.setBounds(20, 95, 20, 20);
        rowA.setFont(Dosis_Bold_20);
        add(rowA);
        
        
        rowB = new JLabel("B");
        rowB.setHorizontalAlignment(SwingConstants.CENTER);
        rowB.setForeground(Color.WHITE);
        rowB.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowB.setBounds(20, 145, 20, 20);
        rowB.setFont(Dosis_Bold_20);
        add(rowB);
        
        rowC = new JLabel("C");
        rowC.setHorizontalAlignment(SwingConstants.CENTER);
        rowC.setForeground(Color.WHITE);
        rowC.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowC.setBounds(20, 195, 20, 20);
        rowC.setFont(Dosis_Bold_20);
        add(rowC);
        
        rowD = new JLabel("D");
        rowD.setHorizontalAlignment(SwingConstants.CENTER);
        rowD.setForeground(Color.WHITE);
        rowD.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowD.setBounds(20, 245, 20, 20);
        rowD.setFont(Dosis_Bold_20);
        add(rowD);
        
        rowE = new JLabel("E");
        rowE.setHorizontalAlignment(SwingConstants.CENTER);
        rowE.setForeground(Color.WHITE);
        rowE.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowE.setBounds(20, 295, 20, 20);
        rowE.setFont(Dosis_Bold_20);
        add(rowE);
        
        rowF = new JLabel("F");
        rowF.setHorizontalAlignment(SwingConstants.CENTER);
        rowF.setForeground(Color.WHITE);
        rowF.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowF.setBounds(20, 345, 20, 20);
        rowF.setFont(Dosis_Bold_20);
        add(rowF);
        
        rowG = new JLabel("G");
        rowG.setHorizontalAlignment(SwingConstants.CENTER);
        rowG.setForeground(Color.WHITE);
        rowG.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowG.setBounds(20, 395, 20, 20);
        rowG.setFont(Dosis_Bold_20);
        add(rowG);
        
        rowH = new JLabel("H");
        rowH.setHorizontalAlignment(SwingConstants.CENTER);
        rowH.setForeground(Color.WHITE);
        rowH.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowH.setBounds(20, 445, 20, 20);
        rowH.setFont(Dosis_Bold_20);
        add(rowH);
        
        rowI = new JLabel("I");
        rowI.setHorizontalAlignment(SwingConstants.CENTER);
        rowI.setForeground(Color.WHITE);
        rowI.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowI.setBounds(20, 495, 20, 20);
        rowI.setFont(Dosis_Bold_20);
        add(rowI);
        
        A01 = new nut_gradient("A01",mau_Trong);
        A01.setFont(Dosis_Bold_13);
        A01.setRadius(10);
        A01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A01.setBounds(83, 90, 55, 30);
        add(A01);
        
        A02 = new nut_gradient("A02",mau_Trong);
        A02.setFont(Dosis_Bold_13);
        A02.setRadius(10);
        A02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A02.setBounds(178, 90, 55, 30);
        add(A02);
        
        A03 = new nut_gradient("A03",mau_Trong);
        A03.setFont(Dosis_Bold_13);
        A03.setRadius(10);
        A03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A03.setBounds(273, 90, 55, 30);
        add(A03);
        
        A04 = new nut_gradient("A04",mau_Trong);
        A04.setFont(Dosis_Bold_13);
        A04.setRadius(10);
        A04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A04.setBounds(368, 90, 55, 30);
        add(A04);
        
        A05 = new nut_gradient("A05",mau_Trong);
        A05.setFont(Dosis_Bold_13);
        A05.setRadius(10);
        A05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A05.setBounds(463, 90, 55, 30);
        add(A05);
        
        A06 = new nut_gradient("A06",mau_Trong);
        A06.setFont(Dosis_Bold_13);
        A06.setRadius(10);
        A06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A06.setBounds(558, 90, 55, 30);
        add(A06);
        
        A07 = new nut_gradient("A07",mau_Trong);
        A07.setFont(Dosis_Bold_13);
        A07.setRadius(10);
        A07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A07.setBounds(653, 90, 55, 30);
        add(A07);
        
        A08 = new nut_gradient("A08",mau_Trong);
        A08.setFont(Dosis_Bold_13);
        A08.setRadius(10);
        A08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A08.setBounds(748, 90, 55, 30);
        add(A08);
        
        A09 = new nut_gradient("A09",mau_Trong);
        A09.setFont(Dosis_Bold_13);
        A09.setRadius(10);
        A09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A09.setBounds(843, 90, 55, 30);
        add(A09);
        
        A010 = new nut_gradient("A10",mau_Trong);
        A010.setFont(Dosis_Bold_13);
        A010.setRadius(10);
        A010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A010.setBounds(938, 90, 55, 30);
        add(A010);
        
        A011 = new nut_gradient("A011",mau_Trong);
        A011.setFont(Dosis_Bold_13);
        A011.setRadius(10);
        A011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A011.setBounds(1033, 90, 55, 30);
        add(A011);
        
        B01 = new nut_gradient("B01",mau_Trong);
        B01.setFont(Dosis_Bold_13);
        B01.setRadius(10);
        B01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B01.setBounds(83, 140, 55, 30);
        add(B01);
        
        B02 = new nut_gradient("B02",mau_Trong);
        B02.setFont(Dosis_Bold_13);
        B02.setRadius(10);
        B02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B02.setBounds(178, 140, 55, 30);
        add(B02);
        
        B03 = new nut_gradient("B03",mau_Trong);
        B03.setFont(Dosis_Bold_13);
        B03.setRadius(10);
        B03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B03.setBounds(273, 140, 55, 30);
        add(B03);
        
        B04 = new nut_gradient("B04",mau_Trong);
        B04.setFont(Dosis_Bold_13);
        B04.setRadius(10);
        B04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B04.setBounds(368, 140, 55, 30);
        add(B04);
        
        B05 = new nut_gradient("B05",mau_Trong);
        B05.setFont(Dosis_Bold_13);
        B05.setRadius(10);
        B05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B05.setBounds(463, 140, 55, 30);
        add(B05);
        
        B06 = new nut_gradient("B06",mau_Trong);
        B06.setFont(Dosis_Bold_13);
        B06.setRadius(10);
        B06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B06.setBounds(558, 140, 55, 30);
        add(B06);
        
        B07 = new nut_gradient("B07",mau_Trong);
        B07.setFont(Dosis_Bold_13);
        B07.setRadius(10);
        B07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B07.setBounds(653, 140, 55, 30);
        add(B07);
        
        B08 = new nut_gradient("B08",mau_Trong);
        B08.setFont(Dosis_Bold_13);
        B08.setRadius(10);
        B08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B08.setBounds(748, 140, 55, 30);
        add(B08);
        
        B09 = new nut_gradient("B09",mau_Trong);
        B09.setFont(Dosis_Bold_13);
        B09.setRadius(10);
        B09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B09.setBounds(843, 140, 55, 30);
        add(B09);
        
        B010 = new nut_gradient("B10",mau_Trong);
        B010.setFont(Dosis_Bold_13);
        B010.setRadius(10);
        B010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B010.setBounds(938, 140, 55, 30);
        add(B010);
        
        B011 = new nut_gradient("B011",mau_Trong);
        B011.setFont(Dosis_Bold_13);
        B011.setRadius(10);
        B011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B011.setBounds(1033, 140, 55, 30);
        add(B011);
        
        C01 = new nut_gradient("C01",mau_Trong);
        C01.setFont(Dosis_Bold_13);
        C01.setRadius(10);
        C01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C01.setBounds(83, 190, 55, 30);
        add(C01);
        
        C02 = new nut_gradient("C02",mau_Trong);
        C02.setFont(Dosis_Bold_13);
        C02.setRadius(10);
        C02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C02.setBounds(178, 190, 55, 30);
        add(C02);
        
        C03 = new nut_gradient("C03",mau_Trong);
        C03.setFont(Dosis_Bold_13);
        C03.setRadius(10);
        C03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C03.setBounds(273, 190, 55, 30);
        add(C03);
        
        C04 = new nut_gradient("C04",mau_Trong);
        C04.setFont(Dosis_Bold_13);
        C04.setRadius(10);
        C04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C04.setBounds(368, 190, 55, 30);
        add(C04);
        
        C05 = new nut_gradient("C05",mau_Trong);
        C05.setFont(Dosis_Bold_13);
        C05.setRadius(10);
        C05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C05.setBounds(463, 190, 55, 30);
        add(C05);
        
        C06 = new nut_gradient("C06",mau_Trong);
        C06.setFont(Dosis_Bold_13);
        C06.setRadius(10);
        C06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C06.setBounds(558, 190, 55, 30);
        add(C06);
        
        C07 = new nut_gradient("C07",mau_Trong);
        C07.setFont(Dosis_Bold_13);
        C07.setRadius(10);
        C07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C07.setBounds(653, 190, 55, 30);
        add(C07);
        
        C08 = new nut_gradient("C08",mau_Trong);
        C08.setFont(Dosis_Bold_13);
        C08.setRadius(10);
        C08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C08.setBounds(748, 190, 55, 30);
        add(C08);
        
        C09 = new nut_gradient("C09",mau_Trong);
        C09.setFont(Dosis_Bold_13);
        C09.setRadius(10);
        C09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C09.setBounds(843, 190, 55, 30);
        add(C09);
        
        C010 = new nut_gradient("C10",mau_Trong);
        C010.setFont(Dosis_Bold_13);
        C010.setRadius(10);
        C010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C010.setBounds(938, 190, 55, 30);
        add(C010);
        
        C011 = new nut_gradient("C011",mau_Trong);
        C011.setFont(Dosis_Bold_13);
        C011.setRadius(10);
        C011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C011.setBounds(1033, 190, 55, 30);
        add(C011);
        
        D01 = new nut_gradient("D01",mau_Trong);
        D01.setFont(Dosis_Bold_13);
        D01.setRadius(10);
        D01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D01.setBounds(83, 240, 55, 30);
        add(D01);
        
        D02 = new nut_gradient("D02",mau_Trong);
        D02.setFont(Dosis_Bold_13);
        D02.setRadius(10);
        D02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D02.setBounds(178, 240, 55, 30);
        add(D02);
        
        D03 = new nut_gradient("D03",mau_Trong);
        D03.setFont(Dosis_Bold_13);
        D03.setRadius(10);
        D03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D03.setBounds(273, 240, 55, 30);
        add(D03);
        
        D04 = new nut_gradient("D04",mau_Trong);
        D04.setFont(Dosis_Bold_13);
        D04.setRadius(10);
        D04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D04.setBounds(368, 240, 55, 30);
        add(D04);
        
        D05 = new nut_gradient("D05",mau_Trong);
        D05.setFont(Dosis_Bold_13);
        D05.setRadius(10);
        D05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D05.setBounds(463, 240, 55, 30);
        add(D05);
        
        D06 = new nut_gradient("D06",mau_Trong);
        D06.setFont(Dosis_Bold_13);
        D06.setRadius(10);
        D06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D06.setBounds(558, 240, 55, 30);
        add(D06);
        
        D07 = new nut_gradient("D07",mau_Trong);
        D07.setFont(Dosis_Bold_13);
        D07.setRadius(10);
        D07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D07.setBounds(653, 240, 55, 30);
        add(D07);
        
        D08 = new nut_gradient("D08",mau_Trong);
        D08.setFont(Dosis_Bold_13);
        D08.setRadius(10);
        D08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D08.setBounds(748, 240, 55, 30);
        add(D08);
        
        D09 = new nut_gradient("D09",mau_Trong);
        D09.setFont(Dosis_Bold_13);
        D09.setRadius(10);
        D09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D09.setBounds(843, 240, 55, 30);
        add(D09);
        
        D010 = new nut_gradient("D10",mau_Trong);
        D010.setFont(Dosis_Bold_13);
        D010.setRadius(10);
        D010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D010.setBounds(938, 240, 55, 30);
        add(D010);
        
        D011 = new nut_gradient("D011",mau_Trong);
        D011.setFont(Dosis_Bold_13);
        D011.setRadius(10);
        D011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D011.setBounds(1033, 240, 55, 30);
        add(D011);
        
        E01 = new nut_gradient("E01",mau_Trong);
        E01.setFont(Dosis_Bold_13);
        E01.setRadius(10);
        E01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E01.setBounds(83, 290, 55, 30);
        add(E01);
        
        E02 = new nut_gradient("E02",mau_Trong);
        E02.setFont(Dosis_Bold_13);
        E02.setRadius(10);
        E02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E02.setBounds(178, 290, 55, 30);
        add(E02);
        
        E03 = new nut_gradient("E03",mau_Trong);
        E03.setFont(Dosis_Bold_13);
        E03.setRadius(10);
        E03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E03.setBounds(273, 290, 55, 30);
        add(E03);
        
        E04 = new nut_gradient("E04",mau_Trong);
        E04.setFont(Dosis_Bold_13);
        E04.setRadius(10);
        E04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E04.setBounds(368, 290, 55, 30);
        add(E04);
        
        E05 = new nut_gradient("E05",mau_Trong);
        E05.setFont(Dosis_Bold_13);
        E05.setRadius(10);
        E05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E05.setBounds(463, 290, 55, 30);
        add(E05);
        
        E06 = new nut_gradient("E06",mau_Trong);
        E06.setFont(Dosis_Bold_13);
        E06.setRadius(10);
        E06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E06.setBounds(558, 290, 55, 30);
        add(E06);
        
        E07 = new nut_gradient("E07",mau_Trong);
        E07.setFont(Dosis_Bold_13);
        E07.setRadius(10);
        E07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E07.setBounds(653, 290, 55, 30);
        add(E07);
        
        E08 = new nut_gradient("E08",mau_Trong);
        E08.setFont(Dosis_Bold_13);
        E08.setRadius(10);
        E08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E08.setBounds(748, 290, 55, 30);
        add(E08);
        
        E09 = new nut_gradient("E09",mau_Trong);
        E09.setFont(Dosis_Bold_13);
        E09.setRadius(10);
        E09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E09.setBounds(843, 290, 55, 30);
        add(E09);
        
        E010 = new nut_gradient("E10",mau_Trong);
        E010.setFont(Dosis_Bold_13);
        E010.setRadius(10);
        E010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E010.setBounds(938, 290, 55, 30);
        add(E010);
        
        E011 = new nut_gradient("E011",mau_Trong);
        E011.setFont(Dosis_Bold_13);
        E011.setRadius(10);
        E011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E011.setBounds(1033, 290, 55, 30);
        add(E011);
        
        F01 = new nut_gradient("F01",mau_Trong);
        F01.setFont(Dosis_Bold_13);
        F01.setRadius(10);
        F01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F01.setBounds(83, 340, 55, 30);
        add(F01);
        
        F02 = new nut_gradient("F02",mau_Trong);
        F02.setFont(Dosis_Bold_13);
        F02.setRadius(10);
        F02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F02.setBounds(178, 340, 55, 30);
        add(F02);
        
        F03 = new nut_gradient("F03",mau_Trong);
        F03.setFont(Dosis_Bold_13);
        F03.setRadius(10);
        F03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F03.setBounds(273, 340, 55, 30);
        add(F03);
        
        F04 = new nut_gradient("F04",mau_Trong);
        F04.setFont(Dosis_Bold_13);
        F04.setRadius(10);
        F04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F04.setBounds(368, 340, 55, 30);
        add(F04);
        
        F05 = new nut_gradient("F05",mau_Trong);
        F05.setFont(Dosis_Bold_13);
        F05.setRadius(10);
        F05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F05.setBounds(463, 340, 55, 30);
        add(F05);
        
        F06 = new nut_gradient("F06",mau_Trong);
        F06.setFont(Dosis_Bold_13);
        F06.setRadius(10);
        F06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F06.setBounds(558, 340, 55, 30);
        add(F06);
        
        F07 = new nut_gradient("F07",mau_Trong);
        F07.setFont(Dosis_Bold_13);
        F07.setRadius(10);
        F07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F07.setBounds(653, 340, 55, 30);
        add(F07);
        
        F08 = new nut_gradient("F08",mau_Trong);
        F08.setFont(Dosis_Bold_13);
        F08.setRadius(10);
        F08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F08.setBounds(748, 340, 55, 30);
        add(F08);
        
        F09 = new nut_gradient("F09",mau_Trong);
        F09.setFont(Dosis_Bold_13);
        F09.setRadius(10);
        F09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F09.setBounds(843, 340, 55, 30);
        add(F09);
        
        F010 = new nut_gradient("F10",mau_Trong);
        F010.setFont(Dosis_Bold_13);
        F010.setRadius(10);
        F010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F010.setBounds(938, 340, 55, 30);
        add(F010);
        
        F011 = new nut_gradient("F011",mau_Trong);
        F011.setFont(Dosis_Bold_13);
        F011.setRadius(10);
        F011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F011.setBounds(1033, 340, 55, 30);
        add(F011);
        
        G01 = new nut_gradient("G01",mau_Trong);
        G01.setFont(Dosis_Bold_13);
        G01.setRadius(10);
        G01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G01.setBounds(83, 390, 55, 30);
        add(G01);
        
        G02 = new nut_gradient("G02",mau_Trong);
        G02.setFont(Dosis_Bold_13);
        G02.setRadius(10);
        G02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G02.setBounds(178, 390, 55, 30);
        add(G02);
        
        G03 = new nut_gradient("G03",mau_Trong);
        G03.setFont(Dosis_Bold_13);
        G03.setRadius(10);
        G03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G03.setBounds(273, 390, 55, 30);
        add(G03);
        
        G04 = new nut_gradient("G04",mau_Trong);
        G04.setFont(Dosis_Bold_13);
        G04.setRadius(10);
        G04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G04.setBounds(368, 390, 55, 30);
        add(G04);
        
        G05 = new nut_gradient("G05",mau_Trong);
        G05.setFont(Dosis_Bold_13);
        G05.setRadius(10);
        G05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G05.setBounds(463, 390, 55, 30);
        add(G05);
        
        G06 = new nut_gradient("G06",mau_Trong);
        G06.setFont(Dosis_Bold_13);
        G06.setRadius(10);
        G06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G06.setBounds(558, 390, 55, 30);
        add(G06);
        
        G07 = new nut_gradient("G07",mau_Trong);
        G07.setFont(Dosis_Bold_13);
        G07.setRadius(10);
        G07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G07.setBounds(653, 390, 55, 30);
        add(G07);
        
        G08 = new nut_gradient("G08",mau_Trong);
        G08.setFont(Dosis_Bold_13);
        G08.setRadius(10);
        G08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G08.setBounds(748, 390, 55, 30);
        add(G08);
        
        G09 = new nut_gradient("G09",mau_Trong);
        G09.setFont(Dosis_Bold_13);
        G09.setRadius(10);
        G09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G09.setBounds(843, 390, 55, 30);
        add(G09);
        
        G010 = new nut_gradient("G10",mau_Trong);
        G010.setFont(Dosis_Bold_13);
        G010.setRadius(10);
        G010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G010.setBounds(938, 390, 55, 30);
        add(G010);
        
        G011 = new nut_gradient("G011",mau_Trong);
        G011.setFont(Dosis_Bold_13);
        G011.setRadius(10);
        G011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G011.setBounds(1033, 390, 55, 30);
        add(G011);
        
        H01 = new nut_gradient("H01",mau_Trong);
        H01.setFont(Dosis_Bold_13);
        H01.setRadius(10);
        H01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H01.setBounds(83, 440, 55, 30);
        add(H01);
        
        H02 = new nut_gradient("H02",mau_Trong);
        H02.setFont(Dosis_Bold_13);
        H02.setRadius(10);
        H02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H02.setBounds(178, 440, 55, 30);
        add(H02);
        
        H03 = new nut_gradient("H03",mau_Trong);
        H03.setFont(Dosis_Bold_13);
        H03.setRadius(10);
        H03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H03.setBounds(273, 440, 55, 30);
        add(H03);
        
        H04 = new nut_gradient("H04",mau_Trong);
        H04.setFont(Dosis_Bold_13);
        H04.setRadius(10);
        H04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H04.setBounds(368, 440, 55, 30);
        add(H04);
        
        H05 = new nut_gradient("H05",mau_Trong);
        H05.setFont(Dosis_Bold_13);
        H05.setRadius(10);
        H05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H05.setBounds(463, 440, 55, 30);
        add(H05);
        
        H06 = new nut_gradient("H06",mau_Trong);
        H06.setFont(Dosis_Bold_13);
        H06.setRadius(10);
        H06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H06.setBounds(558, 440, 55, 30);
        add(H06);
        
        H07 = new nut_gradient("H07",mau_Trong);
        H07.setFont(Dosis_Bold_13);
        H07.setRadius(10);
        H07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H07.setBounds(653, 440, 55, 30);
        add(H07);
        
        H08 = new nut_gradient("H08",mau_Trong);
        H08.setFont(Dosis_Bold_13);
        H08.setRadius(10);
        H08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H08.setBounds(748, 440, 55, 30);
        add(H08);
        
        H09 = new nut_gradient("H09",mau_Trong);
        H09.setFont(Dosis_Bold_13);
        H09.setRadius(10);
        H09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H09.setBounds(843, 440, 55, 30);
        add(H09);
        
        H010 = new nut_gradient("H10",mau_Trong);
        H010.setFont(Dosis_Bold_13);
        H010.setRadius(10);
        H010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H010.setBounds(938, 440, 55, 30);
        add(H010);
        
        H011 = new nut_gradient("H011",mau_Trong);
        H011.setFont(Dosis_Bold_13);
        H011.setRadius(10);
        H011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H011.setBounds(1033, 440, 55, 30);
        add(H011);
        
        I01 = new nut_gradient("I01",mau_Trong);
        I01.setFont(Dosis_Bold_13);
        I01.setRadius(10);
        I01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I01.setBounds(109, 490, 95, 30);
        add(I01);

        I02 = new nut_gradient("I02",mau_Trong);
        I02.setFont(Dosis_Bold_13);
        I02.setRadius(10);
        I02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I02.setBounds(270, 490, 100, 30);
        add(I02);
        
        I03 = new nut_gradient("I03",mau_Trong);
        I03.setFont(Dosis_Bold_13);
        I03.setRadius(10);
        I03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I03.setBounds(450, 490, 100, 30);
        add(I03);
        
        I04 = new nut_gradient("I04",mau_Trong);
        I04.setFont(Dosis_Bold_13);
        I04.setRadius(10);
        I04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I04.setBounds(630, 490, 100, 30);
        add(I04);
        
        I05 = new nut_gradient("I05",mau_Trong);
        I05.setFont(Dosis_Bold_13);
        I05.setRadius(10);
        I05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I05.setBounds(800, 490, 100, 30);
        add(I05);

        I06 = new nut_gradient("I06",mau_Trong);
        I06.setFont(Dosis_Bold_13);
        I06.setRadius(10);
        I06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I06.setBounds(970, 490, 100, 30);
        add(I06);
        
        thanh_ngang2 = new JSeparator();
        thanh_ngang2.setBounds(60, 590, 1050, 4);
        add(thanh_ngang2);
        
        lbGheTrong = new JLabel("Ghế trống");
        lbGheTrong.setForeground(new Color(255, 255, 255));
        lbGheTrong.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheTrong.setBounds(120, 550, 70, 20);
        lbGheTrong.setFont(Dosis_Bold_14);
        add(lbGheTrong);
        
        lbGheDaDat = new JLabel("Ghế đã đặt");
        lbGheDaDat.setForeground(Color.WHITE);
        lbGheDaDat.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDaDat.setBounds(290, 550, 70, 20);
        lbGheDaDat.setFont(Dosis_Bold_14);
        add(lbGheDaDat);
        
        lbGheDangChon = new JLabel("Ghế đang chọn");
        lbGheDangChon.setForeground(Color.WHITE);
        lbGheDangChon.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDangChon.setBounds(452, 550, 100, 20);
        lbGheDangChon.setFont(Dosis_Bold_14);
        add(lbGheDangChon);
        
        lbGheDon = new JLabel("Ghế đơn");
        lbGheDon.setForeground(Color.WHITE);
        lbGheDon.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDon.setBounds(791, 550, 70, 20);
        lbGheDon.setFont(Dosis_Bold_14);
        add(lbGheDon);
        
        lbGheDoi = new JLabel("Ghế đôi");
        lbGheDoi.setForeground(Color.WHITE);
        lbGheDoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDoi.setBounds(1000, 550, 70, 20);
        lbGheDoi.setFont(Dosis_Bold_14);
        add(lbGheDoi);
        
        lbPhim = new JLabel("");
        lbPhim.setForeground(new Color(255, 130, 62));
        lbPhim.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbPhim.setBounds(50, 600, 150, 30);
        add(lbPhim);
        
        btn_DatVe = new nut_gradient("ĐẶT VÉ",mau_Trong);
        btn_DatVe.setForeground(new Color(0, 0, 0));
        btn_DatVe.setRadius(10);
        btn_DatVe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_DatVe.setBounds(960, 600, 100, 34);
        btn_DatVe.setFont(Dosis_Bold_20);
        add(btn_DatVe);
        
        lbGhe = new JLabel("Ghế: ");
        lbGhe.setForeground(new Color(255, 130, 62));
        lbGhe.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbGhe.setBounds(200, 600, 50, 30);
        lbGhe.setFont(Dosis_Bold_20);
        add(lbGhe);
        
        lbGheChon = new JLabel("");
        lbGheChon.setForeground(new Color(255, 255, 255));
        lbGheChon.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbGheChon.setBounds(250, 600, 50, 30);
        add(lbGheChon);
        
        lbSuat = new JLabel("Suất: ");
        lbSuat.setForeground(new Color(255, 130, 62));
        lbSuat.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbSuat.setBounds(330, 600, 50, 30);
        lbSuat.setFont(Dosis_Bold_20);
        add(lbSuat);
        
        lbNgayGio = new JLabel("");
        lbNgayGio.setForeground(Color.WHITE);
        lbNgayGio.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbNgayGio.setBounds(380, 600, 150, 30);
        add(lbNgayGio);
        
        txtKhuyenMai = new JTextField();
        txtKhuyenMai.setText("Mã khuyến mãi");
        txtKhuyenMai.setFont(Dosis_Bold_20);
        txtKhuyenMai.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtKhuyenMai.getText().equals("Mã khuyến mãi"))
        			
        			txtKhuyenMai.setText("");
        	}
        });
        
        txtKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtKhuyenMai.setBounds(550, 600, 150, 30);
        add(txtKhuyenMai);
        txtKhuyenMai.setColumns(10);
        
        lbTongCong = new JLabel("Tổng cộng:");
        lbTongCong.setForeground(new Color(255, 130, 62));
        lbTongCong.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbTongCong.setBounds(750, 600, 100, 30);
        lbTongCong.setFont(Dosis_Bold_20);
        add(lbTongCong);
        
        sum = new JLabel("");
        sum.setForeground(Color.WHITE);
        sum.setFont(new Font("Tahoma", Font.BOLD, 16));
        sum.setBounds(850, 600, 100, 30);
        add(sum);
        
        gheDangChon = new nut_gradient("",mau_DangChon);
        gheDangChon.setRadius(10);
        gheDangChon.setBounds(402, 550, 40, 25);
        add(gheDangChon);
        
        gheDaDat = new nut_gradient("",mau_DaDat);
        gheDaDat.setRadius(10);
        gheDaDat.setBounds(240, 550, 40, 25);
        add(gheDaDat);
        
        gheTrong = new nut_gradient("",mau_Trong);
        gheTrong.setRadius(10);
        gheTrong.setBounds(70, 550, 40, 25);
        add(gheTrong);
        
        gheDon = new nut_gradient("",mau_Trong);
        gheDon.setRadius(10);
        gheDon.setBounds(741, 550, 40, 25);
        add(gheDon);
        
        gheDoi = new nut_gradient("",mau_Trong);
        gheDoi.setRadius(10);
        gheDoi.setBounds(910, 550, 80, 25);
        add(gheDoi); 
	}
}
