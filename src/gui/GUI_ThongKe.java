package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;

public class GUI_ThongKe extends JPanel {
	private JPanel jp_tkdttheoca;

	public GUI_ThongKe() {
		setBackground(new Color(36,34,34));
		setLayout(null);
		setSize(928,720);
		
		JLabel lblNewLabel_1 = new JLabel("DOANH THU DOANH THU");
		lblNewLabel_1.setForeground(new Color(243, 130, 54));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(33, 10, 368, 35);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Ca:");
		lblNewLabel.setForeground(new Color(243, 130, 54));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(32, 66, 43, 30);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Sáng");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(67, 69, 100, 24);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Doanh thu:");
		lblNewLabel_3.setForeground(new Color(243, 130, 54));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(177, 66, 108, 30);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Số vé bán ra:");
		lblNewLabel_4.setForeground(new Color(243, 130, 54));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(466, 69, 140, 24);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("52.000.520 VNĐ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(293, 69, 147, 24);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("257");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(597, 75, 67, 13);
		add(lblNewLabel_6);
		//JPane chứa thống kê theo ca
				JPanel jp_thongKeTheoCa = new JPanel();
				jp_thongKeTheoCa.setBounds(28, 133, 1055, 513);
				add(jp_thongKeTheoCa);
				
				//JFreeChat thống kê theo loại vé
				//Khởi tạo dữ liệu
				DefaultCategoryDataset datasetTheoCa = createDataset();
				// Create chart
				JFreeChart chartTheoCa = ChartFactory.createBarChart(
						"DOANH THU THEO CA",
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
		// Add data to the dataset
		dataset.addValue(9000000, "Doanh thu", "Mộ đom đóm");
		dataset.addValue(4000000, "Doanh thu", "Kumathong");
		dataset.addValue(6000000, "Doanh thu", "Transformer");
		dataset.addValue(2000000, "Doanh thu", "Joker");
		dataset.addValue(9000000, "Doanh thu", "Cám");
		dataset.addValue(4000000, "Doanh thu", "Qủy ăn tạng");

		return dataset;
	}

}