package day_5_4;

public class HinhTron extends HinhHoc{
	public double banKinh;
	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		double s = 3.14 * banKinh + banKinh;
		System.out.println("Diện tích hình: " + super.getTenHinh() + " là: " + s);
	}

}
