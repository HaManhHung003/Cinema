package gui;

import java.awt.Font;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import dao.HoaDonDao;

import java.awt.Color;

public class GUI_ThongKe extends JPanel {
	private HoaDonDao hdDao;
	private JPanel jp_tkdttheoca;

	public GUI_ThongKe() {
		hdDao = new HoaDonDao();
		setBackground(new Color(36,34,34));
		setLayout(null);
		setSize(928,720);
		
		JLabel lblDoanhThuPhim = new JLabel("DOANH THU PHIM THEO THÁNG");
		lblDoanhThuPhim.setForeground(new Color(243, 130, 54));
		lblDoanhThuPhim.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDoanhThuPhim.setBounds(33, 10, 517, 35);
		add(lblDoanhThuPhim);
		
		JLabel lblDT = new JLabel("Doanh thu cả năm:");
		lblDT.setForeground(new Color(243, 130, 54));
		lblDT.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDT.setBounds(33, 66, 192, 30);
		add(lblDT);
		
//		JLabel lblSoVeBanRa = new JLabel("Số vé bán ra:");
//		lblSoVeBanRa.setForeground(new Color(243, 130, 54));
//		lblSoVeBanRa.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblSoVeBanRa.setBounds(308, 69, 140, 24);
//		add(lblSoVeBanRa);
		
		JLabel lblXuatDT = new JLabel("52.000.520 VNĐ");
		
		double doanhThu = hdDao.getTongDoanhThu();
		lblXuatDT.setText(Double.toString(doanhThu));
		
		lblXuatDT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblXuatDT.setForeground(new Color(255, 255, 255));
		lblXuatDT.setBounds(223, 69, 147, 24);
		add(lblXuatDT);
		
//		JLabel lblVeXuat = new JLabel("257");
//		lblVeXuat.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblVeXuat.setForeground(new Color(255, 255, 255));
//		lblVeXuat.setBounds(458, 75, 67, 13);
//		add(lblVeXuat);
		//JPane chứa thống kê theo ca
				JPanel jp_thongKeTheoCa = new JPanel();
				jp_thongKeTheoCa.setBounds(28, 133, 1055, 513);
				add(jp_thongKeTheoCa);
				
				//JFreeChat thống kê theo loại vé
				//Khởi tạo dữ liệu
				DefaultCategoryDataset datasetTheoCa = createDataset();
				// Create chart
				JFreeChart chartTheoCa = ChartFactory.createBarChart(
						"DOANH THU THEO THÁNG",
						"Phim",
						"Doanh thu",
						datasetTheoCa
						);

				// Giảm kích cỡ chữ cho tiêu đề
				chartTheoCa.getTitle().setFont(new Font("Arial", Font.PLAIN, 16));
				// Tạo ChartPanel và thiết lập kích thước
				ChartPanel chartPanelTheoCa = new ChartPanel(chartTheoCa);
				jp_thongKeTheoCa.setLayout(null);
				chartPanelTheoCa.setBounds(0, 0, 1055, 509);
				// Thêm ChartPanel vào jp_thongKe
				jp_thongKeTheoCa.add(chartPanelTheoCa);
				
	}
	private DefaultCategoryDataset createDatasetTheoCa() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		return dataset;
		
	}

	//Hàm truy vấn dữ liệu theo loại
	private DefaultCategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
	
		Map<Integer, Double> map = hdDao.thongKeDoanhTungThangTheoNam(2024);
		// Add data to the dataset
		
		for (Map.Entry<Integer, Double> entry : map.entrySet()) {
		    Integer thang = entry.getKey();    // Lấy ra khóa (tháng)
		    Double doanhThu = entry.getValue(); // Lấy ra giá trị (doanh thu)

		    dataset.addValue((double)doanhThu, "Doanh thu", thang.toString());
		    System.out.println("tesstst");
//		    dataset.addValue(9000000, "Doanh thu", "Mộ đom đóm");
		}
		
//			dataset.addValue(9000000, "Doanh thu", "Mộ đom đóm");
//			dataset.addValue(4000000, "Doanh thu", "Kumathong");
//			dataset.addValue(6000000, "Doanh thu", "Transformer");
//			dataset.addValue(2000000, "Doanh thu", "Joker");
//			dataset.addValue(9000000, "Doanh thu", "Cám");
//			dataset.addValue(4000000, "Doanh thu", "Qủy ăn tạng");
	
			
		
		
		return dataset;
	}
	
//	public static void main(String[] args) {
//		HoaDonDao hdDao = new HoaDonDao();
//		Map<Integer, Double> map = hdDao.thongKeDoanhTungThangTheoNam(2024);
//		System.out.println(map);
//	}
		
}