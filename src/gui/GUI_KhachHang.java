package gui;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import entity.KhachHang;
import storedProcedure.KhachHangStoredProcedure;

public class GUI_KhachHang extends JPanel {
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField cccdField;
    private JTextField emailField;
    private JTable table;
    private JDateChooser dateChooser;
    private KhachHangStoredProcedure khachHangSP;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public GUI_KhachHang() {
        khachHangSP = new KhachHangStoredProcedure(); // Khởi tạo stored procedure
        setBackground(new Color(36, 34, 34));
        setLayout(null);
        setSize(1107, 652);
        initUI();
        loadCustomerData(); // Tải dữ liệu khách hàng vào bảng khi khởi tạo
    }

    private void initUI() {
        JLabel nameLabel = new JLabel("Họ và tên:");
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(24, 21, 120, 27);
        add(nameLabel);

        JLabel phoneLabel = new JLabel("SĐT:");
        phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setBounds(24, 58, 120, 13);
        add(phoneLabel);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(24, 87, 105, 13);
        add(emailLabel);

        JLabel cccdLabel = new JLabel("CCCD:");
        cccdLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        cccdLabel.setForeground(Color.WHITE);
        cccdLabel.setBounds(651, 58, 91, 13);
        add(cccdLabel);

        JLabel birthLabel = new JLabel("Ngày Sinh:");
        birthLabel.setForeground(Color.WHITE);
        birthLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        birthLabel.setBounds(651, 14, 91, 27);
        add(birthLabel);
        
        JButton addButton = new JButton("Thêm khách hàng");
        addButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        addButton.setBackground(new Color(171, 27, 27));
        addButton.setForeground(Color.WHITE);
        addButton.setBounds(24, 125, 1071, 34);
        addButton.addActionListener(e -> addCustomer());
        add(addButton);

        nameField = new JTextField();
        nameField.setBounds(110, 20, 516, 19);
        add(nameField);

        phoneField = new JTextField();
        phoneField.setBounds(111, 52, 515, 19);
        add(phoneField);

        cccdField = new JTextField();
        cccdField.setBounds(752, 51, 341, 22);
        add(cccdField);

        emailField = new JTextField();
        emailField.setBounds(110, 86, 516, 19);
        add(emailField);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 171, 1075, 467);
        add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {  "Họ và Tên", "SĐT", "CCCD", "Email", "Ngày Sinh" }
        ));
        scrollPane.setViewportView(table);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(752, 19, 343, 20);
        add(dateChooser);
        dateChooser.setDateFormatString("dd/MM/yyyy");
    }

    private void loadCustomerData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa tất cả các dòng hiện tại trong bảng

        List<KhachHang> customers = khachHangSP.getAllCustomers();

        for (KhachHang kh : customers) {
            Date ngaySinh = kh.getNgaySinh();
            String ngaySinhFormatted = dateFormat.format(ngaySinh);
            model.addRow(new Object[] {
                kh.getTenKhachHang(),
                kh.getSoDienThoai(),
                kh.getcCCD(),
                kh.getEmail(),
                ngaySinhFormatted 
            });
        }
    }

    private void addCustomer() {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String cccd = cccdField.getText().trim();
        String email = emailField.getText().trim();
        Date birthDate = dateChooser.getDate();
        
//        
//        
        String birthDateFormated = dateFormat.format(birthDate);
        Date currentDate = new Date();

        // Kiểm tra các ràng buộc
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email không được để trống.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!phone.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải có 10 chữ số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!cccd.matches("\\d{12}")) {
            JOptionPane.showMessageDialog(this, "CCCD phải có 12 chữ số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (birthDate == null || birthDate.after(currentDate)) {
            JOptionPane.showMessageDialog(this, "Ngày sinh phải trước ngày hiện tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thêm khách hàng vào bảng
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[] {name,  phone, cccd, email, birthDateFormated });

        JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        // Xóa dữ liệu nhập sau khi thêm thành công
        nameField.setText("");
        phoneField.setText("");
        cccdField.setText("");
        emailField.setText("");
        dateChooser.setDate(null);
    }
}
