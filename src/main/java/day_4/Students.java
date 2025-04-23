package day_4;

public class Students {
	public static void main(String[] args) {
		Person student1 = new Person();
		student1.setTen("Jimmy");
		student1.setTuoi(30);
		student1.setSoDienThoai("012345678");
		
		System.out.println("Ten: " + student1.getTen() + ", Tuoi: " + student1.getTuoi() + ", So dien thoai: " + student1.getSoDienThoai());
		
		System.out.println("----------------------------------------");
		Person student2 = new Person();
		student2.setTen("Adele");
		student2.setTuoi(34);
		student2.setSoDienThoai("012345678");
		
		System.out.println("Ten: " + student2.getTen() + ", Tuoi: " + student2.getTuoi() + ", So dien thoai: " + student2.getSoDienThoai());
	}
	
}
