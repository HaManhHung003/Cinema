package page;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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

import com.raven.datechooser.DateChooser;

public class staff extends JPanel{
	
	private JTextField name_txtf;
	private JTextField phone_txtf;
	private JTextField email_txtf;
	private JTextField cccd_txtf;
	private JScrollPane scrollPane;
	private JButton add_btn;
	private JLabel email_label;
	private JLabel phone_label;
	private JLabel name_label;
	private JLabel cccd_lable;
	private JLabel sex_label;
	private JLabel position_label;
	private JLabel birth_label;
	private JLabel shift_label;
	private JComboBox shift_cmbbox;
	private JComboBox position_cmbbox;
	private JComboBox sex_cmbbox;
	private DateChooser dateChooser;
	private JTable table;
	private TableModel tablemodel;
	private JTextField birth_txtf;
	public staff() throws FontFormatException, IOException{
		setSize(1128,920);
		setLayout(null);
		setBackground(new Color(36,34,34));

		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_15 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(15f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		String[] headers = "Họ tên;Giới tính;Chức vụ;SĐT;CCCD;Ngày sinh;Email".split(";");
		tablemodel = new DefaultTableModel(headers,0);
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ch\u1EE9c v\u1EE5", "S\u0110T", "CCCD", "Ng\u00E0y sinh", "Email"
			}
		));
		table.setAutoCreateColumnsFromModel(false);
		table.setSelectionBackground(new Color(192, 192, 192));
		table.setSelectionForeground(new Color(0, 0, 0));
		table.setGridColor(new Color(217, 217, 217));
		table.setRowHeight(60);
		table.setForeground(new Color(36, 34, 34));
		table.setFont(Dosis_Bold_10);
		table.setBackground(new Color(217, 217, 217));
		table.getTableHeader().setPreferredSize(new Dimension(0,60));
		table.getTableHeader().setForeground(Color.black);
		table.getTableHeader().setBackground(new Color(217, 217, 217));
		table.getTableHeader().setFont(Dosis_Bold_20);
		scrollPane = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBackground(new Color(217, 217, 217));
		scrollPane.setBounds(33, 335, 1032, 544);
		add(scrollPane);
		scrollPane.setViewportView(table);
		
		add_btn = new JButton("Thêm nhân viên");
		add_btn.setForeground(new Color(255, 255, 255));
		add_btn.setFont(Dosis_Bold_20);
		add_btn.setBorder(null);
		add_btn.setBackground(new Color(171, 27, 27));
		add_btn.setBounds(33, 268, 1032, 40);
		add(add_btn);
		
		email_label = new JLabel("Email : ");
		email_label.setForeground(new Color(255, 255, 255));
		email_label.setFont(Dosis_Bold);
		email_label.setBounds(33, 206, 86, 32);
		add(email_label);
		
		phone_label = new JLabel("SĐT : ");
		phone_label.setForeground(Color.WHITE);
		phone_label.setFont(Dosis_Bold);
		phone_label.setBounds(33, 119, 86, 32);
		add(phone_label);
		
		name_label = new JLabel("Họ tên : ");
		name_label.setForeground(Color.WHITE);
		name_label.setFont(Dosis_Bold);
		name_label.setBounds(33, 42, 86, 32);
		add(name_label);
		
		name_txtf = new JTextField();
		name_txtf.setBackground(new Color(217, 217, 217));
		name_txtf.setBounds(129, 35, 360, 52);
		add(name_txtf);
		name_txtf.setColumns(10);
		
		phone_txtf = new JTextField();
		phone_txtf.setBackground(new Color(217, 217, 217));
		phone_txtf.setColumns(10);
		phone_txtf.setBounds(129, 112, 183, 52);
		add(phone_txtf);
		
		email_txtf = new JTextField();
		email_txtf.setBackground(new Color(217, 217, 217));
		email_txtf.setColumns(10);
		email_txtf.setBounds(129, 199, 509, 52);
		add(email_txtf);
		
		cccd_lable = new JLabel("CCCD : ");
		cccd_lable.setForeground(Color.WHITE);
		cccd_lable.setFont(Dosis_Bold);
		cccd_lable.setBounds(361, 119, 86, 32);
		add(cccd_lable);
		
		cccd_txtf = new JTextField();
		cccd_txtf.setBackground(new Color(217, 217, 217));
		cccd_txtf.setColumns(10);
		cccd_txtf.setBounds(446, 113, 192, 52);
		add(cccd_txtf);
		
		sex_label = new JLabel("Giới tính :");
		sex_label.setForeground(Color.WHITE);
		sex_label.setFont(Dosis_Bold);
		sex_label.setBounds(522, 42, 103, 32);
		add(sex_label);
		
		sex_cmbbox = new JComboBox();
		sex_cmbbox.setBackground(new Color(217, 217, 217));
		sex_cmbbox.setBounds(635, 36, 119, 52);
		add(sex_cmbbox);
		
		position_label = new JLabel("Chức vụ :");
		position_label.setForeground(Color.WHITE);
		position_label.setFont(Dosis_Bold);
		position_label.setBounds(790, 42, 103, 32);
		add(position_label);
		
		position_cmbbox = new JComboBox();
		position_cmbbox.setBackground(new Color(217, 217, 217));
		position_cmbbox.setBounds(909, 35, 153, 52);
		add(position_cmbbox);
		
		birth_label = new JLabel("Ngày sinh :");
		birth_label.setForeground(Color.WHITE);
		birth_label.setFont(Dosis_Bold);
		birth_label.setBounds(696, 119, 119, 32);
		add(birth_label);
		
		shift_label = new JLabel("Ca làm việc :");
		shift_label.setForeground(Color.WHITE);
		shift_label.setFont(Dosis_Bold);
		shift_label.setBounds(696, 206, 135, 32);
		add(shift_label);
		
		shift_cmbbox = new JComboBox();
		shift_cmbbox.setBackground(new Color(217, 217, 217));
		shift_cmbbox.setBounds(846, 199, 219, 52);
		add(shift_cmbbox);
		
		birth_txtf = new JTextField();
		birth_txtf.setEditable(false);
		birth_txtf.setBounds(846, 112, 216, 52);
		add(birth_txtf);
		birth_txtf.setColumns(10);
		dateChooser = new com.raven.datechooser.DateChooser();
		dateChooser.setTextRefernce(birth_txtf);
		
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
	}
}
