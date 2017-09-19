import java.util.*;


public class RandomCode {

	//"Kalle,Juku,Peeter" ["Kalle", "Juku", "Peeter"]
	public static void main(String[] args) {
		RandomCode rc = new RandomCode();
		String[] names = {"Vitali Vildikas", "Vello Põld", "Kirju Marju", "Indrek Kaigas"};
//		System.out.println(Arrays.toString(rc.printRange(10, 50, 7)));

//		Scanner sc = new Scanner(System.in);
//	    int [] input_arr = new int [3];
//	    System.out.println("--- Printrange ---\n");
//	    for (int i = 0; i < input_arr.length; i++) {
//	    	if (i == 0) {
//	    		System.out.println("Enter min value:");
//	    	}
//	    	else if (i == 1) {
//	    		System.out.println("Enter max value:");
//	    	}
//	    	else {
//	    		System.out.println("Enter increment addition:");
//	    	}
//		    input_arr[i] = sc.nextInt();
//	    }
//	    sc.close();
//    	System.out.println(Arrays.toString(rc.printRange(input_arr[0], input_arr[1], input_arr[2])));
		
		
//		print10to0();
		
//		Scanner sc2 = new Scanner(System.in);
//		StringTokenizer token = new StringTokenizer(sc2.nextLine(), " ,.:;");
//		sc2.close();
//		while (token.hasMoreTokens()) {
//			String str_raw = token.nextToken().replaceAll("[^a-zA-Z0-9]", "");
//			String str = str_raw.toLowerCase();
//			if (str.length() > 4) System.out.println(str);
//			if (str.startsWith("i".toLowerCase()) || str.startsWith("v".toLowerCase())) System.out.println(str);
//			if (Character.isUpperCase(str_raw.charAt(0))) System.out.println(str_raw);
//		}
		
//		result += token.toLowerCase() + ""; 
		
		// .replaceAll("[+-*/0-9]", "")
//		nanocalc();
		
	}
	
	public static String separateSurname(String fullname) {
		return fullname.substring(fullname.indexOf(" ") +1);
	}

	private static boolean isNameUpper(String name) {
		char firstChar = name.charAt(0);
		return Character.isUpperCase(firstChar);
	}
	
	public static List<String> getSurnameList(String[] names) {
		List<String> surnames = new ArrayList<String>();
		for (String name : names) {
			String surname = separateSurname(name);
			if (isNameUpper(surname)) {
				surnames.add(surname);
			} else {
				
			}
		}
		return surnames;
	}

	private static void nanocalc() {
		Scanner sc_math = new Scanner(System.in);


		System.out.println("--- Nanocalc ---\n");
		System.out.println("Enter expression using +-*/: \n");
		String expression = sc_math.nextLine();
		sc_math.close();
		
		String[] operands = expression.split("[-+*%/]");
		String[] operators = expression.split("[0-9]+");
		
		double result = Integer.parseInt(operands[0]);
		
		for (int i = 1; i < operands.length; i++) {
			if ("*".equals(operators[i])) {
				result = result * Integer.parseInt(operands[i]);
			}
			else if ("/".equals(operators[i])) {
				result = result / Integer.parseInt(operands[i]);
			}
			else if ("+".equals(operators[i])) {
				result = result + Integer.parseInt(operands[i]);
			}
			else if ("-".equals(operators[i])) {
				result = result - Integer.parseInt(operands[i]);
			}
		}
		System.out.println(expression+" = "+result);
	}
	
	private int[] printRange(int min, int max, int add) {
		int[] arr = new int[(max - min) / add + 1];
		for (int i = 0, j = min; i <= (max - min) / add; i++, j += add) {
			arr[i] = j;
		}
		return arr;
	}

	private static void print10to0() {

		// for (int i = 10; i >= 0; i--) {
		// System.out.println(i);
		// }

		int count = 10;
		while (count >= 0) {
			System.out.println(count);
			count--;
		}
	}

}
