package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.print.attribute.AttributeSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_ChonGhe extends JPanel{
	private JTextField txtKhuyenMai;

	public GUI_ChonGhe(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		setBackground(new Color(35, 33, 33));
		setLayout(null);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(19f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(130, 60, 900, 4);
        add(separator);
        JLabel lbManHinh = new JLabel(" Màn hình");
        lbManHinh.setForeground(new Color(255, 255, 255));
        lbManHinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbManHinh.setBounds(520, 20, 100, 30);
        lbManHinh.setFont(Dosis_Bold);
        add(lbManHinh);
        
        JLabel rowA = new JLabel("A");
        rowA.setHorizontalAlignment(SwingConstants.CENTER);
        rowA.setForeground(new Color(255, 255, 255));
        rowA.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowA.setBounds(20, 100, 20, 20);
        rowA.setFont(Dosis_Bold_20);
        add(rowA);
        
        
        JLabel rowB = new JLabel("B");
        rowB.setHorizontalAlignment(SwingConstants.CENTER);
        rowB.setForeground(Color.WHITE);
        rowB.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowB.setBounds(20, 150, 20, 20);
        rowB.setFont(Dosis_Bold_20);
        add(rowB);
        
        JLabel rowC = new JLabel("C");
        rowC.setHorizontalAlignment(SwingConstants.CENTER);
        rowC.setForeground(Color.WHITE);
        rowC.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowC.setBounds(20, 200, 20, 20);
        rowC.setFont(Dosis_Bold_20);
        add(rowC);
        
        JLabel rowD = new JLabel("D");
        rowD.setHorizontalAlignment(SwingConstants.CENTER);
        rowD.setForeground(Color.WHITE);
        rowD.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowD.setBounds(20, 250, 20, 20);
        rowD.setFont(Dosis_Bold_20);
        add(rowD);
        
        JLabel rowE = new JLabel("E");
        rowE.setHorizontalAlignment(SwingConstants.CENTER);
        rowE.setForeground(Color.WHITE);
        rowE.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowE.setBounds(20, 300, 20, 20);
        rowE.setFont(Dosis_Bold_20);
        add(rowE);
        
        JLabel rowF = new JLabel("F");
        rowF.setHorizontalAlignment(SwingConstants.CENTER);
        rowF.setForeground(Color.WHITE);
        rowF.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowF.setBounds(20, 350, 20, 20);
        rowF.setFont(Dosis_Bold_20);
        add(rowF);
        
        JLabel rowG = new JLabel("G");
        rowG.setHorizontalAlignment(SwingConstants.CENTER);
        rowG.setForeground(Color.WHITE);
        rowG.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowG.setBounds(20, 400, 20, 20);
        rowG.setFont(Dosis_Bold_20);
        add(rowG);
        
        JLabel rowH = new JLabel("H");
        rowH.setHorizontalAlignment(SwingConstants.CENTER);
        rowH.setForeground(Color.WHITE);
        rowH.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowH.setBounds(20, 450, 20, 20);
        rowH.setFont(Dosis_Bold_20);
        add(rowH);
        
        JLabel rowI = new JLabel("I");
        rowI.setHorizontalAlignment(SwingConstants.CENTER);
        rowI.setForeground(Color.WHITE);
        rowI.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowI.setBounds(20, 500, 20, 20);
        rowI.setFont(Dosis_Bold_20);
        add(rowI);
        
        JButton A01 = new JButton("A01");
        A01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A01.setBackground(new Color(255, 255, 255));
        A01.setBounds(100, 90, 60, 30);
        add(A01);
        
        JButton A02 = new JButton("A02");
        A02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A02.setBackground(Color.WHITE);
        A02.setBounds(200, 90, 60, 30);
        add(A02);
        
        JButton A03 = new JButton("A03");
        A03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A03.setBackground(Color.WHITE);
        A03.setBounds(300, 90, 60, 30);
        add(A03);
        
        JButton A04 = new JButton("A04");
        A04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A04.setBackground(Color.WHITE);
        A04.setBounds(400, 90, 60, 30);
        add(A04);
        
        JButton A05 = new JButton("A05");
        A05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A05.setBackground(Color.WHITE);
        A05.setBounds(500, 90, 60, 30);
        add(A05);
        
        JButton A06 = new JButton("A06");
        A06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A06.setBackground(Color.WHITE);
        A06.setBounds(600, 90, 60, 30);
        add(A06);
        
        JButton A07 = new JButton("A07");
        A07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A07.setBackground(Color.WHITE);
        A07.setBounds(700, 90, 60, 30);
        add(A07);
        
        JButton A08 = new JButton("A08");
        A08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A08.setBackground(Color.WHITE);
        A08.setBounds(800, 90, 60, 30);
        add(A08);
        
        JButton A09 = new JButton("A09");
        A09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A09.setBackground(Color.WHITE);
        A09.setBounds(900, 90, 60, 30);
        add(A09);
        
        JButton A010 = new JButton("A10");
        A010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        A010.setBackground(Color.WHITE);
        A010.setBounds(1000, 90, 60, 30);
        add(A010);
        
        JButton B01 = new JButton("B01");
        B01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B01.setBackground(Color.WHITE);
        B01.setBounds(100, 140, 60, 30);
        add(B01);
        
        JButton B02 = new JButton("B02");
        B02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B02.setBackground(Color.WHITE);
        B02.setBounds(200, 140, 60, 30);
        add(B02);
        
        JButton B03 = new JButton("B03");
        B03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B03.setBackground(Color.WHITE);
        B03.setBounds(300, 140, 60, 30);
        add(B03);
        
        JButton B04 = new JButton("B04");
        B04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B04.setBackground(Color.WHITE);
        B04.setBounds(400, 140, 60, 30);
        add(B04);
        
        JButton B05 = new JButton("B05");
        B05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B05.setBackground(Color.WHITE);
        B05.setBounds(500, 140, 60, 30);
        add(B05);
        
        JButton B06 = new JButton("B06");
        B06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B06.setBackground(Color.WHITE);
        B06.setBounds(600, 140, 60, 30);
        add(B06);
        
        JButton B07 = new JButton("B07");
        B07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B07.setBackground(Color.WHITE);
        B07.setBounds(700, 140, 60, 30);
        add(B07);
        
        JButton B08 = new JButton("B08");
        B08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B08.setBackground(Color.WHITE);
        B08.setBounds(800, 140, 60, 30);
        add(B08);
        
        JButton B09 = new JButton("B09");
        B09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B09.setBackground(Color.WHITE);
        B09.setBounds(900, 140, 60, 30);
        add(B09);
        
        JButton B010 = new JButton("B10");
        B010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        B010.setBackground(Color.WHITE);
        B010.setBounds(1000, 140, 60, 30);
        add(B010);
        
        JButton C01 = new JButton("C01");
        C01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C01.setBackground(Color.WHITE);
        C01.setBounds(100, 190, 60, 30);
        add(C01);
        
        JButton C02 = new JButton("C02");
        C02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C02.setBackground(Color.WHITE);
        C02.setBounds(200, 190, 60, 30);
        add(C02);
        
        JButton C03 = new JButton("C03");
        C03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C03.setBackground(Color.WHITE);
        C03.setBounds(300, 190, 60, 30);
        add(C03);
        
        JButton C04 = new JButton("C04");
        C04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C04.setBackground(Color.WHITE);
        C04.setBounds(400, 190, 60, 30);
        add(C04);
        
        JButton C05 = new JButton("C05");
        C05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C05.setBackground(Color.WHITE);
        C05.setBounds(500, 190, 60, 30);
        add(C05);
        
        JButton C06 = new JButton("C06");
        C06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C06.setBackground(Color.WHITE);
        C06.setBounds(600, 190, 60, 30);
        add(C06);
        
        JButton C07 = new JButton("C07");
        C07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C07.setBackground(Color.WHITE);
        C07.setBounds(700, 190, 60, 30);
        add(C07);
        
        JButton C08 = new JButton("C08");
        C08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C08.setBackground(Color.WHITE);
        C08.setBounds(800, 190, 60, 30);
        add(C08);
        
        JButton C09 = new JButton("C09");
        C09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C09.setBackground(Color.WHITE);
        C09.setBounds(900, 190, 60, 30);
        add(C09);
        
        JButton C010 = new JButton("C10");
        C010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        C010.setBackground(Color.WHITE);
        C010.setBounds(1000, 190, 60, 30);
        add(C010);
        
        JButton D01 = new JButton("D01");
        D01.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        D01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D01.setBackground(Color.WHITE);
        D01.setBounds(100, 240, 60, 30);
        add(D01);
        
        JButton D02 = new JButton("D02");
        D02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D02.setBackground(Color.WHITE);
        D02.setBounds(200, 240, 60, 30);
        add(D02);
        
        JButton D03 = new JButton("D03");
        D03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D03.setBackground(Color.WHITE);
        D03.setBounds(300, 240, 60, 30);
        add(D03);
        
        JButton D04 = new JButton("D04");
        D04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D04.setBackground(Color.WHITE);
        D04.setBounds(400, 240, 60, 30);
        add(D04);
        
        JButton D05 = new JButton("D05");
        D05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D05.setBackground(Color.WHITE);
        D05.setBounds(500, 240, 60, 30);
        add(D05);
        
        JButton D06 = new JButton("D06");
        D06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D06.setBackground(Color.WHITE);
        D06.setBounds(600, 240, 60, 30);
        add(D06);
        
        JButton D07 = new JButton("D07");
        D07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D07.setBackground(Color.WHITE);
        D07.setBounds(700, 240, 60, 30);
        add(D07);
        
        JButton D08 = new JButton("D08");
        D08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D08.setBackground(Color.WHITE);
        D08.setBounds(800, 240, 60, 30);
        add(D08);
        
        JButton D09 = new JButton("D09");
        D09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D09.setBackground(Color.WHITE);
        D09.setBounds(900, 240, 60, 30);
        add(D09);
        
        JButton D010 = new JButton("D10");
        D010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        D010.setBackground(Color.WHITE);
        D010.setBounds(1000, 240, 60, 30);
        add(D010);
        
        JButton E01 = new JButton("E01");
        E01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E01.setBackground(Color.WHITE);
        E01.setBounds(100, 290, 60, 30);
        add(E01);
        
        JButton E02 = new JButton("E02");
        E02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E02.setBackground(Color.WHITE);
        E02.setBounds(200, 290, 60, 30);
        add(E02);
        
        JButton E03 = new JButton("E03");
        E03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E03.setBackground(Color.WHITE);
        E03.setBounds(300, 290, 60, 30);
        add(E03);
        
        JButton E04 = new JButton("E04");
        E04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E04.setBackground(Color.WHITE);
        E04.setBounds(400, 290, 60, 30);
        add(E04);
        
        JButton E05 = new JButton("E05");
        E05.setForeground(new Color(0, 0, 0));
        E05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E05.setBackground(new Color(255, 255, 255));
        E05.setBounds(500, 290, 60, 30);
        add(E05);
        
        JButton E06 = new JButton("E06");
        E06.setForeground(new Color(0, 0, 0));
        E06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E06.setBackground(new Color(255, 255, 255));
        E06.setBounds(600, 290, 60, 30);
        add(E06);
        
        JButton E07 = new JButton("E07");
        E07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E07.setBackground(Color.WHITE);
        E07.setBounds(700, 290, 60, 30);
        add(E07);
        
        JButton E08 = new JButton("E08");
        E08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E08.setBackground(Color.WHITE);
        E08.setBounds(800, 290, 60, 30);
        add(E08);
        
        JButton E09 = new JButton("E09");
        E09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E09.setBackground(Color.WHITE);
        E09.setBounds(900, 290, 60, 30);
        add(E09);
        
        JButton E010 = new JButton("E10");
        E010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        E010.setBackground(Color.WHITE);
        E010.setBounds(1000, 290, 60, 30);
        add(E010);
        
        JButton F01 = new JButton("F01");
        F01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F01.setBackground(Color.WHITE);
        F01.setBounds(100, 340, 60, 30);
        add(F01);
        
        JButton G01 = new JButton("G01");
        G01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G01.setBackground(Color.WHITE);
        G01.setBounds(100, 390, 60, 30);
        add(G01);
        
        JButton H01 = new JButton("H01");
        H01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H01.setBackground(Color.WHITE);
        H01.setBounds(100, 440, 60, 30);
        add(H01);
        
        JButton I01 = new JButton("I01");
        I01.setFont(new Font("Tahoma", Font.PLAIN, 14));
        I01.setBackground(Color.WHITE);
        I01.setBounds(100, 490, 100, 30);
        add(I01);
        
        JButton F02 = new JButton("F02");
        F02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F02.setBackground(Color.WHITE);
        F02.setBounds(200, 340, 60, 30);
        add(F02);
        
        JButton F03 = new JButton("F03");
        F03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F03.setBackground(Color.WHITE);
        F03.setBounds(300, 340, 60, 30);
        add(F03);
        
        JButton F04 = new JButton("F04");
        F04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F04.setBackground(Color.WHITE);
        F04.setBounds(400, 340, 60, 30);
        add(F04);
        
        JButton F05 = new JButton("F05");
        F05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F05.setBackground(Color.WHITE);
        F05.setBounds(500, 340, 60, 30);
        add(F05);
        
        JButton F06 = new JButton("F06");
        F06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F06.setBackground(new Color(255, 255, 255));
        F06.setBounds(600, 340, 60, 30);
        add(F06);
        
        JButton F07 = new JButton("F07");
        F07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F07.setBackground(Color.WHITE);
        F07.setBounds(700, 340, 60, 30);
        add(F07);
        
        JButton F08 = new JButton("F08");
        F08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F08.setBackground(Color.WHITE);
        F08.setBounds(800, 340, 60, 30);
        add(F08);
        
        JButton F09 = new JButton("F09");
        F09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F09.setBackground(Color.WHITE);
        F09.setBounds(900, 340, 60, 30);
        add(F09);
        
        JButton F010 = new JButton("F10");
        F010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        F010.setBackground(Color.WHITE);
        F010.setBounds(1000, 340, 60, 30);
        add(F010);
        
        JButton G02 = new JButton("G02");
        G02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G02.setBackground(Color.WHITE);
        G02.setBounds(200, 390, 60, 30);
        add(G02);
        
        JButton G03 = new JButton("G03");
        G03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G03.setBackground(Color.WHITE);
        G03.setBounds(300, 390, 60, 30);
        add(G03);
        
        JButton G04 = new JButton("G04");
        G04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G04.setBackground(Color.WHITE);
        G04.setBounds(400, 390, 60, 30);
        add(G04);
        
        JButton G05 = new JButton("G05");
        G05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G05.setBackground(Color.WHITE);
        G05.setBounds(500, 390, 60, 30);
        add(G05);
        
        JButton G06 = new JButton("G06");
        G06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G06.setBackground(Color.WHITE);
        G06.setBounds(600, 390, 60, 30);
        add(G06);
        
        JButton G07 = new JButton("G07");
        G07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G07.setBackground(Color.WHITE);
        G07.setBounds(700, 390, 60, 30);
        add(G07);
        
        JButton G08 = new JButton("G08");
        G08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G08.setBackground(Color.WHITE);
        G08.setBounds(800, 390, 60, 30);
        add(G08);
        
        JButton G09 = new JButton("G09");
        G09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G09.setBackground(Color.WHITE);
        G09.setBounds(900, 390, 60, 30);
        add(G09);
        
        JButton G010 = new JButton("G10");
        G010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        G010.setBackground(Color.WHITE);
        G010.setBounds(1000, 390, 60, 30);
        add(G010);
        
        JButton H02 = new JButton("H02");
        H02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H02.setBackground(Color.WHITE);
        H02.setBounds(200, 440, 60, 30);
        add(H02);
        
        JButton H03 = new JButton("H03");
        H03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H03.setBackground(Color.WHITE);
        H03.setBounds(300, 440, 60, 30);
        add(H03);
        
        JButton H04 = new JButton("H04");
        H04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H04.setBackground(Color.WHITE);
        H04.setBounds(400, 440, 60, 30);
        add(H04);
        
        JButton H05 = new JButton("H05");
        H05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H05.setBackground(Color.WHITE);
        H05.setBounds(500, 440, 60, 30);
        add(H05);
        
        JButton H06 = new JButton("H06");
        H06.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H06.setBackground(Color.WHITE);
        H06.setBounds(600, 440, 60, 30);
        add(H06);
        
        JButton H07 = new JButton("H07");
        H07.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H07.setBackground(Color.WHITE);
        H07.setBounds(700, 440, 60, 30);
        add(H07);
        
        JButton H08 = new JButton("H08");
        H08.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H08.setBackground(Color.WHITE);
        H08.setBounds(800, 440, 60, 30);
        add(H08);
        
        JButton H09 = new JButton("H09");
        H09.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H09.setBackground(Color.WHITE);
        H09.setBounds(900, 440, 60, 30);
        add(H09);
        
        JButton H010 = new JButton("H10");
        H010.setFont(new Font("Tahoma", Font.PLAIN, 14));
        H010.setBackground(Color.WHITE);
        H010.setBounds(1000, 440, 60, 30);
        add(H010);
        
        JButton I02 = new JButton("I02");
        I02.setFont(new Font("Tahoma", Font.PLAIN, 14));
        I02.setBackground(Color.WHITE);
        I02.setBounds(300, 490, 100, 30);
        add(I02);
        
        JButton I03 = new JButton("I03");
        I03.setFont(new Font("Tahoma", Font.PLAIN, 14));
        I03.setBackground(Color.WHITE);
        I03.setBounds(530, 490, 100, 30);
        add(I03);
        
        JButton I05 = new JButton("I05");
        I05.setFont(new Font("Tahoma", Font.PLAIN, 14));
        I05.setBackground(Color.WHITE);
        I05.setBounds(960, 490, 100, 30);
        add(I05);
        
        JButton I04 = new JButton("I04");
        I04.setFont(new Font("Tahoma", Font.PLAIN, 14));
        I04.setBackground(Color.WHITE);
        I04.setBounds(760, 490, 100, 30);
        add(I04);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(30, 580, 1060, 4);
        add(separator_1);
        
        JLabel lbGheTrong = new JLabel("Ghế trống");
        lbGheTrong.setForeground(new Color(255, 255, 255));
        lbGheTrong.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheTrong.setBounds(120, 550, 70, 20);
        lbGheTrong.setFont(Dosis_Bold_14);
        add(lbGheTrong);
        
        JLabel lbGheDaDat = new JLabel("Ghế đã đặt");
        lbGheDaDat.setForeground(Color.WHITE);
        lbGheDaDat.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDaDat.setBounds(290, 550, 70, 20);
        lbGheDaDat.setFont(Dosis_Bold_14);
        add(lbGheDaDat);
        
        JLabel lbGheDangChon = new JLabel("Ghế đang chọn");
        lbGheDangChon.setForeground(Color.WHITE);
        lbGheDangChon.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDangChon.setBounds(452, 550, 100, 20);
        lbGheDangChon.setFont(Dosis_Bold_14);
        add(lbGheDangChon);
        
        JLabel lbGheDon = new JLabel("Ghế đơn");
        lbGheDon.setForeground(Color.WHITE);
        lbGheDon.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDon.setBounds(791, 550, 70, 20);
        lbGheDon.setFont(Dosis_Bold_14);
        add(lbGheDon);
        
        JLabel lbGheDoi = new JLabel("Ghế đôi");
        lbGheDoi.setForeground(Color.WHITE);
        lbGheDoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbGheDoi.setBounds(1000, 550, 70, 20);
        lbGheDoi.setFont(Dosis_Bold_14);
        add(lbGheDoi);
        
        JLabel lbPhim = new JLabel("");
        lbPhim.setForeground(new Color(255, 130, 62));
        lbPhim.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbPhim.setBounds(50, 600, 150, 30);
        add(lbPhim);
        
        JButton btn_DatVe = new JButton("ĐẶT VÉ");
        btn_DatVe.setForeground(new Color(0, 0, 0));
        btn_DatVe.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn_DatVe.setBackground(new Color(255, 130, 62));
        btn_DatVe.setBounds(960, 600, 100, 34);
        btn_DatVe.setFont(Dosis_Bold_20);
        add(btn_DatVe);
        
        JLabel lbGhe = new JLabel("Ghế: ");
        lbGhe.setForeground(new Color(255, 130, 62));
        lbGhe.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbGhe.setBounds(200, 600, 50, 30);
        lbGhe.setFont(Dosis_Bold_20);
        add(lbGhe);
        
        JLabel lbGheChon = new JLabel("");
        lbGheChon.setForeground(new Color(255, 255, 255));
        lbGheChon.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbGheChon.setBounds(250, 600, 50, 30);
        add(lbGheChon);
        
        JLabel lbSuat = new JLabel("Suất: ");
        lbSuat.setForeground(new Color(255, 130, 62));
        lbSuat.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbSuat.setBounds(330, 600, 50, 30);
        lbSuat.setFont(Dosis_Bold_20);
        add(lbSuat);
        
        JLabel lbNgayGio = new JLabel("");
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
        
        JLabel lbTongCong = new JLabel("Tổng cộng:");
        lbTongCong.setForeground(new Color(255, 130, 62));
        lbTongCong.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbTongCong.setBounds(750, 600, 100, 30);
        lbTongCong.setFont(Dosis_Bold_20);
        add(lbTongCong);
        
        JLabel sum = new JLabel("");
        sum.setForeground(Color.WHITE);
        sum.setFont(new Font("Tahoma", Font.BOLD, 16));
        sum.setBounds(850, 600, 100, 30);
        add(sum);
        
        JPanel gheDangChon = new JPanel();
        gheDangChon.setBackground(new Color(255, 130, 62));
        gheDangChon.setBounds(402, 550, 40, 20);
        add(gheDangChon);
        
        JPanel gheDaDat = new JPanel();
        gheDaDat.setBackground(new Color(113, 101, 101));
        gheDaDat.setBounds(240, 550, 40, 20);
        add(gheDaDat);
        
        JPanel gheTrong = new JPanel();
        gheTrong.setBounds(70, 550, 40, 20);
        add(gheTrong);
        
        JPanel gheDon = new JPanel();
        gheDon.setBounds(741, 550, 40, 20);
        add(gheDon);
        
        JPanel gheDaDat_1 = new JPanel();
        gheDaDat_1.setBounds(910, 550, 80, 20);
        add(gheDaDat_1);
	}
}
