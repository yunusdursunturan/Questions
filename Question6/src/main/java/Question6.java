
public class Question6 {

	public static void main(String[] args) {

		String[] inputMatris = { "apple", "pie", "apple", "res", "red", "red", "red" };
		
		String element = "";
		int count = 0;
		for (int i = 0; i < inputMatris.length; i++) {
			String temp = inputMatris[i];
			int tempCount = 0;
			for (int j = 0; j < inputMatris.length; j++) {
				if (inputMatris[j].equals(temp)) {
					tempCount++;
					if (tempCount > count) {
						element = temp;
						count = tempCount;

					}
				}

			}

		}
		System.out.println("the most repeated element is : " + element +" , "+"count : " + count);
			

	}
}