package Program_practise;

import org.apache.commons.math3.analysis.integration.gauss.SymmetricGaussIntegrator;

public class Count_total_number_of_character_In_String {

	public void approch1() {
		String str = "Pooja";
		int character = str.length();
		System.out.println("number of character ares:-" + character);

	}
	public void approch2() {
		
		String str= "Rushikesh";
		str=str.replaceAll("\\s+", "");
		int character = str.length();
		System.out.println("number of character ares:-" + character);

		
		
	}

	public static void main(String[] args) {

		
		Count_total_number_of_character_In_String  obj = new Count_total_number_of_character_In_String  ();
		
		obj.approch1();
		obj.approch2();
	}

}
