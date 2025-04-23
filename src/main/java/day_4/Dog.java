package day_4;

public class Dog {
	public static String breed;
	public static String size;
	public static int age;
	public static String color;
	
	public static void main(String[] args) {
		Dog beggie = new Dog();
		beggie.breed = "Beggie";
		beggie.size = "Big";
		beggie.age = 1;
		beggie.color = "Yellow";
		System.out.println(beggie.getInfo());
		System.out.println("--------------------------------------------------");
		
		Dog pitbull = new Dog();
		pitbull.breed = "PitBull";
		pitbull.size = "Normal";
		pitbull.age = 2;
		pitbull.color = "Black";
		System.out.println(pitbull.getInfo());
		
	}
	
	public static String getInfo() {
		return "Breed: " + breed + " , Sire: " + size + ", Age: " + age + ", Color: " +color ;
	}
}
