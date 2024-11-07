package entity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import dao.ChiTietHoaDonDao;
import storedProcedure.KhachHangStoredProcedure;

public class HoaDon {
    private String maHD;
	private LocalDateTime ngayLapHD;
	private double tienNhan;
	private double tienDu;
	private double tongTien;
	private Phong phong;
	private Phim phim;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private MaGiamGia maGiamGia;
	private String IDKH;
	private String IDNV;
	private ChiTietHoaDon chiTiet;
	private KhachHangStoredProcedure khachHangStoredProcedure = new KhachHangStoredProcedure();
	private ChiTietHoaDonDao chiTietHoaDon_DAO = new ChiTietHoaDonDao();

//	@Override
//	public String toString() {
//		return "HoaDon [maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", tienNhan=" + tienNhan + ", tienDu=" + tienDu
//				+ ", tongTien=" + tongTien + ", phong=" + phong + ", phim=" + phim + ", khachHang=" + khachHang
//				+ ", nhanVien=" + nhanVien + ", maGiamGia=" + maGiamGia + ", IDKH=" + IDKH + ", IDNV=" + IDNV
//				+ ", timeFormater=" + timeFormater + ", formatter=" + formatter + "]";
//	}

	public String getMaHD() {
		return maHD;
	}

	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", tienNhan=" + tienNhan + ", tienDu=" + tienDu
				+ ", tongTien=" + tongTien + ", phong=" + phong + ", phim=" + phim + ", khachHang=" + khachHang
				+ ", nhanVien=" + nhanVien + ", maGiamGia=" + maGiamGia + ", IDKH=" + IDKH + ", IDNV=" + IDNV
				+ ", chiTiet=" + chiTiet + ", khachHangStoredProcedure=" + khachHangStoredProcedure
				+ ", chiTietHoaDon_DAO=" + chiTietHoaDon_DAO + "]";
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public LocalDateTime getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(LocalDateTime ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public double getTienNhan() {
		return tienNhan;
	}

	public void setTienNhan(double tienNhan) {
		this.tienNhan = tienNhan;
	}

	public double getTienDu() {
		return tienDu;
	}

	public void setTienDu(double tienDu) {
		this.tienDu = tienDu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MaGiamGia getMaGiamGia() {
		return maGiamGia;
	}

	public void setMaGiamGia(MaGiamGia maGiamGia) {
		this.maGiamGia = maGiamGia;
	}

	public String getIDKH() {
		return IDKH;
	}

	public void setIDKH(String iDKH) {
		IDKH = iDKH;
	}

	public String getIDNV() {
		return IDNV;
	}

	public void setIDNV(String iDNV) {
		IDNV = iDNV;
	}

//	public DateTimeFormatter getTimeFormater() {
//		return timeFormater;
//	}
//
//	public void setTimeFormater(DateTimeFormatter timeFormater) {
//		this.timeFormater = timeFormater;
//	}
//
//	public DateTimeFormatter getFormatter() {
//		return formatter;
//	}
//
//	public void setFormatter(DateTimeFormatter formatter) {
//		this.formatter = formatter;
//	}

	public HoaDon(String maHD, LocalDateTime ngayLapHD, double tienNhan, double tienDu, double tongTien, Phong phong,
			Phim phim, KhachHang khachHang, NhanVien nhanVien, MaGiamGia maGiamGia, String iDKH, String iDNV,
			DateTimeFormatter timeFormater, DateTimeFormatter formatter) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.tienNhan = tienNhan;
		this.tienDu = tienDu;
		this.tongTien = tongTien;
		this.phong = phong;
		this.phim = phim;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.maGiamGia = maGiamGia;
		IDKH = iDKH;
		IDNV = iDNV;
//		this.timeFormater = timeFormater;
//		this.formatter = formatter;
	}

//	public HoaDon(String maHD) {
//		super();
//		this.maHD = maHD;
//	}

	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

//	DateTimeFormatter timeFormater = DateTimeFormatter.ofPattern("HH:mm");
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//	
//	public void xuatHoaDon(String pdfPath) {
//		try {
//			// Tạo file PDF
//			PdfWriter writer = new PdfWriter(new FileOutputStream(pdfPath));
//			PdfDocument pdfDoc = new PdfDocument(writer);
//			Document document = new Document(pdfDoc);
//
//			document.setMargins(10, 40, 30, 10);
//
//			// Tải font Unicode hỗ trợ tiếng Việt
//			String fontPathRegular = "font/TIMES.TTF"; // Đường dẫn đến font thường
//			String fontPathBold = "font/TIMESBD.TTF"; // Đường dẫn đến font in đậm
//			String fontPathItalic = "font/TIMESI.TTF"; // Đường dẫn đến font in nghiêng
//
//			PdfFont fontRegular = PdfFontFactory.createFont(fontPathRegular, PdfEncodings.IDENTITY_H, true);
//			PdfFont fontBold = PdfFontFactory.createFont(fontPathBold, PdfEncodings.IDENTITY_H, true);
//			PdfFont fontItalic = PdfFontFactory.createFont(fontPathItalic, PdfEncodings.IDENTITY_H, true);
//
//			// Thêm hình ảnh vào đầu tài liệu
//			String imagePath = getClass().getResource("/img/LogoDepHonDen.png").getPath(); // Đường dẫn đến hình ảnh
//			Image img = new Image(ImageDataFactory.create(imagePath));
//			img.setWidth(120); // Đặt chiều rộng cho hình ảnh
//
//			// Thêm thông tin khách hàng và địa chỉ
//			UnitValue[] columnWidths = { UnitValue.createPercentValue(3), UnitValue.createPercentValue(5),
//					UnitValue.createPercentValue(3) };
//
//			// Tạo bảng tiêu đề chiếm toàn bộ chiều rộng của trang
//			Table headerTable = new Table(columnWidths);
//			headerTable.setWidth(580); // Chiều rộng cụ thể của bảng tiêu đề
//
//			// Thêm các ô vào bảng mà không có border
//			headerTable.addCell(new Cell(2, 1).add(img).setBorder(Border.NO_BORDER));
//			headerTable.addCell(new Cell(1, 1).add(
//					new Paragraph("HÓA ĐƠN").setFont(fontBold).setFontSize(20).setTextAlignment(TextAlignment.CENTER))
//					.setBorder(Border.NO_BORDER));
//			Paragraph thongTinHoaDon = new Paragraph().add(new Text("Mã Hóa Đơn: ").setFont(fontBold).setFontSize(10))
//					.add(new Text(maHD).setFont(fontRegular).setFontSize(10))
//					.add(new Text("\nNgày lập: ").setFont(fontBold).setFontSize(10))
//					.add(new Text(ngayLapHD.format(formatter)).setFont(fontRegular).setFontSize(10))
//					.add(new Text("\nThời gian lập: ").setFont(fontBold).setFontSize(10))
//					.add(new Text(ngayLapHD.format(timeFormater)).setFont(fontRegular).setFontSize(10));
//			headerTable.addCell(new Cell(2, 1).add(thongTinHoaDon).setBorder(Border.NO_BORDER));
//			headerTable
//					.addCell(new Cell(1, 1)
//							.add(new Paragraph("Ngày " + ngayLapHD.getDayOfMonth() + ", tháng "
//									+ ngayLapHD.getMonthValue() + ", năm " + ngayLapHD.getYear())
//									.setFont(fontRegular).setTextAlignment(TextAlignment.CENTER))
//							.setBorder(Border.NO_BORDER));
//
//			// Thêm bảng vào tài liệu
//			document.add(headerTable);
//
//			// Thêm thông tin khách hàng và địa chỉ
//			UnitValue[] columnWidths1 = { UnitValue.createPercentValue(20), UnitValue.createPercentValue(30),
//					UnitValue.createPercentValue(20), UnitValue.createPercentValue(30) };
//
//			Table tableKH = new Table(columnWidths1);
//			tableKH.setWidth(580);
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Đơn vị bán vé: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Rạp phim H2N").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Điện thoại: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(
//					new Cell().add(new Paragraph("0123456789").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Mã nhân viên: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(new Cell(1, 3).add(new Paragraph(nhanVien.getMaNhanVien()).setFont(fontRegular))
//					.setBorder(Border.NO_BORDER));
//
//			KhachHang khachHangNew = khachHangStoredProcedure.getKhachHangTheoMaKH(khachHang.getMaKhachHang());
//					
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Mã khách hàng: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(new Cell().add(new Paragraph(khachHangNew.getMaKhachHang()).setFont(fontRegular))
//					.setBorder(Border.NO_BORDER));
//			tableKH.addCell(
//					new Cell().add(new Paragraph("Tên khách hàng: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(new Cell().add(new Paragraph(khachHangNew.getTenKhachHang())).setFont(fontRegular))
//					.setBorder(Border.NO_BORDER);
//			tableKH.addCell(
//					new Cell().add(new Paragraph("SĐT khách hàng: ").setFont(fontRegular)).setBorder(Border.NO_BORDER));
//			tableKH.addCell(new Cell(1, 3).add(new Paragraph(khachHangNew.getSoDienThoai()).setFont(fontRegular))
//					.setBorder(Border.NO_BORDER));
//
//			document.add(tableKH);
//
//			Table table = new Table(7);
//			table.setWidth(580);
//
//			// Tiêu đề
//			table.addCell(new Cell().add(
//					new Paragraph("STT").setFont(fontBold).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("Mã vé").setFont(fontBold).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("Thông tin vé").setFont(fontBold).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("Giá gốc\n(VND)").setFont(fontBold).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("Đối tượng").setFont(fontBold).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("Khuyến mãi\n(VND)").setFont(fontBold).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("Thành tiền chưa thuế\n(VND)").setFont(fontBold).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//
//			// Cách tính
//			table.addCell(new Cell().add(
//					new Paragraph("a").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("b").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("c").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("d").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("e").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(
//					new Paragraph("e → f").setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("g = d - f").setFont(fontRegular).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//
//			// Thêm các dòng trong bảng
//			ChiTietHoaDon chiTietNew = chiTietHoaDon_DAO.getCTHDTheoMaChiTiet(chiTiet.getMaChiTiet());
//			int tongGiaGoc = 0;
//			int tongKhuyenMai = 0;
//			int count = 1;
//			for (Ve i : chiTietNew.getDsVe()) {
//				Ve ve = ve_DAO.getVeTheoMaVe(i.getMaVe());
//				// STT
//				table.addCell(new Cell().add(new Paragraph(String.valueOf(count++)).setFont(fontRegular).setFontSize(10)
//						.setTextAlignment(TextAlignment.CENTER)));
//
//				// Mã vé
//				table.addCell(new Cell().add(new Paragraph(ve.getMaVe()).setFont(fontRegular).setFontSize(10)
//						.setTextAlignment(TextAlignment.CENTER)));
//
//				// Thông tin vé
//				String thongTinVe = "Từ " + ga_DAO.getGaTheoMaGa(ve.getGaDi().getMaGa()).getTenGa() + " đến "
//						+ ga_DAO.getGaTheoMaGa(ve.getGaDen().getMaGa()).getTenGa() + "\nNgày: "
//						+ ve.getNgayDi().format(formatter) + "   Lúc: " + ve.getGioDi().toString();
//				if (ve.getHang().equalsIgnoreCase("VIP")) {
//					thongTinVe = thongTinVe + "\nHạng VIP Toa "
//							+ ve.getToa().getMaToa().substring(ve.getToa().getMaToa().length() - 2) + " Ghế số "
//							+ ve.getSoGhe().getSoGhe();
//				} else if (ve.getHang().equalsIgnoreCase("Giường nằm")) {
//					thongTinVe = thongTinVe + "\nGiường nằm Toa "
//							+ ve.getToa().getMaToa().substring(ve.getToa().getMaToa().length() - 2) + " Ghế số "
//							+ ve.getSoGhe().getSoGhe();
//				} else {
//					thongTinVe = thongTinVe + "\nGhế mềm Toa "
//							+ ve.getToa().getMaToa().substring(ve.getToa().getMaToa().length() - 2) + " Ghế số "
//							+ ve.getSoGhe().getSoGhe();
//				}
//				table.addCell(new Cell().add(new Paragraph(thongTinVe).setFont(fontRegular).setFontSize(10)));
//
//				// Giá gốc
//				float giaGoc = ve.tinhGiaVeGoc();
//				table.addCell(new Cell().add(new Paragraph(df.format(giaGoc)).setFont(fontRegular).setFontSize(10)
//						.setTextAlignment(TextAlignment.CENTER)));
//
//				// Đối tượng
//				table.addCell(new Cell().add(new Paragraph(ve.getKhuyenMai()).setFont(fontRegular).setFontSize(10)));
//
//				// Khuyến mãi
//				float khuyenMai;
//				if (ve.getKhuyenMai().equalsIgnoreCase("Sinh viên"))
//					khuyenMai = giaGoc * 0.1f;
//				table.addCell(new Cell().add(new Paragraph(df.format(khuyenMai)).setFont(fontRegular).setFontSize(10)
//						.setTextAlignment(TextAlignment.CENTER)));
//
//				
//
//				tongGiaGoc += giaGoc;
//				tongKhuyenMai += khuyenMai;
//			}
//
//			// Thêm tổng cộng
//			table.addCell(new Cell(1, 2).add(new Paragraph("Tổng cộng (VND):").setFont(fontBold).setFontSize(10)));
//			table.addCell(new Cell().add(new Paragraph("").setFont(fontRegular)));
//			table.addCell(new Cell().add(new Paragraph(df.format(tongGiaGoc)).setFont(fontRegular).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//			table.addCell(new Cell().add(new Paragraph("").setFont(fontRegular)));
//			table.addCell(new Cell().add(new Paragraph(df.format(tongKhuyenMai)).setFont(fontRegular).setFontSize(10)
//					.setTextAlignment(TextAlignment.CENTER)));
//;
//
//
//			table.addCell(new Cell(1, 2).add(new Paragraph("Tổng tiền bằng số: ").setFont(fontBold).setFontSize(10)));
//
//			table.addCell(new Cell(1, 2).add(new Paragraph("Tổng tiền bằng chữ: ").setFont(fontBold).setFontSize(10)));
//
//
//			// Thêm ghi chú
//			table.addCell(new Cell(1, 7).add(new Paragraph(
//					"\nGhi chú:......................................................................................................................................................................................................................."))
//					.setFont(fontRegular).setFontSize(10).setTextAlignment(TextAlignment.CENTER)
//					.setBorder(Border.NO_BORDER));
//
//			document.add(table);
//
//			// Thêm phần ký tên
//			Table tableKyTen = new Table(2);
//			tableKyTen.setWidth(580);
//			tableKyTen.addCell(
//					new Cell().add(new Paragraph("Khách hàng").setFont(fontBold).setTextAlignment(TextAlignment.CENTER))
//							.setBorder(Border.NO_BORDER));
//			tableKyTen.addCell(new Cell()
//					.add(new Paragraph("Người bán hàng").setFont(fontBold).setTextAlignment(TextAlignment.CENTER))
//					.setBorder(Border.NO_BORDER));
//			tableKyTen.addCell(new Cell().add(
//					new Paragraph("(Ký, ghi rõ họ tên)").setFont(fontItalic).setTextAlignment(TextAlignment.CENTER))
//					.setBorder(Border.NO_BORDER));
//			tableKyTen.addCell(new Cell().add(
//					new Paragraph("(Ký, ghi rõ họ tên)").setFont(fontItalic).setTextAlignment(TextAlignment.CENTER))
//					.setBorder(Border.NO_BORDER));
//
//			document.add(tableKyTen);
//
//			document.add(new Paragraph("\n\n\n\n\n"));
//
//			document.add(new Paragraph("*Kiểm tra đối chiếu ký trước khi nhận hóa đơn").setFont(fontItalic)
//					.setFontSize(10).setTextAlignment(TextAlignment.LEFT));
//
//			// Đóng tài liệu
//			document.close();
//			System.out.println("Đã tạo hóa đơn và lưu vào file PDF: " + pdfPath);
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	// Hàm chính để chuyển đổi số sang chữ
//	public static String convertToWords(long soTien) {
//		if (soTien == 0) {
//			return "không đồng";
//		}
//
//		StringBuilder result = new StringBuilder();
//		int donViIndex = 0;
//
//		while (soTien > 0) {
//			int group = (int) (soTien % 1000); // Nhóm ba chữ số
//			if (group > 0) {
//				String groupText = convertThreeDigitNumber(group);
//				result.insert(0, groupText + " " + DON_VI[donViIndex] + " ");
//			}
//			soTien /= 1000;
//			donViIndex++;
//		}
//
//		result.append("đồng");
//		return result.toString().trim().replaceAll("\\s+", " ");
//	}
//
//	// Hàm chuyển đổi một nhóm ba chữ số thành chữ
//	private static String convertThreeDigitNumber(int number) {
//		StringBuilder groupText = new StringBuilder();
//
//		int tram = number / 100;
//		int chuc = (number % 100) / 10;
//		int donVi = number % 10;
//
//		if (tram > 0) {
//			groupText.append(CHU_SO[tram]).append(" trăm ");
//			if (chuc == 0 && donVi > 0) {
//				groupText.append("lẻ ");
//			}
//		}
//
//		if (chuc > 1) {
//			groupText.append(CHU_SO[chuc]).append(" mươi ");
//			if (donVi == 1) {
//				groupText.append("mốt");
//			} else if (donVi == 5) {
//				groupText.append("lăm");
//			} else if (donVi > 0) {
//				groupText.append(CHU_SO[donVi]);
//			}
//		} else if (chuc == 1) {
//			groupText.append("mười ");
//			if (donVi == 1) {
//				groupText.append("một");
//			} else if (donVi == 5) {
//				groupText.append("lăm");
//			} else if (donVi > 0) {
//				groupText.append(CHU_SO[donVi]);
//			}
//		} else if (donVi > 0) {
//			groupText.append(CHU_SO[donVi]);
//		}
//
//		return groupText.toString().trim();
//	}
//	
	
	
}

