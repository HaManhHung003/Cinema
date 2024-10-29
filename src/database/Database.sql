--DATABASE
CREATE DATABASE cinema;
go
use cinema;
go
--DROP DATABASE cinema ; 

--TABLE
CREATE TABLE NhanVien (
    maNhanVien NVARCHAR(50) PRIMARY KEY,
    tenNhanVien NVARCHAR(255),
    soDienThoai NVARCHAR(50),
    chucVu NVARCHAR(50),
    gioiTinh BIT, 
    ngaySinh DATE,
    cCCD NVARCHAR(50),
    email NVARCHAR(50),
    caLamViec NVARCHAR(50)
);


CREATE TABLE KhachHang (
    maKhachHang NVARCHAR(50) PRIMARY KEY,
    tenKhachHang NVARCHAR(255),
    loaiKhachHang NVARCHAR(50),
    soDienThoai NVARCHAR(50),
    cCCD NVARCHAR(50),
    email NVARCHAR(50),
    ngaySinh DATE,
);


CREATE TABLE Phim (
    maPhim NVARCHAR(50) PRIMARY KEY,
    tenPhim NVARCHAR(255),
	thoiLuongPhim TIME,
	moTa NVARCHAR(max)
);


CREATE TABLE LichChieuPhim (
    maLichChieu NVARCHAR(50) PRIMARY KEY,
    maPhim NVARCHAR(50), 
    ngayChieu DATE,
    gioChieu TIME,
    giaVe INT,
    trangThai BIT, 
    FOREIGN KEY (maPhim) REFERENCES Phim(maPhim)
);


CREATE TABLE Phong (
	maPhong NVARCHAR(50) PRIMARY KEY,
    tenPhong NVARCHAR(50)
);


CREATE TABLE MaGiamGia (
    maGiamGia NVARCHAR(50) PRIMARY KEY,
    phanTramGiam INT,
    ngayBatDau DATE,
    ngayKetThuc DATE,
    dieuKienApDung NVARCHAR(255)
);

CREATE TABLE Ghe (
	maGhe NVARCHAR(50) PRIMARY KEY,
    tenGhe NVARCHAR(50),
    loaiGhe NVARCHAR(50),
    viTri NVARCHAR(50),
	giaGhe NVARCHAR(50),
	maPhong NVARCHAR(50),
	trangThai BIT,
	FOREIGN KEY (maPhong) REFERENCES Phong(maPhong)
);


CREATE TABLE HoaDon (
    maHD INT PRIMARY KEY,
    ngayLapHD DATETIME,
    tienNhan FLOAT,
    tienDu FLOAT,
    tongTien FLOAT,
	maPhong NVARCHAR(50),
	maPhim NVARCHAR(50),
	maGhe NVARCHAR (50),
    maKhachHang NVARCHAR(50), 
    maNhanVien NVARCHAR(50), 
	maGiamGia NVARCHAR(50),
    FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang),
    FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien),
	FOREIGN KEY (maPhong) REFERENCES Phong(maPhong),
	FOREIGN KEY (maPhim) REFERENCES Phim(maPhim),
	FOREIGN KEY (maGiamGia) REFERENCES MaGiamGia(maGiamGia),
	FOREIGN KEY (maGhe) REFERENCES Ghe(maGhe)
);


CREATE TABLE ChiTietHoaDon (
    maChiTiet NVARCHAR(50) PRIMARY KEY,
    soLuong INT,
    donGia FLOAT,
    thanhTien FLOAT,
    thue FLOAT,
    donViTinh NVARCHAR(50),
    maHD INT, 
    FOREIGN KEY (maHD) REFERENCES HoaDon(maHD)
);

--add data
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV001',N'Lê Văn Tuấn Nguyên',N'0876823455', N'Nhân viên',1,'2002-02-12',N'075701245672',N'levantuannguyen@gmail.com',N'Sáng');
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV002',N'Ngyễn Hoàng Sơn',N'0987654321', N'Quản lí',1,'2001-01-03',N'067457634523',N'nguyenhoangson@gmail.com',N'Cả ngày');
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV003',N'Nguyễn Đăng Thành An',N'0876984987', N'Nhân viên',1,'2002-07-12',N'081923845561',N'nguyendangthanhan@gmail.com',N'Tối');
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV004',N'Trống Tiểu Băng',N'0966757777', N'Nhân viên',1,'2002-08-21',N'012375681234',N'trongtieubang@gmail.com',N'Sáng');
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV005',N'Đỗ Thị Thu Thảo',N'0298677556', N'Nhân viên',0,'2002-01-23',N'012345667821',N'dothithuthao@gmail.com',N'Chiều');
INSERT INTO NhanVien (maNhanVien, tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES (N'NV006',N'Nguyễn Công Bằng',N'0897223445', N'Nhân viên',1,'2005-02-09',N'096587934245',N'nguyencongbang@gmail.com',N'Sáng');

INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH001',N'Nguyễn Minh Châu',N'Vàng', N'0966757777',N'075701245672','2002-02-12',N'nguyenminhchau@gmail.com');
INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH002',N'Thái Nhật Luân',N'Bạc', N'0298677556',N'012375681234','2001-01-03',N'thainhatluan@gmail.com');
INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH003',N'Hoàng Gia Bảo',N'Bạch Kim', N'0897223445',N'096587934245','2002-07-12',N'hoanggiabao@gmail.com');
INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH004',N'Nguyễn Thành Luân',N'Đồng', N'0876823455',N'067457634523','2002-08-21',N'nguyenthanhluan@gmail.com');
INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH005',N'Đăng Thành Tiến',N'Vàng', N'0987654321',N'081923845561','2002-01-23',N'dangthanhtien@gmail.com');
INSERT INTO KhachHang (maKhachHang, tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES (N'KH006',N'Lê Thành Đạt',N'Vàng', N'0987678892',N'0912837645212','2005-02-09',N'lethanhdat@gmail.com');

INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P001',N'Mộ Đom Đóm',N'Thể loại : Hoạt hình\n\nĐạo diễn : Takahata Isao \n\nThời lượng : 89 phút \n\nMô tả : Hai anh em Seita và Setsuko mất mẹ sau cuộc thả bom dữ dội của \n\nkhông quân Mỹ. 
Cả hai phải vật lộn để tồn tại ở Nhật Bản hậu Thế chiến II. \n\nNhưng xã hội khắc nghiệt và chúng vật lộn tìm kiếm thức ăn cũng như \n\nthoát khỏi những khó khăn giữa chiến tranh.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P002',N'KUMANTHONG',N'Thể loại : Kinh Dị\n\nĐạo diễn : Xian Lim \n\nThời lượng : 101 phút \n\nMô tả : Sau cái chết của con trai, Sarah tìm đến vùng đất tâm linh Thái Lan, khẩn cần một thầy tu 
nổi tiếng sử dụng tro cốt đứa bé để tạo nên bức tượng Kumanthong. Bức tượng làm sống lại tình mẫu tử, nhưng triệu hồi những oan hồn ngạ quỷ đến đoạt xác cả gia đình Sarah.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P003',N'Qủy Ăn Tạng 2',N'Thể loại : Kinh Dị\n\nĐạo diễn : Taweewat Wantha \n\nThời lượng : 120 phút \n\nMô tả : Ba năm sau cái chết của Yam, Yak vẫn tiếp tục săn lùng linh hồn bí ẩn mặc áo choàng đen. 
Gặp một cô gái có triệu chứng giống Yam, Yak phát hiện ra người bảo vệ linh hồn, pháp sư ẩn dật Puang, sống trong một khu rừng đầy nguy hiểm. Giữa những phép thuật ma quỷ và những sinh vật nguy hiểm...');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P004',N'JOKER: FOLIE À DEUX',N'Thể loại : Tâm Lý\n\nĐạo diễn : Todd Phillips \n\nThời lượng : 138 phút \n\nMô tả : Joker: Folie à Deux" đưa Arthur Fleck đến trại tâm thần Arkham trong khi chờ xét xử 
cho những tội ác của hắn với tư cách là Joker. Trong lúc vật lộn với hai bản ngã của mình, Arthur không chỉ tìm thấy tình yêu đích thực mà còn khám phá ra âm nhạc luôn tồn tại trong con người hắn.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P005',N'CÁM ',N'Thể loại : Kinh Dị\n\nĐạo diễn : Trần Hữu Tấn \n\nThời lượng : 122 phút \n\nMô tả : Câu chuyện phim là dị bản kinh dị đẫm máu lấy cảm hứng từ truyện cổ tích nổi tiếng Tấm Cám, nội dung 
chính của phim xoay quanh Cám - em gái cùng cha khác mẹ của Tấm đồng thời sẽ có nhiều nhân vật và chi tiết sáng tạo, gợi cảm giác vừa lạ vừa quen cho khán giả.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P006',N'TRANSFORMERS MỘT',N'Thể loại : Hoạt Hình\n\nĐạo diễn : Josh Cooley \n\nThời lượng : 122 phút \n\nMô tả : Câu chuyện về nguồn gốc chưa từng được hé lộ của Optimus Prime và Megatron. Hai nhân vật 
được biết đến như những kẻ thù truyền kiếp, nhưng cũng từng là những người anh em gắn bó, đã thay đổi vận mệnh của Cybertron mãi mãi.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P007',N'HAI MUỐI',N'Thể loại : Tình Cảm\n\nĐạo diễn : Josh Cooley \n\nThời lượng : 118 phút \n\nMô tả : Muối – một cô gái mất mẹ từ khi vừa lọt lòng và lớn lên trong tình yêu thương của cha tại vùng 
đất xã đảo Thiềng Liềng. Bước ngoặt của hai cha con bắt đầu khi Muối trưởng thành, quyết định lên thành phố học tập và làm việc với ước mơ đổi đời để phụ giúp cha.');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P008',N'LOOK BACK',N'Thể loại : Hoạt Hình\n\nĐạo diễn : Kiyotaka Oshiyama \n\nThời lượng : 58 phút \n\nMô tả : Fujino tự tin thái quá, trong khi Kyomoto lại sống khép kín, cả hai dường như không thể khác biệt hơn, 
nhưng tình yêu mãnh liệt dành cho manga đã trở thành sợi dây duy nhất kết nối họ. Thế nhưng, một ngày nọ, một biến cố đã xảy ra, khiến thế giới của họ hoàn toàn thay đổi…');
INSERT INTO Phim (maPhim, tenPhim,moTa) VALUES (N'P009',N'ROBOT HOANG DÃ',N'Thể loại : Hoạt Hình\n\nĐạo diễn : Chris Sanders \n\nThời lượng : 58 phút \n\nMô tả : Cuộc phiêu lưu hoành tráng theo chân hành trình của một robot — đơn vị ROZZUM 7134, gọi tắt là Roz.
Roz vô tình dạt vào hoang đảo sau một sự cố và nơi đây trở thành địa điểm sống mới của cô. Tại đây, Roz kết thân và nhận nuôi một chú ngỗng con, đặt tên là Brightbill..');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC001',N'P001',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC002',N'P001',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC003',N'P001',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC004',N'P001',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC005',N'P001',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC006',N'P002',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC007',N'P002',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC008',N'P002',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC009',N'P002',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0010',N'P002',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0011',N'P003',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0012',N'P003',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0013',N'P003',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0014',N'P003',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0015',N'P003',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0016',N'P004',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0017',N'P004',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0018',N'P004',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0019',N'P004',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0020',N'P004',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0021',N'P005',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0022',N'P005',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0023',N'P005',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0024',N'P005',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0025',N'P005',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0026',N'P006',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0027',N'P006',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0028',N'P006',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0029',N'P006',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0030',N'P006',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0031',N'P007',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0032',N'P007',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0033',N'P007',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0034',N'P007',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0035',N'P007',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0036',N'P008',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0037',N'P008',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0038',N'P008',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0039',N'P008',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0040',N'P008',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0041',N'P009',N'2024-10-07', N'10:45:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0042',N'P009',N'2024-10-07', N'13:15:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0043',N'P009',N'2024-10-07', N'17:20:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0044',N'P009',N'2024-10-07', N'19:25:00',N'78000','1');
INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES (N'LC0045',N'P009',N'2024-10-07', N'22:10:00',N'78000','1');

INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P01',N'Rap01');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P02',N'Rap02');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P03',N'Rap03');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P04',N'Rap04');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P05',N'Rap05');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P06',N'Rap06');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P07',N'Rap07');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P08',N'Rap08');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P09',N'Rap09');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P010',N'Rap10');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P011',N'Rap11');
INSERT INTO Phong (maPhong,tenPhong) VALUES (N'P012',N'Rap12');

INSERT INTO MaGiamGia (maGiamGia, phanTramGiam, ngayBatDau,ngayKetThuc,dieuKienApDung) VALUES (N'MGG01',N'25',N'2024-10-07', N'2029-10-07',N'Tuoi < 22');
INSERT INTO MaGiamGia (maGiamGia, phanTramGiam, ngayBatDau,ngayKetThuc,dieuKienApDung) VALUES (N'MGG02',N'10',N'2024-10-07', N'2024-11-20',N'Mang theo the sinh vien');
INSERT INTO MaGiamGia (maGiamGia, phanTramGiam, ngayBatDau,ngayKetThuc,dieuKienApDung) VALUES (N'MGG03',N'50',N'2024-10-07', N'2024-10-12',N'Hang thanh vien > Bach Kim');


INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A01', N'A01', N'Đơn', N'A01');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A02', N'A02', N'Đơn', N'A02');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A03', N'A03', N'Đơn', N'A03');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A04', N'A04', N'Đơn', N'A04');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A05', N'A05', N'Đơn', N'A05');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A06', N'A06', N'Đơn', N'A06');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A07', N'A07', N'Đơn', N'A07');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A08', N'A08', N'Đơn', N'A08');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A09', N'A09', N'Đơn', N'A09');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A10', N'A10', N'Đơn', N'A10');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'A11', N'A11', N'Đơn', N'A11');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B01', N'B01', N'Đơn', N'B01');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B02', N'B02', N'Đơn', N'B02');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B03', N'B03', N'Đơn', N'B03');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B04', N'B04', N'Đơn', N'B04');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B05', N'B05', N'Đơn', N'B05');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B06', N'B06', N'Đơn', N'B06');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B07', N'B07', N'Đơn', N'B07');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B08', N'B08', N'Đơn', N'B08');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B09', N'B09', N'Đơn', N'B09');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B010', N'B010', N'Đơn', N'B010');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'B011', N'B011', N'Đơn', N'B011');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C01', N'C01', N'Đơn', N'C01');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C02', N'C02', N'Đơn', N'C02');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C03', N'C03', N'Đơn', N'C03');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C04', N'C04', N'Đơn', N'C04');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C05', N'C05', N'Đơn', N'C05');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C06', N'C06', N'Đơn', N'C06');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C07', N'C07', N'Đơn', N'C07');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C08', N'C08', N'Đơn', N'C08');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C09', N'C09', N'Đơn', N'C09');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C010', N'C010', N'Đơn', N'C010');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'C011', N'C011', N'Đơn', N'C011');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D01', N'D01', N'Đơn', N'D01');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D02', N'D02', N'Đơn', N'D02');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D03', N'D03', N'Đơn', N'D03');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D04', N'D04', N'Đơn', N'D04');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D05', N'D05', N'Đơn', N'D05');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D06', N'D06', N'Đơn', N'D06');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D07', N'D07', N'Đơn', N'D07');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D08', N'D08', N'Đơn', N'D08');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D09', N'D09', N'Đơn', N'D09');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D010', N'D010', N'Đơn', N'D010');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'D011', N'D011', N'Đơn', N'D011');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E01', N'E01', N'Đơn', N'E01');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E02', N'E02', N'Đơn', N'E02');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E03', N'E03', N'Đơn', N'E03');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E04', N'E04', N'Đơn', N'E04');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E05', N'E05', N'Đơn', N'E05');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E06', N'E06', N'Đơn', N'E06');
INSERT INTO Ghe (maGhe, tenGhe, loaiGhe, viTri) VALUES (N'E07', N'E07', N'Đơn', N'E07');

