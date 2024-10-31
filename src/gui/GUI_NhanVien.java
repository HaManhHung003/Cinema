package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import connectDB.JDBCUtil;
import component.com.raven.datechooser.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class GUI_NhanVien extends JPanel{
	
	private JTextField name_txtf,phone_txtf,email_txtf,cccd_txtf,birth_txtf;
	private JScrollPane scrollPane;
	private JButton add_btn;
	private JLabel email_label,phone_label,name_label,cccd_lable,sex_label,position_label,birth_label,shift_label;
	private JComboBox shift_cmbbox,position_cmbbox,sex_cmbbox;
	private DateChooser dateChooser;
	private JTable table;
	private DefaultTableModel tablemodel;
	private Connection conn = JDBCUtil.getConnection();
	private JPanel phone_pnl;
	private JPanel cccd_pnl;
	private JPanel sex_pnl;
	private JPanel position_pnl;
	private JPanel birth_pnl;
	private JPanel email_pnl;
	private JPanel shift_pnl;
	public GUI_NhanVien(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException{
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));

		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_18 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(14f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		String[] headers = "Họ tên;Giới tính;Chức vụ;SĐT;CCCD;Ngày sinh;Email".split(";");
		tablemodel = new DefaultTableModel(headers,0) {
			 @Override
	            public boolean isCellEditable(int row, int column) {
	                return false; // Disable editing
	            }
		};
		table = new JTable(tablemodel);
		table.setAutoCreateColumnsFromModel(false);
		table.setSelectionBackground(new Color(192, 192, 192));
		table.setSelectionForeground(new Color(0, 0, 0));
		table.setGridColor(new Color(217, 217, 217));
		table.setRowHeight(30);
		table.setForeground(new Color(36, 34, 34));
		table.setFont(Dosis_Bold_14);
		table.setBackground(new Color(217, 217, 217));
		table.getTableHeader().setPreferredSize(new Dimension(0,30));
		table.getTableHeader().setForeground(Color.black);
		table.getTableHeader().setBackground(new Color(217, 217, 217));
		table.getTableHeader().setFont(Dosis_Bold_14);
		
		shift_pnl = new JPanel();
		shift_pnl.setBackground(new Color(217, 217, 217));
		shift_pnl.setBounds(857, 145, 219, 45);
		add(shift_pnl);
		shift_pnl.setLayout(null);
		
		shift_cmbbox = new JComboBox();
		shift_cmbbox.setBorder(null);
		shift_cmbbox.setBounds(10, 0, 209, 45);
		shift_pnl.add(shift_cmbbox);
		shift_cmbbox.setBackground(new Color(217, 217, 217));
		
		email_pnl = new JPanel();
		email_pnl.setBackground(new Color(217, 217, 217));
		email_pnl.setBounds(140, 145, 509, 45);
		add(email_pnl);
		email_pnl.setLayout(null);
		
		email_txtf = new JTextField();
		email_txtf.setBorder(null);
		email_txtf.setBounds(10, 0, 499, 45);
		email_pnl.add(email_txtf);
		email_txtf.setBackground(new Color(217, 217, 217));
		email_txtf.setColumns(10);
		
		birth_pnl = new JPanel();
		birth_pnl.setBackground(new Color(217, 217, 217));
		birth_pnl.setBounds(857, 78, 219, 45);
		add(birth_pnl);
		birth_pnl.setLayout(null);
		
		birth_txtf = new JTextField();
		birth_txtf.setBackground(new Color(217, 217, 217));
		birth_txtf.setBorder(null);
		birth_txtf.setBounds(10, 0, 209, 45);
		birth_pnl.add(birth_txtf);
		birth_txtf.setEditable(false);
		birth_txtf.setColumns(10);
		dateChooser = new component.com.raven.datechooser.DateChooser();
		dateChooser.setDateFormat("yyyy-MM-dd");
		dateChooser.setTextRefernce(birth_txtf);
		
		position_pnl = new JPanel();
		position_pnl.setBounds(912, 11, 165, 46);
		add(position_pnl);
		position_pnl.setLayout(null);
		
		position_cmbbox = new JComboBox();
		position_cmbbox.setBorder(null);
		position_cmbbox.setBounds(10, 0, 155, 46);
		position_pnl.add(position_cmbbox);
		position_cmbbox.setBackground(new Color(217, 217, 217));
		
		sex_pnl = new JPanel();
		sex_pnl.setLayout(null);
		sex_pnl.setBackground(new Color(217, 217, 217));
		sex_pnl.setBounds(649, 12, 129, 45);
		add(sex_pnl);
		
		sex_cmbbox = new JComboBox();
		sex_cmbbox.setBounds(10, 0, 119, 45);
		sex_pnl.add(sex_cmbbox);
		sex_cmbbox.setForeground(new Color(0, 0, 0));
		sex_cmbbox.setOpaque(false);
		sex_cmbbox.setBorder(null);
		sex_cmbbox.setBackground(new Color(217, 217, 217));
		
		cccd_pnl = new JPanel();
		cccd_pnl.setLayout(null);
		cccd_pnl.setBackground(new Color(217, 217, 217));
		cccd_pnl.setBounds(445, 78, 204, 45);
		add(cccd_pnl);
		
		cccd_txtf = new JTextField();
		cccd_txtf.setBorder(null);
		cccd_txtf.setBounds(10, 0, 194, 45);
		cccd_pnl.add(cccd_txtf);
		cccd_txtf.setBackground(new Color(217, 217, 217));
		cccd_txtf.setColumns(10);
		
		phone_pnl = new JPanel();
		phone_pnl.setLayout(null);
		phone_pnl.setBackground(new Color(217, 217, 217));
		phone_pnl.setBounds(140, 78, 193, 45);
		add(phone_pnl);
		
		phone_txtf = new JTextField();
		phone_txtf.setBorder(null);
		phone_txtf.setBounds(10, 0, 183, 45);
		phone_pnl.add(phone_txtf);
		phone_txtf.setBackground(new Color(217, 217, 217));
		phone_txtf.setColumns(10);
		
		JPanel name_pnl = new JPanel();
		name_pnl.setBackground(new Color(217, 217, 217));
		name_pnl.setBounds(140, 12, 370, 45);
		add(name_pnl);
		name_pnl.setLayout(null);
		
		name_txtf = new JTextField();
		name_txtf.setBorder(null);
		name_txtf.setBounds(10, 0, 360, 45);
		name_pnl.add(name_txtf);
		name_txtf.setBackground(new Color(217, 217, 217));
		name_txtf.setColumns(10);
		scrollPane = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBackground(new Color(217, 217, 217));
		scrollPane.setBounds(44, 267, 1032, 427);
		add(scrollPane);
		scrollPane.setViewportView(table);
		
		add_btn = new JButton("Thêm nhân viên");
		add_btn.setForeground(new Color(255, 255, 255));
		add_btn.setFont(Dosis_Bold_20);
		add_btn.setBorder(null);
		add_btn.setBackground(new Color(171, 27, 27));
		add_btn.setBounds(44, 211, 1032, 35);
		add(add_btn);
		
		email_label = new JLabel("Email : ");
		email_label.setForeground(new Color(255, 255, 255));
		email_label.setFont(Dosis_Bold);
		email_label.setBounds(44, 151, 86, 32);
		add(email_label);
		
		phone_label = new JLabel("SĐT : ");
		phone_label.setForeground(Color.WHITE);
		phone_label.setFont(Dosis_Bold);
		phone_label.setBounds(44, 84, 86, 32);
		add(phone_label);
		
		name_label = new JLabel("Họ tên : ");
		name_label.setForeground(Color.WHITE);
		name_label.setFont(Dosis_Bold);
		name_label.setBounds(44, 18, 86, 32);
		add(name_label);
		
		cccd_lable = new JLabel("CCCD : ");
		cccd_lable.setForeground(Color.WHITE);
		cccd_lable.setFont(Dosis_Bold);
		cccd_lable.setBounds(349, 84, 86, 32);
		add(cccd_lable);
		
		sex_label = new JLabel("Giới tính :");
		sex_label.setForeground(Color.WHITE);
		sex_label.setFont(Dosis_Bold);
		sex_label.setBounds(580, 18, 103, 32);
		add(sex_label);
		
		position_label = new JLabel("Chức vụ :");
		position_label.setForeground(Color.WHITE);
		position_label.setFont(Dosis_Bold);
		position_label.setBounds(810, 18, 103, 32);
		add(position_label);
		
		birth_label = new JLabel("Ngày sinh :");
		birth_label.setForeground(Color.WHITE);
		birth_label.setFont(Dosis_Bold);
		birth_label.setBounds(695, 84, 119, 32);
		add(birth_label);
		
		shift_label = new JLabel("Ca làm việc :");
		shift_label.setForeground(Color.WHITE);
		shift_label.setFont(Dosis_Bold);
		shift_label.setBounds(695, 151, 135, 32);
		add(shift_label);
		
		
		List<String> sex = new ArrayList<>();
		sex.add("Nam");
		sex.add("Nữ");
		for(String s:sex) {
			sex_cmbbox.addItem(s);
		}
		
		List<String> position = new ArrayList<>();
		position.add("Quản lí");
		position.add("Nhân viên");
		for(String s:position) {
			position_cmbbox.addItem(s);
		}
		
		List<String> ca = new ArrayList<>();
		ca.add("Sáng");
		ca.add("Trưa");
		ca.add("Tối");
		for(String s:ca) {
			shift_cmbbox.addItem(s);
		}
		
		try (CallableStatement stmt = conn.prepareCall("{CALL getNhanVien}")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String tenNhanVien = rs.getString("tenNhanVien");
                String soDienThoai = rs.getString("soDienThoai");
                String chucVu = rs.getString("chucVu");
                int gioiTinh = rs.getInt("gioiTinh");
                String GioiTinh = gioiTinh == 1 ? "Nam" : "Nữ";
                String ngaySinh = rs.getString("ngaySinh");
                String cCCD = rs.getString("cCCD");
                String email = rs.getString("email");
                String caLamViec = rs.getString("caLamViec");
                
                String[] row = {tenNhanVien,GioiTinh,chucVu,soDienThoai,cCCD,ngaySinh,email};
                tablemodel.addRow(row);
            }
        } catch (SQLException e3) {
            e3.printStackTrace();
        }
		
		add_btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String ten = name_txtf.getText();
				String sdt = phone_txtf.getText();
				String chuc = position_cmbbox.getSelectedItem().toString();
				String sexchoose = sex_cmbbox.getSelectedItem().toString();
				int sex = sexchoose.equals("Nam") ? 1 : 0; 
				String birth = birth_txtf.getText();
				String cccd = cccd_txtf.getText();
				String emaiL = email_txtf.getText();
				String ca = shift_cmbbox.getSelectedItem().toString();
				try (CallableStatement stmt = conn.prepareCall("{CALL AddNhanVien(?,?,?,?,?,?,?,?)}")) {
	                stmt.setString(1, ten);
	                stmt.setString(2, sdt);
	                stmt.setString(3, chuc);
	                stmt.setInt(4, sex);
	                stmt.setString(5, birth);
	                stmt.setString(6, cccd);
	                stmt.setString(7, emaiL);
	                stmt.setString(8, ca);
	                stmt.execute();

	            } catch (SQLException e2) {
	                e2.printStackTrace();
	            } 
				String[] row = {ten,sdt,chuc,sexchoose,birth,cccd,emaiL,ca};
                tablemodel.addRow(row);
			}
			
		});
		
//		man_hinh.getUpdate().addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				man_hinh.getUpdatePnl().setVisible(false);
//				man_hinh.getAddPnl().setVisible(false);
//				man_hinh.getBackPnl().setVisible(false);
//				man_hinh.getRemovePnl().setVisible(true);
//			}
//			
//		});
//		
//		man_hinh.getRemove().addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				man_hinh.getUpdatePnl().setVisible(false);
//				man_hinh.getAddPnl().setVisible(true);
//				man_hinh.getBackPnl().setVisible(false);
//				man_hinh.getRemovePnl().setVisible(false);
//			}
//			
//		});
//		
//		man_hinh.getAdd().addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				man_hinh.getUpdatePnl().setVisible(true);
//				man_hinh.getAddPnl().setVisible(false);
//				man_hinh.getBackPnl().setVisible(false);
//				man_hinh.getRemovePnl().setVisible(false);
//			}
//			
//		});
	}
}
