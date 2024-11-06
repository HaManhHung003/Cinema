package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.JOptionPane; 
import component.MyPanel;
import component.nut_gradient;
import component.Combobox1;

public class GUI_NhanVien extends JPanel{
	
	private JTextField name_txtf,phone_txtf,email_txtf,cccd_txtf,birth_txtf;
	private JScrollPane scrollPane;
	private nut_gradient add_btn,remove_btn,upgrade_btn;
	private JLabel email_label,phone_label,name_label,cccd_lable,sex_label,position_label,birth_label,shift_label,error_label;
	private Combobox1 shift_cmbbox,position_cmbbox,sex_cmbbox;
	private DateChooser dateChooser;
	private JTable table;
	private DefaultTableModel tablemodel;
	private Connection conn = JDBCUtil.getConnection();
	private MyPanel phone_pnl,cccd_pnl,sex_pnl,position_pnl,birth_pnl,email_pnl,shift_pnl,name_pnl;
	private GradientPaint mau_gradient;
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
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_gradient = new GradientPaint(p1,new Color(171,27,27),p2,new Color(171,27,27));
		
		String[] headers = "Họ tên;Chức vụ;Giới tính;SĐT;CCCD;Ngày sinh;Ca;Email".split(";");
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
		
		scrollPane = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBackground(new Color(217, 217, 217));
		scrollPane.setBounds(44, 287, 1032, 407);
		add(scrollPane);
		scrollPane.setViewportView(table);
		
		shift_pnl = new MyPanel();
		shift_pnl.setColor(new Color(217, 217, 217));
		shift_pnl.setRadius(10);
		shift_pnl.setBorderColor(new Color(217, 217, 217));
		shift_pnl.setColorOver(new Color(217, 217, 217));
		shift_pnl.setColorClick(new Color(217, 217, 217));
		shift_pnl.setBounds(857, 145, 219, 45);
		add(shift_pnl);
		shift_pnl.setLayout(null);
		
		shift_cmbbox = new Combobox1();
		shift_cmbbox.setBorder(null);
		shift_cmbbox.setFont(Dosis_Bold_14);
		shift_cmbbox.setBounds(10, 0, 209, 45);
		shift_pnl.add(shift_cmbbox);
		shift_pnl.setOpaque(false);
		
		email_pnl = new MyPanel();
		email_pnl.setColor(new Color(217, 217, 217));
		email_pnl.setRadius(10);
		email_pnl.setBorderColor(new Color(217, 217, 217));
		email_pnl.setColorOver(new Color(217, 217, 217));
		email_pnl.setColorClick(new Color(217, 217, 217));
		email_pnl.setBounds(140, 145, 509, 45);
		add(email_pnl);
		email_pnl.setLayout(null);
		
		email_txtf = new JTextField();
		email_txtf.setFont(Dosis_Bold_14);
		email_txtf.setBorder(null);
		email_txtf.setBounds(10, 0, 499, 45);
		email_pnl.add(email_txtf);
		email_txtf.setColumns(10);
		email_txtf.setOpaque(false);
		
		birth_pnl = new MyPanel();
		birth_pnl.setColor(new Color(217, 217, 217));
		birth_pnl.setRadius(10);
		birth_pnl.setBorderColor(new Color(217, 217, 217));
		birth_pnl.setColorOver(new Color(217, 217, 217));
		birth_pnl.setColorClick(new Color(217, 217, 217));
		birth_pnl.setBounds(857, 78, 219, 45);
		add(birth_pnl);
		birth_pnl.setLayout(null);
		
		birth_txtf = new JTextField();
		birth_txtf.setOpaque(false);
		birth_txtf.setBorder(null);
		birth_txtf.setFont(Dosis_Bold_14);
		birth_txtf.setBounds(10, 0, 209, 45);
		birth_pnl.add(birth_txtf);
		birth_txtf.setEditable(false);
		birth_txtf.setColumns(10);
		dateChooser = new component.com.raven.datechooser.DateChooser();
		dateChooser.setDateFormat("yyyy-MM-dd");
		dateChooser.setTextRefernce(birth_txtf);
		
		position_pnl = new MyPanel();
		position_pnl.setBounds(912, 11, 165, 46);
		position_pnl.setColor(new Color(217, 217, 217));
		position_pnl.setRadius(10);
		position_pnl.setBorderColor(new Color(217, 217, 217));
		position_pnl.setColorOver(new Color(217, 217, 217));
		position_pnl.setColorClick(new Color(217, 217, 217));
		add(position_pnl);
		position_pnl.setLayout(null);
		
		position_cmbbox = new Combobox1();
		position_cmbbox.setBorder(null);
		position_cmbbox.setFont(Dosis_Bold_14);
		position_cmbbox.setBounds(10, 0, 155, 46);
		position_pnl.add(position_cmbbox);
		
		
		
		sex_pnl = new MyPanel();
		sex_pnl.setLayout(null);
		sex_pnl.setColor(new Color(217, 217, 217));
		sex_pnl.setRadius(10);
		sex_pnl.setBorderColor(new Color(217, 217, 217));
		sex_pnl.setColorOver(new Color(217, 217, 217));
		sex_pnl.setColorClick(new Color(217, 217, 217));
		sex_pnl.setBounds(649, 12, 129, 45);
		add(sex_pnl);
		
		sex_cmbbox = new Combobox1();
		sex_cmbbox.setBounds(10, 0, 119, 45);
		sex_cmbbox.setFont(Dosis_Bold_14);
		sex_pnl.add(sex_cmbbox);
		sex_cmbbox.setForeground(new Color(0, 0, 0));
		sex_cmbbox.setBorder(null);
		
		cccd_pnl = new MyPanel();
		cccd_pnl.setLayout(null);
		cccd_pnl.setColor(new Color(217, 217, 217));
		cccd_pnl.setRadius(10);
		cccd_pnl.setBorderColor(new Color(217, 217, 217));
		cccd_pnl.setColorOver(new Color(217, 217, 217));
		cccd_pnl.setColorClick(new Color(217, 217, 217));
		cccd_pnl.setBounds(445, 78, 204, 45);
		add(cccd_pnl);
		
		cccd_txtf = new JTextField();
		cccd_txtf.setBorder(null);
		cccd_txtf.setFont(Dosis_Bold_14);
		cccd_txtf.setBounds(10, 0, 194, 45);
		cccd_pnl.add(cccd_txtf);
		cccd_txtf.setOpaque(false);
		cccd_txtf.setColumns(10);
		
		phone_pnl = new MyPanel();
		phone_pnl.setLayout(null);
		phone_pnl.setColor(new Color(217, 217, 217));
		phone_pnl.setRadius(10);
		phone_pnl.setBorderColor(new Color(217, 217, 217));
		phone_pnl.setColorOver(new Color(217, 217, 217));
		phone_pnl.setColorClick(new Color(217, 217, 217));
		phone_pnl.setBounds(140, 78, 193, 45);
		add(phone_pnl);
		
		phone_txtf = new JTextField();
		phone_txtf.setBorder(null);
		phone_txtf.setFont(Dosis_Bold_14);
		phone_txtf.setBounds(10, 0, 183, 45);
		phone_pnl.add(phone_txtf);
		phone_txtf.setOpaque(false);
		phone_txtf.setColumns(10);
		
		name_pnl = new MyPanel();
		name_pnl.setColor(new Color(217, 217, 217));
		name_pnl.setRadius(10);
		name_pnl.setBorderColor(new Color(217, 217, 217));
		name_pnl.setColorOver(new Color(217, 217, 217));
		name_pnl.setColorClick(new Color(217, 217, 217));
		name_pnl.setBounds(140, 12, 370, 45);
		add(name_pnl);
		name_pnl.setLayout(null);
		
		name_txtf = new JTextField();
		name_txtf.setOpaque(false);
		name_txtf.setBorder(null);
		name_txtf.setFont(Dosis_Bold_14);
		name_txtf.setBounds(10, 0, 360, 45);
		name_pnl.add(name_txtf);
		name_txtf.setColumns(10);
		
		
		add_btn = new nut_gradient("Thêm nhân viên",mau_gradient);
		add_btn.setForeground(new Color(255, 255, 255));
		add_btn.setFont(Dosis_Bold_20);
		add_btn.setBorder(null);
		add_btn.setRadius(10);
		add_btn.setBounds(44, 241, 1032, 35);
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
		
		remove_btn = new nut_gradient("Xóa",mau_gradient);
		remove_btn.setForeground(new Color(255, 255, 255));
		remove_btn.setFont(null);
		remove_btn.setBorder(null);
		remove_btn.setRadius(10);
		remove_btn.setFont(Dosis_Bold_20);
		remove_btn.setBounds(44, 241, 1032, 35);
		add(remove_btn);
		
		upgrade_btn = new nut_gradient("Cập nhật",mau_gradient);
		upgrade_btn.setForeground(new Color(255, 255, 255));
		upgrade_btn.setFont(null);
		upgrade_btn.setFont(Dosis_Bold_20);
		upgrade_btn.setBorder(null);
		upgrade_btn.setRadius(10);
		upgrade_btn.setBounds(44, 241, 1032, 35);
		add(upgrade_btn);
		
		error_label = new JLabel("New label");
		error_label.setHorizontalAlignment(SwingConstants.LEFT);
		error_label.setBounds(44, 204, 370, 24);
		error_label.setForeground(new Color(255,130,62));
		error_label.setFont(Dosis_Bold_14);
		error_label.setText("");
		add(error_label);
		
		remove_btn.setVisible(false);
		upgrade_btn.setVisible(false);
		
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
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				name_txtf.setText(table.getValueAt(row, 0).toString());;
				phone_txtf.setText(table.getValueAt(row, 3).toString());
				position_cmbbox.setSelectedItem(table.getValueAt(row, 1).toString());
				sex_cmbbox.setSelectedItem(table.getValueAt(row, 2).toString()); 
				birth_txtf.setText(table.getValueAt(row, 5).toString());
				cccd_txtf.setText(table.getValueAt(row, 4).toString());
				email_txtf.setText(table.getValueAt(row, 7).toString());
				shift_cmbbox.setSelectedItem(table.getValueAt(row, 6).toString()); 
			}
			
		});
		
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
                
                String[] row = {tenNhanVien,chucVu,GioiTinh,soDienThoai,cCCD,ngaySinh,caLamViec,email};
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
				if(kiemTra()) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int rowCount = model.getRowCount();
					int count = 0;
					for(int  i =0; i < rowCount;i++) {
						Object cellValue = model.getValueAt(i, 4);
			            if (cellValue != null && cellValue.toString().equals(cccd)) {
			                count++;
			            }
					}
					if(count==0) {
						if(ten.length()>0 && sdt.length() > 0 && chuc.length() > 0 && sexchoose.length() > 0 ) {
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
				                String[] row = {ten ,chuc,sexchoose,sdt,cccd ,birth,ca,emaiL};
			                    tablemodel.addRow(row);
			                    clear();
			                    man_hinh.getFind().setText("Tìm kiếm nhân viên");
				            } catch (SQLException e2) {
				                e2.printStackTrace();
				            } 
						}
					}else {
						ShowCanhBao("Đã tồn tại nhân viên trong hệ thống");
					}
				}
			}
		});
		
		
		
		upgrade_btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String tenCu = tablemodel.getValueAt(row, 0).toString();
				String ten = name_txtf.getText();
				String sdt = phone_txtf.getText();
				String chuc = position_cmbbox.getSelectedItem().toString();
				String sexchoose = sex_cmbbox.getSelectedItem().toString();
				int sex = sexchoose.equals("Nam") ? 1 : 0; 
				String birth = birth_txtf.getText();
				String cccd = cccd_txtf.getText();
				String emaiL = email_txtf.getText();
				String ca = shift_cmbbox.getSelectedItem().toString();
				try (CallableStatement stmt = conn.prepareCall("{CALL UpdateNhanVien(?,?,?,?,?,?,?,?,?)}")) {
	                stmt.setString(1, ten);
	                stmt.setString(2, sdt);
	                stmt.setString(3, chuc);
	                stmt.setInt(4, sex);
	                stmt.setString(5, birth);
	                stmt.setString(6, cccd);
	                stmt.setString(7, emaiL);
	                stmt.setString(8, ca);
	                stmt.setString(9, tenCu);
	                stmt.execute();

	            } catch (SQLException e2) {
	                e2.printStackTrace();
	            } 
				
				tablemodel.setValueAt(ten, row, 0);
				tablemodel.setValueAt(chuc , row, 1);
				tablemodel.setValueAt(sexchoose , row, 2);
				tablemodel.setValueAt(sdt, row, 3);
				tablemodel.setValueAt(cccd , row, 4);
				tablemodel.setValueAt(birth, row, 5);
				tablemodel.setValueAt(ca , row, 6);
				tablemodel.setValueAt(emaiL, row, 7);
				clear();
				man_hinh.getFind().setText("Tìm kiếm nhân viên");
			}
			
		});
		
		remove_btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String cccd = cccd_txtf.getText();
				int canhBao = CanhBaoCoKhong("Có chắc chắn xóa ? ");
				if(canhBao == JOptionPane.YES_OPTION) {
					try (CallableStatement stmt = conn.prepareCall("{CALL RemoveNhanVien(?)}")) {
		                stmt.setString(1, cccd);
		                stmt.execute();

		            } catch (SQLException e2) {
		                e2.printStackTrace();
		            } 
					tablemodel.removeRow(row);
					clear();
					man_hinh.getFind().setText("Tìm kiếm nhân viên");
				}
			}
		});
		
		man_hinh.getSearch().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String cccd = man_hinh.getFind().getText();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int rowCount = model.getRowCount();
				int row = rowCount + 1;
				for(int  i =0; i < rowCount;i++) {
					String cellValue = model.getValueAt(i, 4).toString();
		            if (cellValue != null && cellValue.toString().equals(cccd)) {
		                row = i;
		            }
				}
				if(row <= rowCount) {
					name_txtf.setText(tablemodel.getValueAt(row, 0).toString());
					phone_txtf.setText(tablemodel.getValueAt(row, 3).toString());
					position_cmbbox.setSelectedItem(tablemodel.getValueAt(row, 1).toString());
					sex_cmbbox.setSelectedItem(tablemodel.getValueAt(row, 2).toString());
					birth_txtf.setText(tablemodel.getValueAt(row, 5).toString());
					cccd_txtf.setText(tablemodel.getValueAt(row, 4).toString());
					email_txtf.setText(tablemodel.getValueAt(row, 7).toString());
					shift_cmbbox.setSelectedItem(tablemodel.getValueAt(row, 6).toString());
				}else {
					ShowCanhBao("Không tìm thấy nhân viên");
				}
			}
			
		});
		
		man_hinh.getClear().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				clear();
				man_hinh.getFind().setText("Tìm kiếm nhân viên");
			}
			
		});
		
		man_hinh.getUpdate().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				upgrade_btn.setVisible(false);
				add_btn.setVisible(false);
				remove_btn.setVisible(true);
			}
			
		});
		
		man_hinh.getRemove().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				upgrade_btn.setVisible(false);
				add_btn.setVisible(true);
				remove_btn.setVisible(false);
			}
			
		});
		
		man_hinh.getAdd().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				upgrade_btn.setVisible(true);
				add_btn.setVisible(false);
				remove_btn.setVisible(false);
			}
			
		});
		
	}
	
	
	
	public static void ShowCanhBao(String mess) {
		JOptionPane.showMessageDialog(null, mess, "Cảnh báo", JOptionPane.WARNING_MESSAGE);
	}
	
	public static int CanhBaoCoKhong(String mess) {
		return JOptionPane.showConfirmDialog(null, mess,"Chú Ý",JOptionPane.YES_NO_OPTION);
	}
	
	public void clear() {
		name_txtf.setText("");
		phone_txtf.setText("");
		position_cmbbox.setSelectedIndex(0);
		sex_cmbbox.setSelectedIndex(0);
		birth_txtf.setText("");
		cccd_txtf.setText("");
		email_txtf.setText("");
		shift_cmbbox.setSelectedIndex(0);
	}
	
	
	public  boolean kiemTra() {
		String ten = name_txtf.getText();
		String sdt = phone_txtf.getText();
		String birth = birth_txtf.getText();
		String cccd = cccd_txtf.getText();
		String emaiL = email_txtf.getText();
		//Kiem tra ten
		if(ten.length() <= 0) {
			error_label.setText("! Lưu ý : Nhập tên");
			name_txtf.requestFocus();
			return false;
		}else {
			error_label.setText("");
		}
		//Kiem tra sdt
		if(sdt.length() > 0) {
			if(!sdt.matches("\\d{10}")) {
				error_label.setText("! Lưu ý : SDT nhập đủ 10 số");
				phone_txtf.requestFocus();
				return false;
			}else {
				error_label.setText("");
			}
		}else {
			error_label.setText("! Lưu ý : Vui lòng nhập SĐT");
			phone_txtf.requestFocus();
			return false;
		}
		//Kiem tra cccd
		if(cccd.length() > 0) {
			if(!cccd.matches("\\d{12}")) {
				error_label.setText("! Lưu ý : CCCD nhập đủ 12 số");
				cccd_txtf.requestFocus();
				return false;
			}else {
				error_label.setText("");
			}
		}else {
			error_label.setText("! Lưu ý : Vui lòng nhập CCCD");
			cccd_txtf.requestFocus();
			return false;
		}
		//Kiem tra ngay sinh
		if(birth.length() > 0) {
			DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			try {
	            LocalDate ngaySinh = LocalDate.parse(birth, formatDate);
	            LocalDate ngayHienTai = LocalDate.now();
	            long kiemTraNam = ChronoUnit.YEARS.between(ngaySinh, ngayHienTai);
	            if(kiemTraNam <= 16) {
	            	error_label.setText("! Lưu ý : Nhân viên phải trên 16 tuổi");
	            	birth_txtf.requestFocus();
	            	return false;
	            }else if(kiemTraNam == 16) {
	            	LocalDate kiemTraNgayThang = ngayHienTai.minusYears(16);
	            	if(ngaySinh.isAfter(kiemTraNgayThang)) {
	            		error_label.setText("! Lưu ý : Nhân viên phải trên 16 tuổi");
		            	birth_txtf.requestFocus();
		                return false;
	            	}else {
	            		error_label.setText("");
	            	}
	            }
	            
	        } catch (Exception e) {
	            return false;
	        }
		}
		//Kiem tra Email
		if(emaiL.length() > 0) {
			if(!emaiL.matches(".*@gmail\\.com")) {
				error_label.setText("! Lưu ý : Email phải theo định dạng ***@gmail.com");
				email_txtf.requestFocus();
				return false;
			}else {
				error_label.setText("");
			}
		}else {
			error_label.setText("! Lưu ý : Vui lòng nhập Email");
			email_txtf.requestFocus();
			return false;
		}
		return true;
	}
	
	
	
}
