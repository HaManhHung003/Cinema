--Lấy tài khoản nhân viên cho đăng nhập
CREATE PROCEDURE CheckLogin
    @TaiKhoan NVARCHAR(50),
    @MatKhau NVARCHAR(50)
AS
BEGIN
    IF EXISTS (
        SELECT 1
        FROM NhanVien
        WHERE taiKhoan = @TaiKhoan AND matKhau = @MatKhau
    )
    BEGIN
        SELECT 'khop' AS Result;
    END
    ELSE
    BEGIN
        SELECT 'khongKhop' AS Result;
    END
END;
GO

CREATE PROCEDURE GetKhuyenMai
AS
BEGIN
	SELECT 
		CONCAT('tieude', ROW_NUMBER() OVER (ORDER BY maGiamGia)) AS tieudeLabel,tieude,
		CONCAT('soTienGiam', ROW_NUMBER() OVER (ORDER BY maGiamGia)) AS soTienGiamLabel,soTienGiam,
		CONCAT('dieuKienApDung', ROW_NUMBER() OVER (ORDER BY maGiamGia)) AS dieuKienApDungLabel,dieuKienApDung,
		CONCAT('hinhAnh', ROW_NUMBER() OVER (ORDER BY maGiamGia)) AS hinhAnhLabel,hinhAnh
	FROM MaGiamGia
	ORDER BY maGiamGia
	OFFSET 0 ROWS FETCH NEXT 2 ROWS ONLY;
END;

GO

CREATE PROCEDURE GetFilm
AS
BEGIN
	SELECT 
        CONCAT('tenPhim', ROW_NUMBER() OVER (ORDER BY maPhim)) AS tenPhimLabel,
        tenPhim,
        CONCAT('thoiLuong', ROW_NUMBER() OVER (ORDER BY maPhim)) AS thoiLuongLabel,
        thoiLuong,
        CONCAT('theLoai', ROW_NUMBER() OVER (ORDER BY maPhim)) AS theLoaiLabel,
        theLoai,
        CONCAT('duongDan', ROW_NUMBER() OVER (ORDER BY maPhim)) AS duongDanLabel,
        hinhAnh
    FROM Phim
    ORDER BY maPhim
    OFFSET 0 ROWS FETCH NEXT 6 ROWS ONLY;
END;

GO

CREATE PROCEDURE AddNhanVien
	@tenNhanVien NVARCHAR(255),
    @soDienThoai NVARCHAR(50),
    @chucVu NVARCHAR(50),
    @gioiTinh BIT, 
    @ngaySinh DATE,
    @cCCD NVARCHAR(50),
    @email NVARCHAR(50),
    @caLamViec NVARCHAR(50)
AS
BEGIN
	INSERT INTO NhanVien (tenNhanVien, soDienThoai,chucVu,gioiTinh,ngaySinh,cCCD,email, caLamViec) VALUES 
				(@tenNhanVien,@soDienThoai, @chucVu,@gioiTinh,@ngaySinh,@cCCD,@email,@caLamViec);
END;

GO

CREATE PROCEDURE UpdateNhanVien
	@tenNhanVien NVARCHAR(255),
    @soDienThoai NVARCHAR(50),
    @chucVu NVARCHAR(50),
    @gioiTinh BIT, 
    @ngaySinh DATE,
    @cCCD NVARCHAR(50),
    @email NVARCHAR(50),
    @caLamViec NVARCHAR(50),
	@tenCu NVARCHAR(255)
AS
BEGIN
	UPDATE NhanVien
	SET tenNhanVien = @tenNhanVien,
		soDienThoai = @soDienThoai,
		chucVu = @chucVu,
		gioiTinh = @gioiTinh,
		ngaySinh = @ngaySinh,
		cCCD = @cCCD,
		email = @email, 
		caLamViec = @caLamViec
	WHERE tenNhanVien = @tenCu;
END;

GO

CREATE PROCEDURE removeNhanVien
	@cCCD NVARCHAR(50)
AS
BEGIN
	DELETE FROM NhanVien WHERE cCCD = @cCCD;
END;

go

CREATE PROCEDURE getNhanVien
AS
BEGIN
	SELECT 
        tenNhanVien,
        soDienThoai,
        chucVu,
        gioiTinh,
        ngaySinh,
        cCCD,
        email,
        caLamViec
	From NhanVien
END;

go
CREATE PROCEDURE getThongTinPhim
    @filmName NVARCHAR(255) 
AS
BEGIN
    DECLARE @maPhim NVARCHAR(50); 
    DECLARE @thoiLuong INT;
    DECLARE @theLoai NVARCHAR(50);
    DECLARE @daoDien NVARCHAR(50);
    DECLARE @moTa NVARCHAR(MAX);
	DECLARE @duongdan NVARCHAR(MAX);

    SELECT @maPhim = maPhim, 
           @thoiLuong = thoiLuong, 
           @theLoai = theLoai, 
           @daoDien = daoDien, 
           @moTa = moTa,
		   @duongdan = banner
    FROM Phim
    WHERE tenPhim = N''+@filmName+'';
    IF @maPhim IS NOT NULL
    BEGIN
        CREATE TABLE getNgayChieu (
            ngayChieu DATE,
            gioChieu TIME,
            giaVe INT,
            trangThai BIT
        );
        INSERT INTO getNgayChieu (ngayChieu)
        SELECT DISTINCT ngayChieu
        FROM LichChieuPhim
        WHERE maPhim = @maPhim
        GROUP BY ngayChieu;

        SELECT @maPhim AS maPhim, 
               @thoiLuong AS thoiLuong, 
               @theLoai AS theLoai, 
               @daoDien AS daoDien, 
               @moTa AS moTa, 
			   @duongdan AS link,
               FORMAT(ngayChieu, 'dd/MM') AS ngayChieu1 
        FROM getNgayChieu;

        DROP TABLE getNgayChieu;
    END
    ELSE
    BEGIN
        SELECT NULL AS maPhim, NULL AS thoiLuong, NULL AS theLoai, NULL AS daoDien, NULL AS moTa, NULL AS ngayChieu, NULL AS link;
    END
END;

go

CREATE PROCEDURE getGioChieu
    @filmName NVARCHAR(50),
    @dateFilm NVARCHAR(50)
AS
BEGIN
	DECLARE @nowTime TIME = CONVERT(TIME, GETDATE());
	DECLARE @todayDate DATE = CONVERT(DATE, GETDATE());

	UPDATE lc
    SET lc.trangThai = 
	CASE 
		WHEN CONVERT(DATE, lc.ngayChieu) = @todayDate THEN 
			CASE 
				WHEN lc.gioChieu < @nowTime THEN 0 
				ELSE 1 
			END
		ELSE lc.trangThai
    END
    FROM LichChieuPhim lc
    JOIN Phim p ON lc.maPhim = p.maPhim
    WHERE p.tenPhim = @filmName 
        AND FORMAT(lc.ngayChieu, 'dd/MM') = @dateFilm;


    SELECT 
        LEFT(CAST(lc.gioChieu AS VARCHAR(8)), 5) AS gioChieu1,
        lc.trangThai
    FROM 
        LichChieuPhim lc
    JOIN 
        Phim p ON lc.maPhim = p.maPhim
    WHERE 
        p.tenPhim = @filmName 
        AND FORMAT(lc.ngayChieu, 'dd/MM') = @dateFilm
    ORDER BY 
        lc.gioChieu;
	
END;

go

EXEC getGioChieu @filmName = N'JOKER: FOLIE À DEUX', @dateFilm = '06/11';


