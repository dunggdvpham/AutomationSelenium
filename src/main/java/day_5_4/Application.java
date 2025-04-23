package day_5_4;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setTenHinh("Hình chữ nhật 1");
		hcn1.chieuDai = 12.5;
		hcn1.chieuRong = 32.5;
		hcn1.tinhDienTich();
		System.out.println("--------------------");
		
		HinhTron tron1 = new HinhTron();
		tron1.setTenHinh("Hình tròn 1");
		tron1.banKinh = 5.3;
		tron1.tinhDienTich();
	}

}
