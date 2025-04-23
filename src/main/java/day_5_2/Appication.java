package day_5_2;

public class Appication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teachers teacher1 = new Teachers();
		teacher1.name = "Jimmy";
		teacher1.age = 30;
		teacher1.teacherID = "T-001";
		teacher1.expYear = 3;
		teacher1.play();
		teacher1.eat();
		teacher1.printExpYear();
		
		System.out.println("------------------------");
		
		Students student1 = new Students();
		student1.name = "Jimmy Junior";
		student1.age = 18;
		student1.totalAccumulatedCredits = 250;
		student1.play();
		student1.eat();
		student1.study();
	}

}
