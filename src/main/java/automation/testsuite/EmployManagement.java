package automation.testsuite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.*;

public class EmployManagement {
	@Test
	public void employManagement() {
		System.out.println("Bắt đầu chương trình!");
		System.out.println("---------------------");
		List<String> empList = new ArrayList<String>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Chọn 1 trong các lựa chọn dưới đây:");
			System.out.println("****");
			System.out.println("1. Nhập thông tin nhân viên \n"
							 + "2. In danh sách nhân viên \n"
							 + "3. Thoát.");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				System.out.println("Nhập tên nhân viên:");
				String name = sc.nextLine();
				System.out.println("Nhập tuổi của nhân viên:");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập phòng ban của nhân viên");
				String dept = sc.nextLine();
				System.out.println("Nhập số năm kinh nghiệm:");
				double year = sc.nextDouble();
				sc.nextLine();
				String infor = "Tên nhân viên: " + name + ", tuổi: " + age + ", bộ phận: " + dept + ", số năm kinh nghiệm: " + year + " năm." ;
				System.out.println("Kết quả vừa nhập: ");
				System.out.println(infor);
				System.out.println("---------------------");
				empList.add(infor);
				break;
			case 2:
				if(empList.size() == 0) {
					System.out.println("Danh sách trống! Vui lòng nhập thông tin nhân viên.");
					System.out.println("---------------------");
					break;
				} else {
					System.out.println("Danh sách nhân viên:");
					for (String emp : empList) {		
						System.out.println(empList.indexOf(emp) + 1 + ". " + emp);
					}
					System.out.println("---------------------");
					break;
				}
			case 3:
				sc.close();
				return;
			default:
				System.out.println("Nhập giá trị không hợp lệ! Thoát chương trình");
				sc.close();
				return;
			}
		}
	}
}
