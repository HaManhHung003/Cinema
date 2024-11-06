﻿--DATABASE
CREATE DATABASE cinema;
go
use cinema;
go
--DROP DATABASE cinema ; 

--TABLE
CREATE TABLE NhanVien (
	IDNV INT IDENTITY(1,1) NOT NULL PRIMARY KEY CLUSTERED,
	maNhanVien AS 'NV' + RIGHT('0' + CAST(IDNV AS VARCHAR(1)), 1) PERSISTED,
    tenNhanVien NVARCHAR(255),
    soDienThoai NVARCHAR(50),
    chucVu NVARCHAR(50),
    gioiTinh BIT, 
    ngaySinh DATE,
    cCCD NVARCHAR(50),
    email NVARCHAR(50),
    caLamViec NVARCHAR(50),
	taiKhoan AS 'NVAcc' + RIGHT('00' + CAST(IDNV AS VARCHAR(2)), 2) PERSISTED,
	matKhau AS 'NVPass' + RIGHT('000' + CAST(IDNV AS VARCHAR(3)), 3) PERSISTED
);


CREATE TABLE KhachHang (
	IDKH INT IDENTITY(1,1) NOT NULL PRIMARY KEY CLUSTERED,
	maKhachHang AS 'KH' + RIGHT('0' + CAST(IDKH AS VARCHAR(1)), 1) PERSISTED,
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
	thoiLuong int,
	theLoai NVARCHAR(50),
	daoDien NVARCHAR(50),
	moTa NVARCHAR(max),
	hinhAnh NVARCHAR(max)
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
    soTienGiam FLOAT,
    ngayBatDau DATE,
    ngayKetThuc DATE,
    dieuKienApDung NVARCHAR(255)
);

CREATE TABLE Ghe (
	maGhe NVARCHAR(50) PRIMARY KEY,
    loaiGhe NVARCHAR(50),
	viTri NVARCHAR(50),
	giaGhe FLOAT,
	maPhong NVARCHAR(50),
	trangThai BIT,
	FOREIGN KEY (maPhong) REFERENCES Phong(maPhong)
);




CREATE TABLE HoaDon (
    maHD NVARCHAR(50) PRIMARY KEY,
    ngayLapHD DATETIME,
    tienNhan FLOAT,
    tienDu FLOAT,
    tongTien FLOAT,
	maPhong NVARCHAR(50),
	maPhim NVARCHAR(50),
	maGhe NVARCHAR (50),
    IDKH INT, 
    IDNV INT, 
	maGiamGia NVARCHAR(50),
    FOREIGN KEY (IDKH) REFERENCES KhachHang(IDKH),
    FOREIGN KEY (IDNV) REFERENCES NhanVien(IDNV),
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
    maHD NVARCHAR(50), 
    FOREIGN KEY (maHD) REFERENCES HoaDon(maHD)
);

--add data
INSERT INTO NhanVien (tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES 
(N'Lê Văn Tuấn Nguyên',N'0876823455', N'Nhân viên',1,'2002-02-12',N'075701245672',N'levantuannguyen@gmail.com',N'Sáng'),
(N'Ngyễn Hoàng Sơn',N'0987654321', N'Quản lí',1,'2001-01-03',N'067457634523',N'nguyenhoangson@gmail.com',N'Cả ngày'),
(N'Nguyễn Đăng Thành An',N'0876984987', N'Nhân viên',1,'2002-07-12',N'081923845561',N'nguyendangthanhan@gmail.com',N'Tối'),
(N'Trống Tiểu Băng',N'0966757777', N'Nhân viên',1,'2002-08-21',N'012375681234',N'trongtieubang@gmail.com',N'Sáng'),
(N'Đỗ Thị Thu Thảo',N'0298677556', N'Nhân viên',0,'2002-01-23',N'012345667821',N'dothithuthao@gmail.com',N'Chiều'),
(N'Nguyễn Công Bằng',N'0897223445', N'Nhân viên',1,'2005-02-09',N'096587934245',N'nguyencongbang@gmail.com',N'Sáng');

INSERT INTO KhachHang (tenKhachHang, loaiKhachHang,soDienThoai,cCCD,ngaySinh,email) VALUES 
(N'Nguyễn Minh Châu',N'Vàng', N'0966757777',N'075701245672','2002-02-12',N'nguyenminhchau@gmail.com'),
(N'Thái Nhật Luân',N'Bạc', N'0298677556',N'012375681234','2001-01-03',N'thainhatluan@gmail.com'),
(N'Hoàng Gia Bảo',N'Bạch Kim', N'0897223445',N'096587934245','2002-07-12',N'hoanggiabao@gmail.com'),
(N'Nguyễn Thành Luân',N'Đồng', N'0876823455',N'067457634523','2002-08-21',N'nguyenthanhluan@gmail.com'),
(N'Đăng Thành Tiến',N'Vàng', N'0987654321',N'081923845561','2002-01-23',N'dangthanhtien@gmail.com'),
(N'Lê Thành Đạt',N'Vàng', N'0987678892',N'0912837645212','2005-02-09',N'lethanhdat@gmail.com');

INSERT INTO Phim (maPhim, tenPhim,thoiLuongPhim,thoiLuong,theLoai,daoDien,moTa,hinhAnh) VALUES 
(N'P01',	N'Mộ Đom Đóm',				'01:29:00',	89,		N'Hoạt hình',	N'Takahata Isao',		N'Hai anh em Seita và Setsuko mất mẹ sau cuộc thả bom dữ dội của \n\nkhông quân Mỹ. Cả hai phải vật lộn để tồn tại ở Nhật Bản hậu Thế chiến II. \n\nNhưng xã hội khắc nghiệt và chúng vật lộn tìm kiếm thức ăn cũng như \n\nthoát khỏi những khó khăn giữa chiến tranh.',N'src\\resources\\Image\\banner\\modomdom.jpg'),
(N'P02',	N'KUMANTHONG',				'02:01:00',	121,	N'Kinh dị',		N'Xian Lim',			N'Sau cái chết của con trai, Sarah tìm đến vùng đất tâm linh Thái Lan, khẩn cần một thầy tu nổi tiếng sử dụng tro cốt đứa bé để tạo nên bức tượng Kumanthong. Bức tượng làm sống lại tình mẫu tử, nhưng triệu hồi những oan hồn ngạ quỷ đến đoạt xác cả gia đình Sarah.',N'src\\resources\\Image\\banner\\kumathong.jpg'),
(N'P03',	N'Qủy Ăn Tạng 2',			'02:23:00',	143,	N'Kinh dị',		N'Taweewat Wantha',		N'Ba năm sau cái chết của Yam, Yak vẫn tiếp tục săn lùng linh hồn bí ẩn mặc áo choàng đen. Gặp một cô gái có triệu chứng giống Yam, Yak phát hiện ra người bảo vệ linh hồn, pháp sư ẩn dật Puang, sống trong một khu rừng đầy nguy hiểm. Giữa những phép thuật ma quỷ và những sinh vật nguy hiểm...',N'src\\resources\\Image\\banner\\quyantang2.jpg'),
(N'P04',	N'JOKER: FOLIE À DEUX',		'02:03:00',	123,	N'Tâm lý',		N'Todd Phillips',		N'Joker: Folie à Deux" đưa Arthur Fleck đến trại tâm thần Arkham trong khi chờ xét xử cho những tội ác của hắn với tư cách là Joker. Trong lúc vật lộn với hai bản ngã của mình, Arthur không chỉ tìm thấy tình yêu đích thực mà còn khám phá ra âm nhạc luôn tồn tại trong con người hắn.',N'src\\resources\\Image\\banner\\joker.jpg'),
(N'P05',	N'CÁM - CHUYỆN CHƯA KỂ ',	'01:41:00',	111,	N'Kinh dị',		N'Trần Hữu Tấn',		N'Câu chuyện phim là dị bản kinh dị đẫm máu lấy cảm hứng từ truyện cổ tích nổi tiếng Tấm Cám, nội dung chính của phim xoay quanh Cám - em gái cùng cha khác mẹ của Tấm đồng thời sẽ có nhiều nhân vật và chi tiết sáng tạo, gợi cảm giác vừa lạ vừa quen cho khán giả.',N'src\\resources\\Image\\banner\\cam.jpg'),
(N'P06',	N'TRANSFORMERS MỘT',		'01:53:00',	113,	N'Hoạt hình',	N'Josh Cooley',			N'Câu chuyện về nguồn gốc chưa từng được hé lộ của Optimus Prime và Megatron. Hai nhân vật được biết đến như những kẻ thù truyền kiếp, nhưng cũng từng là những người anh em gắn bó, đã thay đổi vận mệnh của Cybertron mãi mãi.',N'src\\resources\\Image\\banner\\transformer.jpg'),
(N'P07',	N'HAI MUỐI',				'01:58:00',	118,	N'Tình cảm',	N'Josh Cooley',			N'Muối – một cô gái mất mẹ từ khi vừa lọt lòng và lớn lên trong tình yêu thương của cha tại vùng đất xã đảo Thiềng Liềng. Bước ngoặt của hai cha con bắt đầu khi Muối trưởng thành, quyết định lên thành phố học tập và làm việc với ước mơ đổi đời để phụ giúp cha.',N'src\\resources\\Image\\banner\\kumathong.jpg'),
(N'P08',	N'LOOK BACK',				'00:58:00',	98,		N'Hoạt hình',	N'Kiyotaka Oshiyama',	N'Fujino tự tin thái quá, trong khi Kyomoto lại sống khép kín, cả hai dường như không thể khác biệt hơn, nhưng tình yêu mãnh liệt dành cho manga đã trở thành sợi dây duy nhất kết nối họ. Thế nhưng, một ngày nọ, một biến cố đã xảy ra, khiến thế giới của họ hoàn toàn thay đổi…',N'src\\resources\\Image\\banner\\kumathong.jpg'),
(N'P09',	N'ROBOT HOANG DÃ',			'00:58:00',	128,	N'Hoạt hình',	N'Chris Sanders',		N'Cuộc phiêu lưu hoành tráng theo chân hành trình của một robot — đơn vị ROZZUM 7134, gọi tắt là Roz.Roz vô tình dạt vào hoang đảo sau một sự cố và nơi đây trở thành địa điểm sống mới của cô. Tại đây, Roz kết thân và nhận nuôi một chú ngỗng con, đặt tên là Brightbill..',N'src\\resources\\Image\\banner\\kumathong.jpg');

DECLARE @ngayHienTai DATE;
DECLARE @ngay2 DATE;
DECLARE @ngay3 DATE;
DECLARE @ngay4 DATE;
DECLARE @ngay5 DATE;

SET @ngayHienTai = GETDATE();
SET @ngay2 = DATEADD(DAY, 1, @ngayHienTai);
SET @ngay3 = DATEADD(DAY, 2, @ngayHienTai);
SET @ngay4 = DATEADD(DAY, 3, @ngayHienTai);
SET @ngay5 = DATEADD(DAY, 4, @ngayHienTai);

DECLARE @gioChieuGoc TIME = '06:30:00';  
DECLARE @thoiLuongPhim1 INT = 89;
DECLARE @thoiLuongPhim2 INT = 121;
DECLARE @thoiLuongPhim3 INT = 143;
DECLARE @thoiLuongPhim4 INT = 123;
DECLARE @thoiLuongPhim5 INT = 111;
DECLARE @thoiLuongPhim6 INT = 113;

INSERT INTO LichChieuPhim (maLichChieu, maPhim, ngayChieu,gioChieu,giaVe,trangThai) VALUES 
--Phim1
(N'LC01', N'P01', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC02', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC03', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC04', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC05', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC06', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC07', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC08', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC09', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC10', N'P01', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC11', N'P01', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC12', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC13', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC14', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC15', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC16', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC17', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC18', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC19', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC20', N'P01', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC21', N'P01', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC22', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC23', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC24', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC25', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC26', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC27', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC28', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC29', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC30', N'P01', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC31', N'P01', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC32', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC33', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC34', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC35', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC36', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC37', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC38', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC39', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC40', N'P01', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC41', N'P01', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC42', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC43', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC44', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC45', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC46', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC47', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC48', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC49', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC50', N'P01', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
--Phim2
(N'LC51', N'P02', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC52', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC53', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC54', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC55', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC56', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC57', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC58', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC59', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC60', N'P02', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC61', N'P02', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC62', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC63', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC64', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC65', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC66', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC67', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC68', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC69', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC70', N'P02', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC71', N'P02', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC72', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC73', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC74', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC75', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC76', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC77', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC78', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC79', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC80', N'P02', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC81', N'P02', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC82', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC83', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC84', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC85', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC86', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC87', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC88', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC89', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC90', N'P02', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC91', N'P02', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC92', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC93', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC94', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC95', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC96', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC97', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC98', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC99', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC100', N'P02', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
--Phim3
(N'LC101', N'P03', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC102', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC103', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC104', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC105', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC106', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC107', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC108', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC109', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC110', N'P03', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC111', N'P03', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC112', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC113', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC114', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC115', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC116', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC117', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC118', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC119', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC120', N'P03', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC121', N'P03', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC122', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC123', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC124', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC125', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC126', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC127', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC128', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC129', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC130', N'P03', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC131', N'P03', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC132', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC133', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC134', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC135', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC136', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC137', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC138', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC139', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC140', N'P03', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC141', N'P03', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC142', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC143', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC144', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC145', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC146', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC147', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC148', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC149', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC150', N'P03', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
--Phim4
(N'LC151', N'P04', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC152', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC153', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC154', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC155', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC156', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC157', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC158', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC159', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC160', N'P04', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC161', N'P04', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC162', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC163', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC164', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC165', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC166', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC167', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC168', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC169', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC170', N'P04', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC171', N'P04', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC172', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC173', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC174', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC175', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC176', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC177', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC178', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC179', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC180', N'P04', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC181', N'P04', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC182', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC183', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC184', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC185', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC186', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC187', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC188', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC189', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC190', N'P04', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC191', N'P04', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC192', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC193', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC194', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC195', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC196', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC197', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC198', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC199', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC200', N'P04', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
--Phim5
(N'LC201', N'P05', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC202', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC203', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC204', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC205', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC206', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC207', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC208', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC209', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC210', N'P05', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC211', N'P05', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC212', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC213', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC214', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC215', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC216', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC217', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC218', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC219', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC220', N'P05', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC221', N'P05', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC222', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC223', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC224', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC225', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC226', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC227', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC228', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC229', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC230', N'P05', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC231', N'P05', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC232', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC233', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC234', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC235', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC236', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC237', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC238', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC239', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC240', N'P05', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC241', N'P05', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC242', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC243', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC244', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC245', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC246', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC247', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC248', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC249', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC250', N'P05', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
--Phim6
(N'LC251', N'P06', @ngayHienTai, @gioChieuGoc, N'78000', '1'),
(N'LC252', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC253', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC254', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC255', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC256', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC257', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC258', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC259', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC260', N'P06', @ngayHienTai, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC261', N'P06', @ngay2, @gioChieuGoc, N'78000', '1'),
(N'LC262', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC263', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC264', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC265', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC266', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC267', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC268', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC269', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC270', N'P06', @ngay2, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC271', N'P06', @ngay3, @gioChieuGoc, N'78000', '1'),
(N'LC272', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC273', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC274', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC275', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC276', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC277', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC278', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC279', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC280', N'P06', @ngay3, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC281', N'P06', @ngay4, @gioChieuGoc, N'78000', '1'),
(N'LC282', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC283', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC284', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC285', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC286', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC287', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC288', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC289', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC290', N'P06', @ngay4, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1'),
(N'LC291', N'P06', @ngay5, @gioChieuGoc, N'78000', '1'),
(N'LC292', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 1, @gioChieuGoc), N'78000', '1'),(N'LC293', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 2, @gioChieuGoc), N'78000', '1'),(N'LC294', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 3, @gioChieuGoc), N'78000', '1'),(N'LC295', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 4, @gioChieuGoc), N'78000', '1'),
(N'LC296', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 5, @gioChieuGoc), N'78000', '1'),(N'LC297', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 6, @gioChieuGoc), N'78000', '1'),(N'LC298', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 7, @gioChieuGoc), N'60000', '1'),(N'LC299', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 8, @gioChieuGoc), N'50000', '1'),(N'LC300', N'P06', @ngay5, DATEADD(MINUTE, @thoiLuongPhim1 * 9, @gioChieuGoc), N'50000', '1');

INSERT INTO Phong (maPhong,tenPhong) VALUES 
(N'P01',N'Rap01'),
(N'P02',N'Rap02'),
(N'P03',N'Rap03'),
(N'P04',N'Rap04'),
(N'P05',N'Rap05'),
(N'P06',N'Rap06');

INSERT INTO MaGiamGia (maGiamGia, soTienGiam, ngayBatDau,ngayKetThuc,dieuKienApDung) VALUES 
(N'MGG01',N'10',N'2024-10-07', N'2029-10-07',N'Tuoi < 22'),
(N'MGG02',N'20000',N'2024-10-07', N'2024-11-20',N'Mang theo the sinh vien'),
(N'MGG03',N'50',N'2024-10-07', N'2024-10-12',N'Hang thanh vien > Bach Kim');


INSERT INTO Ghe (maGhe, loaiGhe,viTri, giaGhe, maPhong, trangThai) VALUES 
--Phong01
(N'G01', N'Đơn', N'A01', 0, N'P01', 1), (N'G02', N'Đơn', N'A02', 0, N'P01', 1), (N'G03', N'Đơn', N'A03', 0, N'P01', 1),(N'G04', N'Đơn', N'A04', 0, N'P01', 1), (N'G05', N'Đơn', N'A05', 0, N'P01', 1), (N'G06', N'Đơn', N'A06', 0, N'P01', 1),(N'G07', N'Đơn', N'A07', 0, N'P01', 1), (N'G08', N'Đơn', N'A08', 0, N'P01', 1), (N'G09', N'Đơn', N'A09', 0, N'P01', 1),(N'G10', N'Đơn', N'A10', 0, N'P01', 1), (N'G11', N'Đơn', N'A11', 0, N'P01', 1),
(N'G12', N'Đơn', N'B01', 0, N'P01', 1), (N'G13', N'Đơn', N'B02', 0, N'P01', 1), (N'G14', N'Đơn', N'B03', 0, N'P01', 1),(N'G15', N'Đơn', N'B04', 0, N'P01', 1), (N'G16', N'Đơn', N'B05', 0, N'P01', 1), (N'G17', N'Đơn', N'B06', 0, N'P01', 1),(N'G18', N'Đơn', N'B07', 0, N'P01', 1), (N'G19', N'Đơn', N'B08', 0, N'P01', 1), (N'G20', N'Đơn', N'B09', 0, N'P01', 1),(N'G21', N'Đơn', N'B10', 0, N'P01', 1), (N'G22', N'Đơn', N'B11', 0, N'P01', 1),
(N'G23', N'Đơn', N'C01', 0, N'P01', 1), (N'G24', N'Đơn', N'C02', 0, N'P01', 1), (N'G25', N'Đơn', N'C03', 0, N'P01', 1),(N'G26', N'Đơn', N'C04', 0, N'P01', 1), (N'G27', N'Đơn', N'C05', 0, N'P01', 1), (N'G28', N'Đơn', N'C06', 0, N'P01', 1),(N'G29', N'Đơn', N'C07', 0, N'P01', 1), (N'G30', N'Đơn', N'C08', 0, N'P01', 1), (N'G31', N'Đơn', N'C09', 0, N'P01', 1),(N'G32', N'Đơn', N'C10', 0, N'P01', 1), (N'G33', N'Đơn', N'C11', 0, N'P01', 1),
(N'G34', N'Đơn', N'D01', 0, N'P01', 1), (N'G35', N'Đơn', N'D02', 0, N'P01', 1), (N'G36', N'Đơn', N'D03', 0, N'P01', 1),(N'G37', N'Đơn', N'D04', 0, N'P01', 1), (N'G38', N'Đơn', N'D05', 0, N'P01', 1), (N'G39', N'Đơn', N'D06', 0, N'P01', 1),(N'G40', N'Đơn', N'D07', 0, N'P01', 1), (N'G41', N'Đơn', N'D08', 0, N'P01', 1), (N'G42', N'Đơn', N'D09', 0, N'P01', 1),(N'G43', N'Đơn', N'D10', 0, N'P01', 1), (N'G44', N'Đơn', N'D11', 0, N'P01', 1),
(N'G45', N'Đơn', N'E01', 0, N'P01', 1), (N'G46', N'Đơn', N'E02', 0, N'P01', 1), (N'G47', N'Đơn', N'E03', 0, N'P01', 1),(N'G48', N'Đơn', N'E04', 0, N'P01', 1), (N'G49', N'Đơn', N'E05', 0, N'P01', 1), (N'G50', N'Đơn', N'E06', 0, N'P01', 1),(N'G51', N'Đơn', N'E07', 0, N'P01', 1), (N'G52', N'Đơn', N'E08', 0, N'P01', 1), (N'G53', N'Đơn', N'E09', 0, N'P01', 1),(N'G54', N'Đơn', N'E10', 0, N'P01', 1), (N'G55', N'Đơn', N'E11', 0, N'P01', 1),
(N'G56', N'Đơn', N'F01', 0, N'P01', 1), (N'G57', N'Đơn', N'F02', 0, N'P01', 1), (N'G58', N'Đơn', N'F03', 0, N'P01', 1),(N'G59', N'Đơn', N'F04', 0, N'P01', 1), (N'G60', N'Đơn', N'F05', 0, N'P01', 1), (N'G61', N'Đơn', N'F06', 0, N'P01', 1),(N'G62', N'Đơn', N'F07', 0, N'P01', 1), (N'G63', N'Đơn', N'F08', 0, N'P01', 1), (N'G64', N'Đơn', N'F09', 0, N'P01', 1),(N'G65', N'Đơn', N'F10', 0, N'P01', 1), (N'G66', N'Đơn', N'F11', 0, N'P01', 1),
(N'G67', N'Đơn', N'G01', 0, N'P01', 1), (N'G68', N'Đơn', N'G02', 0, N'P01', 1), (N'G69', N'Đơn', N'G03', 0, N'P01', 1),(N'G70', N'Đơn', N'G04', 0, N'P01', 1), (N'G71', N'Đơn', N'G05', 0, N'P01', 1), (N'G72', N'Đơn', N'G06', 0, N'P01', 1),(N'G73', N'Đơn', N'G07', 0, N'P01', 1), (N'G74', N'Đơn', N'G08', 0, N'P01', 1), (N'G75', N'Đơn', N'G09', 0, N'P01', 1),(N'G76', N'Đơn', N'G10', 0, N'P01', 1), (N'G77', N'Đơn', N'G11', 0, N'P01', 1),
(N'G78', N'Đơn', N'H01', 0, N'P01', 1), (N'G79', N'Đơn', N'H02', 0, N'P01', 1), (N'G80', N'Đơn', N'H03', 0, N'P01', 1),(N'G81', N'Đơn', N'H04', 0, N'P01', 1), (N'G82', N'Đơn', N'H05', 0, N'P01', 1), (N'G83', N'Đơn', N'H06', 0, N'P01', 1),(N'G84', N'Đơn', N'H07', 0, N'P01', 1), (N'G85', N'Đơn', N'H08', 0, N'P01', 1), (N'G86', N'Đơn', N'H09', 0, N'P01', 1),(N'G87', N'Đơn', N'H10', 0, N'P01', 1), (N'G88', N'Đơn', N'H11', 0, N'P01', 1),
(N'G89', N'Đơn', N'I01', 0, N'P01', 1), (N'G90', N'Đơn', N'I02', 0, N'P01', 1), (N'G91', N'Đơn', N'I03', 0, N'P01', 1),(N'G92', N'Đơn', N'I04', 0, N'P01', 1), (N'G93', N'Đơn', N'I05', 0, N'P01', 1), (N'G94', N'Đơn', N'I06', 0, N'P01', 1),(N'G95', N'Đơn', N'I07', 0, N'P01', 1), (N'G96', N'Đơn', N'I08', 0, N'P01', 1), (N'G97', N'Đơn', N'I09', 0, N'P01', 1),(N'G98', N'Đơn', N'I10', 0, N'P01', 1), (N'G99', N'Đơn', N'I11', 0, N'P01', 1),
(N'G100', N'Đôi', N'K01', 100, N'P01', 1), (N'G101', N'Đôi', N'K02', 100, N'P01', 1), (N'G102', N'Đôi', N'K03', 100, N'P01', 1),(N'G103', N'Đôi', N'K04', 100, N'P01', 1), (N'G104', N'Đôi', N'K05', 100, N'P01', 1), (N'G105', N'Đôi', N'K06', 100, N'P01', 1),
--Phong02
(N'G106', N'Đơn', N'A01', 0, N'P02', 1), (N'G107', N'Đơn', N'A02', 0, N'P02', 1), (N'G108', N'Đơn', N'A03', 0, N'P02', 1), (N'G109', N'Đơn', N'A04', 0, N'P02', 1), (N'G110', N'Đơn', N'A05', 0, N'P02', 1), (N'G111', N'Đơn', N'A06', 0, N'P02', 1), (N'G112', N'Đơn', N'A07', 0, N'P02', 1), (N'G113', N'Đơn', N'A08', 0, N'P02', 1), (N'G114', N'Đơn', N'A09', 0, N'P02', 1), (N'G115', N'Đơn', N'A10', 0, N'P02', 1), (N'G116', N'Đơn', N'A11', 0, N'P02', 1), 
(N'G117', N'Đơn', N'B01', 0, N'P02', 1), (N'G118', N'Đơn', N'B02', 0, N'P02', 1), (N'G119', N'Đơn', N'B03', 0, N'P02', 1), (N'G120', N'Đơn', N'B04', 0, N'P02', 1), (N'G121', N'Đơn', N'B05', 0, N'P02', 1), (N'G122', N'Đơn', N'B06', 0, N'P02', 1), (N'G123', N'Đơn', N'B07', 0, N'P02', 1), (N'G124', N'Đơn', N'B08', 0, N'P02', 1), (N'G125', N'Đơn', N'B09', 0, N'P02', 1), (N'G126', N'Đơn', N'B10', 0, N'P02', 1), (N'G127', N'Đơn', N'B11', 0, N'P02', 1), 
(N'G128', N'Đơn', N'C01', 0, N'P02', 1), (N'G129', N'Đơn', N'C02', 0, N'P02', 1), (N'G130', N'Đơn', N'C03', 0, N'P02', 1), (N'G131', N'Đơn', N'C04', 0, N'P02', 1), (N'G132', N'Đơn', N'C05', 0, N'P02', 1), (N'G133', N'Đơn', N'C06', 0, N'P02', 1), (N'G134', N'Đơn', N'C07', 0, N'P02', 1), (N'G135', N'Đơn', N'C08', 0, N'P02', 1), (N'G136', N'Đơn', N'C09', 0, N'P02', 1), (N'G137', N'Đơn', N'C10', 0, N'P02', 1), (N'G138', N'Đơn', N'C11', 0, N'P02', 1), 
(N'G139', N'Đơn', N'D01', 0, N'P02', 1), (N'G140', N'Đơn', N'D02', 0, N'P02', 1), (N'G141', N'Đơn', N'D03', 0, N'P02', 1), (N'G142', N'Đơn', N'D04', 0, N'P02', 1), (N'G143', N'Đơn', N'D05', 0, N'P02', 1), (N'G144', N'Đơn', N'D06', 0, N'P02', 1), (N'G145', N'Đơn', N'D07', 0, N'P02', 1), (N'G146', N'Đơn', N'D08', 0, N'P02', 1), (N'G147', N'Đơn', N'D09', 0, N'P02', 1), (N'G148', N'Đơn', N'D10', 0, N'P02', 1), (N'G149', N'Đơn', N'D11', 0, N'P02', 1), 
(N'G150', N'Đơn', N'E01', 0, N'P02', 1), (N'G151', N'Đơn', N'E02', 0, N'P02', 1), (N'G152', N'Đơn', N'E03', 0, N'P02', 1), (N'G153', N'Đơn', N'E04', 0, N'P02', 1), (N'G154', N'Đơn', N'E05', 0, N'P02', 1), (N'G155', N'Đơn', N'E06', 0, N'P02', 1), (N'G156', N'Đơn', N'E07', 0, N'P02', 1), (N'G157', N'Đơn', N'E08', 0, N'P02', 1), (N'G158', N'Đơn', N'E09', 0, N'P02', 1), (N'G159', N'Đơn', N'E10', 0, N'P02', 1), (N'G160', N'Đơn', N'E11', 0, N'P02', 1), 
(N'G161', N'Đơn', N'F01', 0, N'P02', 1), (N'G162', N'Đơn', N'F02', 0, N'P02', 1), (N'G163', N'Đơn', N'F03', 0, N'P02', 1), (N'G164', N'Đơn', N'F04', 0, N'P02', 1), (N'G165', N'Đơn', N'F05', 0, N'P02', 1), (N'G166', N'Đơn', N'F06', 0, N'P02', 1), (N'G167', N'Đơn', N'F07', 0, N'P02', 1), (N'G168', N'Đơn', N'F08', 0, N'P02', 1), (N'G169', N'Đơn', N'F09', 0, N'P02', 1), (N'G170', N'Đơn', N'F10', 0, N'P02', 1), (N'G171', N'Đơn', N'F11', 0, N'P02', 1), 
(N'G172', N'Đơn', N'G01', 0, N'P02', 1), (N'G173', N'Đơn', N'G02', 0, N'P02', 1), (N'G174', N'Đơn', N'G03', 0, N'P02', 1), (N'G175', N'Đơn', N'G04', 0, N'P02', 1), (N'G176', N'Đơn', N'G05', 0, N'P02', 1), (N'G177', N'Đơn', N'G06', 0, N'P02', 1), (N'G178', N'Đơn', N'G07', 0, N'P02', 1), (N'G179', N'Đơn', N'G08', 0, N'P02', 1), (N'G180', N'Đơn', N'G09', 0, N'P02', 1), (N'G181', N'Đơn', N'G10', 0, N'P02', 1), (N'G182', N'Đơn', N'G11', 0, N'P02', 1), 
(N'G183', N'Đơn', N'H01', 0, N'P02', 1), (N'G184', N'Đơn', N'H02', 0, N'P02', 1), (N'G185', N'Đơn', N'H03', 0, N'P02', 1), (N'G186', N'Đơn', N'H04', 0, N'P02', 1), (N'G187', N'Đơn', N'H05', 0, N'P02', 1), (N'G188', N'Đơn', N'H06', 0, N'P02', 1), (N'G189', N'Đơn', N'H07', 0, N'P02', 1), (N'G190', N'Đơn', N'H08', 0, N'P02', 1), (N'G191', N'Đơn', N'H09', 0, N'P02', 1), (N'G192', N'Đơn', N'H10', 0, N'P02', 1), (N'G193', N'Đơn', N'H11', 0, N'P02', 1), 
(N'G194', N'Đơn', N'I01', 0, N'P02', 1), (N'G195', N'Đơn', N'I02', 0, N'P02', 1), (N'G196', N'Đơn', N'I03', 0, N'P02', 1), (N'G197', N'Đơn', N'I04', 0, N'P02', 1), (N'G198', N'Đơn', N'I05', 0, N'P02', 1), (N'G199', N'Đơn', N'I06', 0, N'P02', 1), (N'G200', N'Đơn', N'I07', 0, N'P02', 1), (N'G201', N'Đơn', N'I08', 0, N'P02', 1), (N'G202', N'Đơn', N'I09', 0, N'P02', 1), (N'G203', N'Đơn', N'I10', 0, N'P02', 1), (N'G204', N'Đơn', N'I11', 0, N'P02', 1), 
(N'G205', N'Đôi', N'K01', 100, N'P02', 1), (N'G206', N'Đôi', N'K02', 100, N'P02', 1), (N'G207', N'Đôi', N'K03', 100, N'P02', 1), (N'G208', N'Đôi', N'K04', 100, N'P02', 1), (N'G209', N'Đôi', N'K05', 100, N'P02', 1), (N'G210', N'Đôi', N'K06', 100, N'P02', 1),
--Phong03
(N'G211', N'Đơn', N'A01', 0, N'P03', 1), (N'G212', N'Đơn', N'A02', 0, N'P03', 1), (N'G213', N'Đơn', N'A03', 0, N'P03', 1), (N'G214', N'Đơn', N'A04', 0, N'P03', 1), (N'G215', N'Đơn', N'A05', 0, N'P03', 1), (N'G216', N'Đơn', N'A06', 0, N'P03', 1), (N'G217', N'Đơn', N'A07', 0, N'P03', 1), (N'G218', N'Đơn', N'A08', 0, N'P03', 1), (N'G219', N'Đơn', N'A09', 0, N'P03', 1), (N'G220', N'Đơn', N'A10', 0, N'P03', 1), (N'G221', N'Đơn', N'A11', 0, N'P03', 1), 
(N'G222', N'Đơn', N'B01', 0, N'P03', 1), (N'G223', N'Đơn', N'B02', 0, N'P03', 1), (N'G224', N'Đơn', N'B03', 0, N'P03', 1), (N'G225', N'Đơn', N'B04', 0, N'P03', 1), (N'G226', N'Đơn', N'B05', 0, N'P03', 1), (N'G227', N'Đơn', N'B06', 0, N'P03', 1), (N'G228', N'Đơn', N'B07', 0, N'P03', 1), (N'G229', N'Đơn', N'B08', 0, N'P03', 1), (N'G230', N'Đơn', N'B09', 0, N'P03', 1), (N'G231', N'Đơn', N'B10', 0, N'P03', 1), (N'G232', N'Đơn', N'B11', 0, N'P03', 1), 
(N'G233', N'Đơn', N'C01', 0, N'P03', 1), (N'G234', N'Đơn', N'C02', 0, N'P03', 1), (N'G235', N'Đơn', N'C03', 0, N'P03', 1), (N'G236', N'Đơn', N'C04', 0, N'P03', 1), (N'G237', N'Đơn', N'C05', 0, N'P03', 1), (N'G238', N'Đơn', N'C06', 0, N'P03', 1), (N'G239', N'Đơn', N'C07', 0, N'P03', 1), (N'G240', N'Đơn', N'C08', 0, N'P03', 1), (N'G241', N'Đơn', N'C09', 0, N'P03', 1), (N'G242', N'Đơn', N'C10', 0, N'P03', 1), (N'G243', N'Đơn', N'C11', 0, N'P03', 1), 
(N'G244', N'Đơn', N'D01', 0, N'P03', 1), (N'G245', N'Đơn', N'D02', 0, N'P03', 1), (N'G246', N'Đơn', N'D03', 0, N'P03', 1), (N'G247', N'Đơn', N'D04', 0, N'P03', 1), (N'G248', N'Đơn', N'D05', 0, N'P03', 1), (N'G249', N'Đơn', N'D06', 0, N'P03', 1), (N'G250', N'Đơn', N'D07', 0, N'P03', 1), (N'G251', N'Đơn', N'D08', 0, N'P03', 1), (N'G252', N'Đơn', N'D09', 0, N'P03', 1), (N'G253', N'Đơn', N'D10', 0, N'P03', 1), (N'G254', N'Đơn', N'D11', 0, N'P03', 1), 
(N'G255', N'Đơn', N'E01', 0, N'P03', 1), (N'G256', N'Đơn', N'E02', 0, N'P03', 1), (N'G257', N'Đơn', N'E03', 0, N'P03', 1), (N'G258', N'Đơn', N'E04', 0, N'P03', 1), (N'G259', N'Đơn', N'E05', 0, N'P03', 1), (N'G260', N'Đơn', N'E06', 0, N'P03', 1), (N'G261', N'Đơn', N'E07', 0, N'P03', 1), (N'G262', N'Đơn', N'E08', 0, N'P03', 1), (N'G263', N'Đơn', N'E09', 0, N'P03', 1), (N'G264', N'Đơn', N'E10', 0, N'P03', 1), (N'G265', N'Đơn', N'E11', 0, N'P03', 1), 
(N'G266', N'Đơn', N'F01', 0, N'P03', 1), (N'G267', N'Đơn', N'F02', 0, N'P03', 1), (N'G268', N'Đơn', N'F03', 0, N'P03', 1), (N'G269', N'Đơn', N'F04', 0, N'P03', 1), (N'G270', N'Đơn', N'F05', 0, N'P03', 1), (N'G271', N'Đơn', N'F06', 0, N'P03', 1), (N'G272', N'Đơn', N'F07', 0, N'P03', 1), (N'G273', N'Đơn', N'F08', 0, N'P03', 1), (N'G274', N'Đơn', N'F09', 0, N'P03', 1), (N'G275', N'Đơn', N'F10', 0, N'P03', 1), (N'G276', N'Đơn', N'F11', 0, N'P03', 1), 
(N'G277', N'Đơn', N'G01', 0, N'P03', 1), (N'G278', N'Đơn', N'G02', 0, N'P03', 1), (N'G279', N'Đơn', N'G03', 0, N'P03', 1), (N'G280', N'Đơn', N'G04', 0, N'P03', 1), (N'G281', N'Đơn', N'G05', 0, N'P03', 1), (N'G282', N'Đơn', N'G06', 0, N'P03', 1), (N'G283', N'Đơn', N'G07', 0, N'P03', 1), (N'G284', N'Đơn', N'G08', 0, N'P03', 1), (N'G285', N'Đơn', N'G09', 0, N'P03', 1), (N'G286', N'Đơn', N'G10', 0, N'P03', 1), (N'G287', N'Đơn', N'G11', 0, N'P03', 1), 
(N'G288', N'Đơn', N'H01', 0, N'P03', 1), (N'G289', N'Đơn', N'H02', 0, N'P03', 1), (N'G290', N'Đơn', N'H03', 0, N'P03', 1), (N'G291', N'Đơn', N'H04', 0, N'P03', 1), (N'G292', N'Đơn', N'H05', 0, N'P03', 1), (N'G293', N'Đơn', N'H06', 0, N'P03', 1), (N'G294', N'Đơn', N'H07', 0, N'P03', 1), (N'G295', N'Đơn', N'H08', 0, N'P03', 1), (N'G296', N'Đơn', N'H09', 0, N'P03', 1), (N'G297', N'Đơn', N'H10', 0, N'P03', 1), (N'G298', N'Đơn', N'H11', 0, N'P03', 1), 
(N'G299', N'Đơn', N'I01', 0, N'P03', 1), (N'G300', N'Đơn', N'I02', 0, N'P03', 1), (N'G301', N'Đơn', N'I03', 0, N'P03', 1), (N'G302', N'Đơn', N'I04', 0, N'P03', 1), (N'G303', N'Đơn', N'I05', 0, N'P03', 1), (N'G304', N'Đơn', N'I06', 0, N'P03', 1), (N'G305', N'Đơn', N'I07', 0, N'P03', 1), (N'G306', N'Đơn', N'I08', 0, N'P03', 1), (N'G307', N'Đơn', N'I09', 0, N'P03', 1), (N'G308', N'Đơn', N'I10', 0, N'P03', 1), (N'G309', N'Đơn', N'I11', 0, N'P03', 1), 
(N'G310', N'Đôi', N'K01', 100, N'P03', 1), (N'G311', N'Đôi', N'K02', 100, N'P03', 1), (N'G312', N'Đôi', N'K03', 100, N'P03', 1), (N'G313', N'Đôi', N'K04', 100, N'P03', 1), (N'G314', N'Đôi', N'K05', 100, N'P03', 1), (N'G315', N'Đôi', N'K06', 100, N'P03', 1),
--Phong04
(N'G316', N'Đơn', N'A01', 0, N'P04', 1), (N'G317', N'Đơn', N'A02', 0, N'P04', 1), (N'G318', N'Đơn', N'A03', 0, N'P04', 1), (N'G319', N'Đơn', N'A04', 0, N'P04', 1), (N'G320', N'Đơn', N'A05', 0, N'P04', 1), (N'G321', N'Đơn', N'A06', 0, N'P04', 1), (N'G322', N'Đơn', N'A07', 0, N'P04', 1), (N'G323', N'Đơn', N'A08', 0, N'P04', 1), (N'G324', N'Đơn', N'A09', 0, N'P04', 1), (N'G325', N'Đơn', N'A10', 0, N'P04', 1), (N'G326', N'Đơn', N'A11', 0, N'P04', 1), 
(N'G327', N'Đơn', N'B01', 0, N'P04', 1), (N'G328', N'Đơn', N'B02', 0, N'P04', 1), (N'G329', N'Đơn', N'B03', 0, N'P04', 1), (N'G330', N'Đơn', N'B04', 0, N'P04', 1), (N'G331', N'Đơn', N'B05', 0, N'P04', 1), (N'G332', N'Đơn', N'B06', 0, N'P04', 1), (N'G333', N'Đơn', N'B07', 0, N'P04', 1), (N'G334', N'Đơn', N'B08', 0, N'P04', 1), (N'G335', N'Đơn', N'B09', 0, N'P04', 1), (N'G336', N'Đơn', N'B10', 0, N'P04', 1), (N'G337', N'Đơn', N'B11', 0, N'P04', 1), 
(N'G338', N'Đơn', N'C01', 0, N'P04', 1), (N'G339', N'Đơn', N'C02', 0, N'P04', 1), (N'G340', N'Đơn', N'C03', 0, N'P04', 1), (N'G341', N'Đơn', N'C04', 0, N'P04', 1), (N'G342', N'Đơn', N'C05', 0, N'P04', 1), (N'G343', N'Đơn', N'C06', 0, N'P04', 1), (N'G344', N'Đơn', N'C07', 0, N'P04', 1), (N'G345', N'Đơn', N'C08', 0, N'P04', 1), (N'G346', N'Đơn', N'C09', 0, N'P04', 1), (N'G347', N'Đơn', N'C10', 0, N'P04', 1), (N'G348', N'Đơn', N'C11', 0, N'P04', 1), 
(N'G349', N'Đơn', N'D01', 0, N'P04', 1), (N'G350', N'Đơn', N'D02', 0, N'P04', 1), (N'G351', N'Đơn', N'D03', 0, N'P04', 1), (N'G352', N'Đơn', N'D04', 0, N'P04', 1), (N'G353', N'Đơn', N'D05', 0, N'P04', 1), (N'G354', N'Đơn', N'D06', 0, N'P04', 1), (N'G355', N'Đơn', N'D07', 0, N'P04', 1), (N'G356', N'Đơn', N'D08', 0, N'P04', 1), (N'G357', N'Đơn', N'D09', 0, N'P04', 1), (N'G358', N'Đơn', N'D10', 0, N'P04', 1), (N'G359', N'Đơn', N'D11', 0, N'P04', 1), 
(N'G360', N'Đơn', N'E01', 0, N'P04', 1), (N'G361', N'Đơn', N'E02', 0, N'P04', 1), (N'G362', N'Đơn', N'E03', 0, N'P04', 1), (N'G363', N'Đơn', N'E04', 0, N'P04', 1), (N'G364', N'Đơn', N'E05', 0, N'P04', 1), (N'G365', N'Đơn', N'E06', 0, N'P04', 1), (N'G366', N'Đơn', N'E07', 0, N'P04', 1), (N'G367', N'Đơn', N'E08', 0, N'P04', 1), (N'G368', N'Đơn', N'E09', 0, N'P04', 1), (N'G369', N'Đơn', N'E10', 0, N'P04', 1), (N'G370', N'Đơn', N'E11', 0, N'P04', 1), 
(N'G371', N'Đơn', N'F01', 0, N'P04', 1), (N'G372', N'Đơn', N'F02', 0, N'P04', 1), (N'G373', N'Đơn', N'F03', 0, N'P04', 1), (N'G374', N'Đơn', N'F04', 0, N'P04', 1), (N'G375', N'Đơn', N'F05', 0, N'P04', 1), (N'G376', N'Đơn', N'F06', 0, N'P04', 1), (N'G377', N'Đơn', N'F07', 0, N'P04', 1), (N'G378', N'Đơn', N'F08', 0, N'P04', 1), (N'G379', N'Đơn', N'F09', 0, N'P04', 1), (N'G380', N'Đơn', N'F10', 0, N'P04', 1), (N'G381', N'Đơn', N'F11', 0, N'P04', 1), 
(N'G382', N'Đơn', N'G01', 0, N'P04', 1), (N'G383', N'Đơn', N'G02', 0, N'P04', 1), (N'G384', N'Đơn', N'G03', 0, N'P04', 1), (N'G385', N'Đơn', N'G04', 0, N'P04', 1), (N'G386', N'Đơn', N'G05', 0, N'P04', 1), (N'G387', N'Đơn', N'G06', 0, N'P04', 1), (N'G388', N'Đơn', N'G07', 0, N'P04', 1), (N'G389', N'Đơn', N'G08', 0, N'P04', 1), (N'G390', N'Đơn', N'G09', 0, N'P04', 1), (N'G391', N'Đơn', N'G10', 0, N'P04', 1), (N'G392', N'Đơn', N'G11', 0, N'P04', 1), 
(N'G393', N'Đơn', N'H01', 0, N'P04', 1), (N'G394', N'Đơn', N'H02', 0, N'P04', 1), (N'G395', N'Đơn', N'H03', 0, N'P04', 1), (N'G396', N'Đơn', N'H04', 0, N'P04', 1), (N'G397', N'Đơn', N'H05', 0, N'P04', 1), (N'G398', N'Đơn', N'H06', 0, N'P04', 1), (N'G399', N'Đơn', N'H07', 0, N'P04', 1), (N'G400', N'Đơn', N'H08', 0, N'P04', 1), (N'G401', N'Đơn', N'H09', 0, N'P04', 1), (N'G402', N'Đơn', N'H10', 0, N'P04', 1), (N'G403', N'Đơn', N'H11', 0, N'P04', 1), 
(N'G404', N'Đơn', N'I01', 0, N'P04', 1), (N'G405', N'Đơn', N'I02', 0, N'P04', 1), (N'G406', N'Đơn', N'I03', 0, N'P04', 1), (N'G407', N'Đơn', N'I04', 0, N'P04', 1), (N'G408', N'Đơn', N'I05', 0, N'P04', 1), (N'G409', N'Đơn', N'I06', 0, N'P04', 1), (N'G410', N'Đơn', N'I07', 0, N'P04', 1), (N'G411', N'Đơn', N'I08', 0, N'P04', 1), (N'G412', N'Đơn', N'I09', 0, N'P04', 1), (N'G413', N'Đơn', N'I10', 0, N'P04', 1), (N'G414', N'Đơn', N'I11', 0, N'P04', 1), 
(N'G415', N'Đôi', N'K01', 100, N'P04', 1), (N'G416', N'Đôi', N'K02', 100, N'P04', 1), (N'G417', N'Đôi', N'K03', 100, N'P04', 1), (N'G418', N'Đôi', N'K04', 100, N'P04', 1), (N'G419', N'Đôi', N'K05', 100, N'P04', 1), (N'G420', N'Đôi', N'K06', 100, N'P04', 1),
--Phong05
(N'G421', N'Đơn', N'A01', 0, N'P05', 1), (N'G422', N'Đơn', N'A02', 0, N'P05', 1), (N'G423', N'Đơn', N'A03', 0, N'P05', 1), (N'G424', N'Đơn', N'A04', 0, N'P05', 1), (N'G425', N'Đơn', N'A05', 0, N'P05', 1), (N'G426', N'Đơn', N'A06', 0, N'P05', 1), (N'G427', N'Đơn', N'A07', 0, N'P05', 1), (N'G428', N'Đơn', N'A08', 0, N'P05', 1), (N'G429', N'Đơn', N'A09', 0, N'P05', 1), (N'G430', N'Đơn', N'A10', 0, N'P05', 1), (N'G431', N'Đơn', N'A11', 0, N'P05', 1), 
(N'G432', N'Đơn', N'B01', 0, N'P05', 1), (N'G433', N'Đơn', N'B02', 0, N'P05', 1), (N'G434', N'Đơn', N'B03', 0, N'P05', 1), (N'G435', N'Đơn', N'B04', 0, N'P05', 1), (N'G436', N'Đơn', N'B05', 0, N'P05', 1), (N'G437', N'Đơn', N'B06', 0, N'P05', 1), (N'G438', N'Đơn', N'B07', 0, N'P05', 1), (N'G439', N'Đơn', N'B08', 0, N'P05', 1), (N'G440', N'Đơn', N'B09', 0, N'P05', 1), (N'G441', N'Đơn', N'B10', 0, N'P05', 1), (N'G442', N'Đơn', N'B11', 0, N'P05', 1), 
(N'G443', N'Đơn', N'C01', 0, N'P05', 1), (N'G444', N'Đơn', N'C02', 0, N'P05', 1), (N'G445', N'Đơn', N'C03', 0, N'P05', 1), (N'G446', N'Đơn', N'C04', 0, N'P05', 1), (N'G447', N'Đơn', N'C05', 0, N'P05', 1), (N'G448', N'Đơn', N'C06', 0, N'P05', 1), (N'G449', N'Đơn', N'C07', 0, N'P05', 1), (N'G450', N'Đơn', N'C08', 0, N'P05', 1), (N'G451', N'Đơn', N'C09', 0, N'P05', 1), (N'G452', N'Đơn', N'C10', 0, N'P05', 1), (N'G453', N'Đơn', N'C11', 0, N'P05', 1), 
(N'G454', N'Đơn', N'D01', 0, N'P05', 1), (N'G455', N'Đơn', N'D02', 0, N'P05', 1), (N'G456', N'Đơn', N'D03', 0, N'P05', 1), (N'G457', N'Đơn', N'D04', 0, N'P05', 1), (N'G458', N'Đơn', N'D05', 0, N'P05', 1), (N'G459', N'Đơn', N'D06', 0, N'P05', 1), (N'G460', N'Đơn', N'D07', 0, N'P05', 1), (N'G461', N'Đơn', N'D08', 0, N'P05', 1), (N'G462', N'Đơn', N'D09', 0, N'P05', 1), (N'G463', N'Đơn', N'D10', 0, N'P05', 1), (N'G464', N'Đơn', N'D11', 0, N'P05', 1), 
(N'G465', N'Đơn', N'E01', 0, N'P05', 1), (N'G466', N'Đơn', N'E02', 0, N'P05', 1), (N'G467', N'Đơn', N'E03', 0, N'P05', 1), (N'G468', N'Đơn', N'E04', 0, N'P05', 1), (N'G469', N'Đơn', N'E05', 0, N'P05', 1), (N'G470', N'Đơn', N'E06', 0, N'P05', 1), (N'G471', N'Đơn', N'E07', 0, N'P05', 1), (N'G472', N'Đơn', N'E08', 0, N'P05', 1), (N'G473', N'Đơn', N'E09', 0, N'P05', 1), (N'G474', N'Đơn', N'E10', 0, N'P05', 1), (N'G475', N'Đơn', N'E11', 0, N'P05', 1), 
(N'G476', N'Đơn', N'F01', 0, N'P05', 1), (N'G477', N'Đơn', N'F02', 0, N'P05', 1), (N'G478', N'Đơn', N'F03', 0, N'P05', 1), (N'G479', N'Đơn', N'F04', 0, N'P05', 1), (N'G480', N'Đơn', N'F05', 0, N'P05', 1), (N'G481', N'Đơn', N'F06', 0, N'P05', 1), (N'G482', N'Đơn', N'F07', 0, N'P05', 1), (N'G483', N'Đơn', N'F08', 0, N'P05', 1), (N'G484', N'Đơn', N'F09', 0, N'P05', 1), (N'G485', N'Đơn', N'F10', 0, N'P05', 1), (N'G486', N'Đơn', N'F11', 0, N'P05', 1), 
(N'G487', N'Đơn', N'G01', 0, N'P05', 1), (N'G488', N'Đơn', N'G02', 0, N'P05', 1), (N'G489', N'Đơn', N'G03', 0, N'P05', 1), (N'G490', N'Đơn', N'G04', 0, N'P05', 1), (N'G491', N'Đơn', N'G05', 0, N'P05', 1), (N'G492', N'Đơn', N'G06', 0, N'P05', 1), (N'G493', N'Đơn', N'G07', 0, N'P05', 1), (N'G494', N'Đơn', N'G08', 0, N'P05', 1), (N'G495', N'Đơn', N'G09', 0, N'P05', 1), (N'G496', N'Đơn', N'G10', 0, N'P05', 1), (N'G497', N'Đơn', N'G11', 0, N'P05', 1), 
(N'G498', N'Đơn', N'H01', 0, N'P05', 1), (N'G499', N'Đơn', N'H02', 0, N'P05', 1), (N'G500', N'Đơn', N'H03', 0, N'P05', 1), (N'G501', N'Đơn', N'H04', 0, N'P05', 1), (N'G502', N'Đơn', N'H05', 0, N'P05', 1), (N'G503', N'Đơn', N'H06', 0, N'P05', 1), (N'G504', N'Đơn', N'H07', 0, N'P05', 1), (N'G505', N'Đơn', N'H08', 0, N'P05', 1), (N'G506', N'Đơn', N'H09', 0, N'P05', 1), (N'G507', N'Đơn', N'H10', 0, N'P05', 1), (N'G508', N'Đơn', N'H11', 0, N'P05', 1), 
(N'G509', N'Đơn', N'I01', 0, N'P05', 1), (N'G510', N'Đơn', N'I02', 0, N'P05', 1), (N'G511', N'Đơn', N'I03', 0, N'P05', 1), (N'G512', N'Đơn', N'I04', 0, N'P05', 1), (N'G513', N'Đơn', N'I05', 0, N'P05', 1), (N'G514', N'Đơn', N'I06', 0, N'P05', 1), (N'G515', N'Đơn', N'I07', 0, N'P05', 1), (N'G516', N'Đơn', N'I08', 0, N'P05', 1), (N'G517', N'Đơn', N'I09', 0, N'P05', 1), (N'G518', N'Đơn', N'I10', 0, N'P05', 1), (N'G519', N'Đơn', N'I11', 0, N'P05', 1), 
(N'G520', N'Đôi', N'K01', 100, N'P05', 1), (N'G521', N'Đôi', N'K02', 100, N'P05', 1), (N'G522', N'Đôi', N'K03', 100, N'P05', 1), (N'G523', N'Đôi', N'K04', 100, N'P05', 1), (N'G524', N'Đôi', N'K05', 100, N'P05', 1), (N'G525', N'Đôi', N'K06', 100, N'P05', 1),
--Phong06
(N'G526', N'Đơn', N'A01', 0, N'P06', 1), (N'G527', N'Đơn', N'A02', 0, N'P06', 1), (N'G528', N'Đơn', N'A03', 0, N'P06', 1), (N'G529', N'Đơn', N'A04', 0, N'P06', 1), (N'G530', N'Đơn', N'A05', 0, N'P06', 1), (N'G531', N'Đơn', N'A06', 0, N'P06', 1), (N'G532', N'Đơn', N'A07', 0, N'P06', 1), (N'G533', N'Đơn', N'A08', 0, N'P06', 1), (N'G534', N'Đơn', N'A09', 0, N'P06', 1), (N'G535', N'Đơn', N'A10', 0, N'P06', 1), (N'G536', N'Đơn', N'A11', 0, N'P06', 1), 
(N'G537', N'Đơn', N'B01', 0, N'P06', 1), (N'G538', N'Đơn', N'B02', 0, N'P06', 1), (N'G539', N'Đơn', N'B03', 0, N'P06', 1), (N'G540', N'Đơn', N'B04', 0, N'P06', 1), (N'G541', N'Đơn', N'B05', 0, N'P06', 1), (N'G542', N'Đơn', N'B06', 0, N'P06', 1), (N'G543', N'Đơn', N'B07', 0, N'P06', 1), (N'G544', N'Đơn', N'B08', 0, N'P06', 1), (N'G545', N'Đơn', N'B09', 0, N'P06', 1), (N'G546', N'Đơn', N'B10', 0, N'P06', 1), (N'G547', N'Đơn', N'B11', 0, N'P06', 1), 
(N'G548', N'Đơn', N'C01', 0, N'P06', 1), (N'G549', N'Đơn', N'C02', 0, N'P06', 1), (N'G550', N'Đơn', N'C03', 0, N'P06', 1), (N'G551', N'Đơn', N'C04', 0, N'P06', 1), (N'G552', N'Đơn', N'C05', 0, N'P06', 1), (N'G553', N'Đơn', N'C06', 0, N'P06', 1), (N'G554', N'Đơn', N'C07', 0, N'P06', 1), (N'G555', N'Đơn', N'C08', 0, N'P06', 1), (N'G556', N'Đơn', N'C09', 0, N'P06', 1), (N'G557', N'Đơn', N'C10', 0, N'P06', 1), (N'G558', N'Đơn', N'C11', 0, N'P06', 1), 
(N'G559', N'Đơn', N'D01', 0, N'P06', 1), (N'G560', N'Đơn', N'D02', 0, N'P06', 1), (N'G561', N'Đơn', N'D03', 0, N'P06', 1), (N'G562', N'Đơn', N'D04', 0, N'P06', 1), (N'G563', N'Đơn', N'D05', 0, N'P06', 1), (N'G564', N'Đơn', N'D06', 0, N'P06', 1), (N'G565', N'Đơn', N'D07', 0, N'P06', 1), (N'G566', N'Đơn', N'D08', 0, N'P06', 1), (N'G567', N'Đơn', N'D09', 0, N'P06', 1), (N'G568', N'Đơn', N'D10', 0, N'P06', 1), (N'G569', N'Đơn', N'D11', 0, N'P06', 1), 
(N'G570', N'Đơn', N'E01', 0, N'P06', 1), (N'G571', N'Đơn', N'E02', 0, N'P06', 1), (N'G572', N'Đơn', N'E03', 0, N'P06', 1), (N'G573', N'Đơn', N'E04', 0, N'P06', 1), (N'G574', N'Đơn', N'E05', 0, N'P06', 1), (N'G575', N'Đơn', N'E06', 0, N'P06', 1), (N'G576', N'Đơn', N'E07', 0, N'P06', 1), (N'G577', N'Đơn', N'E08', 0, N'P06', 1), (N'G578', N'Đơn', N'E09', 0, N'P06', 1), (N'G579', N'Đơn', N'E10', 0, N'P06', 1), (N'G580', N'Đơn', N'E11', 0, N'P06', 1), 
(N'G581', N'Đơn', N'F01', 0, N'P06', 1), (N'G582', N'Đơn', N'F02', 0, N'P06', 1), (N'G583', N'Đơn', N'F03', 0, N'P06', 1), (N'G584', N'Đơn', N'F04', 0, N'P06', 1), (N'G585', N'Đơn', N'F05', 0, N'P06', 1), (N'G586', N'Đơn', N'F06', 0, N'P06', 1), (N'G587', N'Đơn', N'F07', 0, N'P06', 1), (N'G588', N'Đơn', N'F08', 0, N'P06', 1), (N'G589', N'Đơn', N'F09', 0, N'P06', 1), (N'G590', N'Đơn', N'F10', 0, N'P06', 1), (N'G591', N'Đơn', N'F11', 0, N'P06', 1), 
(N'G592', N'Đơn', N'G01', 0, N'P06', 1), (N'G593', N'Đơn', N'G02', 0, N'P06', 1), (N'G594', N'Đơn', N'G03', 0, N'P06', 1), (N'G595', N'Đơn', N'G04', 0, N'P06', 1), (N'G596', N'Đơn', N'G05', 0, N'P06', 1), (N'G597', N'Đơn', N'G06', 0, N'P06', 1), (N'G598', N'Đơn', N'G07', 0, N'P06', 1), (N'G599', N'Đơn', N'G08', 0, N'P06', 1), (N'G600', N'Đơn', N'G09', 0, N'P06', 1), (N'G601', N'Đơn', N'G10', 0, N'P06', 1), (N'G602', N'Đơn', N'G11', 0, N'P06', 1), 
(N'G603', N'Đơn', N'H01', 0, N'P06', 1), (N'G604', N'Đơn', N'H02', 0, N'P06', 1), (N'G605', N'Đơn', N'H03', 0, N'P06', 1), (N'G606', N'Đơn', N'H04', 0, N'P06', 1), (N'G607', N'Đơn', N'H05', 0, N'P06', 1), (N'G608', N'Đơn', N'H06', 0, N'P06', 1), (N'G609', N'Đơn', N'H07', 0, N'P06', 1), (N'G610', N'Đơn', N'H08', 0, N'P06', 1), (N'G611', N'Đơn', N'H09', 0, N'P06', 1), (N'G612', N'Đơn', N'H10', 0, N'P06', 1), (N'G613', N'Đơn', N'H11', 0, N'P06', 1), 
(N'G614', N'Đơn', N'I01', 0, N'P06', 1), (N'G615', N'Đơn', N'I02', 0, N'P06', 1), (N'G616', N'Đơn', N'I03', 0, N'P06', 1), (N'G617', N'Đơn', N'I04', 0, N'P06', 1), (N'G618', N'Đơn', N'I05', 0, N'P06', 1), (N'G619', N'Đơn', N'I06', 0, N'P06', 1), (N'G620', N'Đơn', N'I07', 0, N'P06', 1), (N'G621', N'Đơn', N'I08', 0, N'P06', 1), (N'G622', N'Đơn', N'I09', 0, N'P06', 1), (N'G623', N'Đơn', N'I10', 0, N'P06', 1), (N'G624', N'Đơn', N'I11', 0, N'P06', 1), 
(N'G625', N'Đôi', N'K01', 100, N'P06', 1), (N'G626', N'Đôi', N'K02', 100, N'P06', 1), (N'G627', N'Đôi', N'K03', 100, N'P06', 1), (N'G628', N'Đôi', N'K04', 100, N'P06', 1), (N'G629', N'Đôi', N'K05', 100, N'P06', 1), (N'G630', N'Đôi', N'K06', 100, N'P06', 1);

INSERT INTO HoaDon (maHD, ngayLapHD, tienNhan,tienDu,tongTien,maPhong,maPhim,maGhe, IDKH,IDNV,maGiamGia) VALUES 
(N'HD01','2024-10-30',150000,25000 ,125000,N'P02',N'P01',N'G99' ,NULL,2,NULL),
(N'HD02','2024-10-30',275000,0     ,275000,N'P01',N'P01',N'G67' ,NULL,1,NULL),
(N'HD03','2024-10-29',390000,0     ,390000,N'P03',N'P03',N'G23' ,NULL,5,NULL),
(N'HD04','2024-10-27',125000,0     ,125000,N'P04',N'P04',N'G11' ,1   ,4,NULL),
(N'HD05','2024-10-30',75000 ,0     ,75000 ,N'P01',N'P02',N'G02' ,NULL,4,NULL),
(N'HD06','2024-10-27',280000,30000 ,250000,N'P02',N'P04',N'G345',5   ,2,NULL),
(N'HD07','2024-10-26',300000,50000 ,50000 ,N'P05',N'P06',N'G88' ,NULL,6,NULL),
(N'HD08','2024-10-28',325000,0     ,325000,N'P06',N'P02',N'G217',5   ,2,NULL),
(N'HD09','2024-10-29',250000,25000 ,225000,N'P01',N'P03',N'G148',NULL,1,NULL),
(N'HD10','2024-11-30',275000,0     ,275000,N'P02',N'P01',N'G92' ,NULL,3,NULL),
(N'HD11','2024-10-30',150000,0     ,150000,N'P03',N'P02',N'G223',NULL,2,NULL),
(N'HD12','2024-10-30',100000,0     ,100000,N'P04',N'P06',N'G314',4   ,1,NULL),
(N'HD13','2024-10-30',225000,0     ,225000,N'P05',N'P04',N'G56' ,NULL,6,NULL),
(N'HD14','2024-10-30',300000,25000 ,275000,N'P06',N'P01',N'G77' ,NULL,2,NULL),
(N'HD15','2024-10-30',150000,0     ,150000,N'P01',N'P05',N'G111',NULL,5,NULL),
(N'HD16','2024-10-30',250000,0     ,250000,N'P02',N'P05',N'G333',4   ,2,NULL),
(N'HD17','2024-10-30',150000,0     ,150000,N'P03',N'P03',N'G227',5   ,2,NULL),
(N'HD18','2024-10-30',200000,25000 ,175000,N'P05',N'P02',N'G324',NULL,3,NULL),
(N'HD19','2024-10-30',300000,50000 ,250000,N'P04',N'P01',N'G123',NULL,2,NULL),
(N'HD20','2024-10-30',500000,230000,270000,N'P06',N'P04',N'G345',3   ,4,NULL);


select * from HoaDon
go

CREATE PROCEDURE sp_ThemKhachHang
    @tenKhachHang NVARCHAR(255),
    @loaiKhachHang NVARCHAR(50),
    @soDienThoai NVARCHAR(50),
    @cCCD NVARCHAR(50),
    @email NVARCHAR(50),
    @ngaySinh DATE
AS
BEGIN
    INSERT INTO KhachHang (tenKhachHang, loaiKhachHang, soDienThoai, cCCD, email, ngaySinh)
    VALUES (@tenKhachHang, @loaiKhachHang, @soDienThoai, @cCCD, @email, @ngaySinh);
END

EXEC sp_ThemKhachHang
    @tenKhachHang = N'Vương Ngọc Huệ',
    @loaiKhachHang = N'Bạch kim',
    @soDienThoai = '0987654321',
    @cCCD = '012345678910',
    @email = 'ngochue12@gmail.com',
    @ngaySinh = '2003-01-01';

go
--	 thống kê doanh thu theo ca
CREATE PROCEDURE ThongKPhim
    @maPhim NVARCHAR(50) = P01,      
    @caLamViec NVARCHAR(50) = N'Sáng'     
AS
BEGIN
    SELECT 
        P.maPhim,
        P.tenPhim,
        NV.caLamViec,
        SUM(HD.tongTien) AS DoanhThu
    FROM 
        HoaDon HD
    INNER JOIN 
        Phim P ON HD.maPhim = P.maPhim
    INNER JOIN 
        NhanVien NV ON HD.IDNV = NV.IDNV
    WHERE 
        (@maPhim IS NULL OR P.maPhim = @maPhim) AND       
        (@caLamViec IS NULL OR NV.caLamViec = @caLamViec)
    GROUP BY 
        P.maPhim, 
        P.tenPhim,
        NV.caLamViec
    ORDER BY 
        P.tenPhim, 
        NV.caLamViec;
END;
EXEC ThongKPhim;
EXEC ThongKPhim @maPhim = 'P01';
EXEC ThongKPhim @caLamViec = 'Sáng';
EXEC ThongKPhim @maPhim = 'P01', @caLamViec = 'Sáng';

go
--thống kê doanh thu phim
CREATE PROCEDURE ThongKeDoanhThuPhim
    @MaPhim NVARCHAR(50)
AS
BEGIN
    SELECT 
        p.maPhim,
        p.tenPhim,
        SUM(hd.tongTien) AS DoanhThu
    FROM 
        Phim p
    LEFT JOIN 
        HoaDon hd ON p.maPhim = hd.maPhim
    WHERE 
        p.maPhim = @MaPhim  
    GROUP BY 
        p.maPhim, p.tenPhim
    ORDER BY 
        DoanhThu DESC; -- Sắp xếp theo doanh thu giảm dần
END
EXEC ThongKeDoanhThuPhim @MaPhim = N'P01';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P02';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P03';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P04';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P05';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P06';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P07';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P08';
EXEC ThongKeDoanhThuPhim @MaPhim = N'P09';




CREATE PROCEDURE getloaikhachhang
AS
BEGIN
    SELECT loaiKhachHang FROM KhachHang;
END;




--SELECT * FROM HoaDon;
-- bảng hóa đơn bị lỗi => thống kê NULL