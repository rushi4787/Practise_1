package Program_practise;

public class ArmStrong {

	public static void main(String[] args) {

		int i = 153;
		int armnu = i;
		int arm = 0;
		String st = String.valueOf(i);
		int l = st.length();
		System.out.println(l);
		while (i != 0) {
			int count = 1;

			int rem = i % 10;

			for (int f = 0; f < l; f++) {

				count = rem * count;
			}

			arm = count + arm;
			i = i / 10;

		}
		System.out.println(arm);
		if (arm == armnu) {
			System.out.println("number is ArmStrong");
		} else {
			System.out.println("number is non ArmStrong");
		}

	}

}
