CREATE TABLE nha_xuat_ban(
    nxb_id int AUTO_INCREMENT PRIMARY KEY,
    ten_nxb varchar(255) NOT NULL UNIQUE,
	dia_chi text NOT NULL
);

CREATE TABLE nv_thu_kho(
    nv_id int AUTO_INCREMENT PRIMARY KEY,
	ten varchar(255) NOT NULL,
	ngay_sinh date,
	dia_chi text,
	dien_thoai varchar(50) NOT NULL UNIQUE
);

CREATE TABLE sach(
     ma_sach varchar(50) PRIMARY KEY,
	 ten_sach varchar(255) NOT NULL,
     noi_dung text,
     nam_xb int NOT NULL,
	 gia decimal(12,4) NOT NULL CHECK(gia >= 100),
	 so_luong int NOT NULL CHECK(so_luong >= 0),
     loai_sach_id int UNSIGNED NOT NULL REFERENCES loai_sach(loai_sach_id),
	 nxb_id int UNSIGNED NOT NULL REFERENCES nha_xuat_ban(nxb_id),
     lan_xb int NOT NULL
);
CREATE TABLE tac_gia(
    tgia_id int AUTO_INCREMENT PRIMARY KEY,
	ten_tgia varchar(255),
	ngay_sinh date,
	tieu_su text
);

CREATE TABLE sach_tgia(
    ma_sach int UNSIGNED NOT NULL REFERENCES sach(ma_sach),
	tgia_id int UNSIGNED NOT NULL REFERENCES tac_gia(tgia_id)
);
CREATE TABLE loai_sach(
    loai_sach_id int PRIMARY KEY,
	ten_loai_sach varchar(200),
	nxb_id int UNSIGNED NOT NULL REFERENCES nha_xuat_ban(nxb_id)
);


CREATE TABLE phieu_nhap_kho(
     nhap_kho_id int AUTO_INCREMENT PRIMARY KEY,
     ngay_nhap date NOT NULL,
	 tong_tien decimal(12,4) NOT NULL CHECK(tong_tien >=100),
	 nxb_id int UNSIGNED NOT NULL REFERENCES nha_xuat_ban(nxb_id),
	 nv_id int UNSIGNED NOT NULL REFERENCES nv_thu_kho(nv_id)
);

CREATE TABLE phieu_xuat_kho(
     xuat_kho_id int AUTO_INCREMENT PRIMARY KEY,
     ngay_xuat date NOT NULL,
	 tong_tien decimal(12,4) NOT NULL CHECK(tong_tien >=100),
	 ntt_id int UNSIGNED NOT NULL REFERENCES nguoi_tieu_thu(ntt_id),
	 nv_id int UNSIGNED NOT NULL REFERENCES nv_thu_kho(nv_id)
);

CREATE TABLE nguoi_tieu_thu(
    ntt_id int AUTO_INCREMENT PRIMARY KEY,
    ten_ntt varchar(255) NOT NULL UNIQUE,
	so_dt varchar(50) NOT NULL,
	dia_chi text
);

INSERT INTO sach(ma_sach,ten_sach,noi_dung,nam_xb,lan_xb,gia,so_luong)
          VALUES('B001','Trí tuệ Do Thái','Bạn có muốn biết: Người Do Thái sáng tạo ra cái gì và...', 2010, 1, 79000, 100);
SELECT * FROM sach;
INSERT INTO tac_gia(ten_tgia) VALUES('Eran Katz');
SELECT * FROM tac_gia;
INSERT INTO nha_xuat_ban(ten_nxb,dia_chi)
         VALUES('Tri Thức', '53 Nguyễn Du, Hai Bà Trưng, Hà Nội');
SELECT * FROM nha_xuat_ban;



SELECT * FROM sach ORDER BY nam_xb DESC LIMIT 10;

