import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.println("-----meun-----");
		System.out.println(
				"1.Dosa-25rs\n 2.Samosa-15rs\n 3.Idli-25\n 4.appe-25\n 5.meduwada-30rs\n 6.pohe-25rs\n 7.upma-25rs\n 8.wadaSambar-20rs\n 9.paavbhaji-40rs\n 10.generateBill-");

		double bill = 0;
		int qty = 0;

		do {
			System.out.println("enter your chioce");
			choice = sc.nextInt();
			if (choice != 10) {
				System.out.println("enter the quantity-");
				qty = sc.nextInt();
			}
			switch (choice) {
			case 1:
				bill += (25 * qty);
				break;
			case 2:
				bill += (15 * qty);
				break;
			case 3:
				bill += (25 * qty);
				break;
			case 4:
				bill += (25 * qty);
				break;
			case 5:
				bill += (30 * qty);
				break;
			case 6:
				bill += (25 * qty);
				break;
			case 7:
				bill += (25 * qty);
				break;
			case 8:
				bill += (20 * qty);
				break;
			case 9:
				bill += (40 * qty);
				break;
			case 10:
				System.out.println("total bill" + bill + "rs");

				break;
			default:
				System.out.println("enter valid choice");
			}
		} while (choice != 0);

	}

}