package day_4;

public class Motobike {
	private static String tenXe;
	private static String bienSoXe;
	private static String hangXe;
	private static String ngayDangKy;
	
	
	public static String getTenXe() {
		return tenXe;
	}

	public static void setTenXe(String tenXe) {
		Motobike.tenXe = tenXe;
	}

	public static String getBienSoXe() {
		return bienSoXe;
	}

	public static void setBienSoXe(String bienSoXe) {
		Motobike.bienSoXe = bienSoXe;
	}

	public static String getHangXe() {
		return hangXe;
	}

	public static void setHangXe(String hangXe) {
		Motobike.hangXe = hangXe;
	}

	public static String getNgayDangKy() {
		return ngayDangKy;
	}

	public static void setNgayDangKy(String ngayDangKy) {
		Motobike.ngayDangKy = ngayDangKy;
	}

	public static void main(String[] args) {
		Motobike airBlade = new Motobike();
		airBlade.tenXe = "Air Blade";
		airBlade.bienSoXe = "17B1 - 12468";
		airBlade.hangXe = "HonDa";
		airBlade.ngayDangKy = "2025-04-16";
		airBlade.inThongTin();
		
		System.out.println("--------------------------------------------------");
		
		Motobike wave = new Motobike();
		wave.tenXe = "Air Blade";
		wave.bienSoXe = "17B1 - 12469";
		wave.hangXe = "SYM";
		wave.ngayDangKy = "2025-04-15";
		wave.inThongTin();
		
	}
	
	public static void inThongTin() {
		System.out.println("Ten xe: " + tenXe + ", Bien so xe: " + bienSoXe + ", Hang xe: " + hangXe + ", Ngay dang ky: " + ngayDangKy);
	}
}
