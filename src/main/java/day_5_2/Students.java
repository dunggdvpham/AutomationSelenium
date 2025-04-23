package day_5_2;

public class Students extends Person{
	public int totalAccumulatedCredits;
	public double grade;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Sinh viên " + super.name +" đi chơi khi nào thích.");
	}
	
	public void study() {
		System.out.println("Đi học theo thời khóa biểu và tích lũy được số tín chỉ: " + totalAccumulatedCredits);
	}

}
