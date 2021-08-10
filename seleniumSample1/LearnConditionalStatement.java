package seleniumSample1;

public class LearnConditionalStatement {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i < 2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("The loop stops execution");

		System.out.println("=============================================");
		for (int j = 0; j < 10; j++) {
			if (j < 2) {
				continue;
			}
			System.out.println(j);
		}
		System.out.println("=============================================");

		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		System.out.println("=============================================");
		int regNum = 2345;

		if (regNum == 4567) {
			System.out.println("The Car brand is Audi");
		} else if (regNum == 2345 && regNum == 3456) {
			System.out.println("The Car brand is Benz");
		} else if (regNum == 2345 || regNum == 4578) {
			System.out.println("The car Brand is Maruthi");

		} else
			System.out.println("The Czr brand is Toyota");

	}

}
