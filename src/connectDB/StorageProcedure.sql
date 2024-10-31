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