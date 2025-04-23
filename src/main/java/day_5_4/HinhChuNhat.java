package day_5_4;

public class HinhChuNhat extends HinhHoc{
	public double chieuDai;
	public double chieuRong;
	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		double s = chieuDai * chieuRong;
		System.out.println("Diện tích hình: " + super.getTenHinh() + " là: " + s);
	}

}
