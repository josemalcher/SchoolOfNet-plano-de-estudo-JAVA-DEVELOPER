public class IfSwitch {
    public static void main(String[] args) {
        int a = 11;

		if (a > 10) {
			System.out.println("Is greater than 10");
		} else {
			System.out.println("Is not greater than 10");
		}

		int weekDay = 2;

		switch(weekDay) {
			case 1:
				System.out.print("Sunday");
				break;
			case 2:
				System.out.print("Monday");
				break;
			case 3:
				System.out.print("Tuesday");
				break;
			case 4:
				System.out.print("Wednesday");
				break;
			case 5:
				System.out.print("Thurday");
				break;
			case 6:
				System.out.print("Friday");
				break;
			case 7:
				System.out.print("Saturday");
				break;
			default:
				System.out.print("This option does not exists");

		}
    }
}
