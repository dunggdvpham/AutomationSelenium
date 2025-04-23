package day_5_3;

public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder imp = new Adder();
		int add_1 = imp.add(2, 3);
		int add_2 = imp.add(7, 8, 9);
		double add_3 = imp.add(12.4, 23.2);
		
		System.out.println(add_1);
		System.out.println("-------------");
		System.out.println(add_2);
		System.out.println("-------------");
		System.out.println(add_3);
		
	}

}
