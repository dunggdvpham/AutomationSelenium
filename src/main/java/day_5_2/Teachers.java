package day_5_2;

public class Teachers extends Person{
	public String teacherID;
	public int expYear;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Giáo viên " + super.name + " đi chơi vào ngày nghỉ và có tiền.");
	}
	public void printExpYear() {
		System.out.println("Kinh nghiệm của giáo viên " + teacherID + " là: " + expYear + " năm.");
	}
}
