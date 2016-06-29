public class Question1 {

	public static void main(String[] args) {
		String[] inputData = { "aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l" };
		String temp;
		int indexACharacter;
		int minValue;
		int index = 0;

		for (int i = 0; i < inputData.length; i++) {
			indexACharacter = i;
			char[] testChar = inputData[i].toCharArray();
			for (int k = 0; k < testChar.length; k++) {
				if (testChar[k] == 'a') {
					indexACharacter = i;
					index = i;
					break;
				}
			}
			temp = inputData[i];
			inputData[i] = inputData[indexACharacter];
			inputData[indexACharacter] = temp;

		}
		for (int i = index + 1; i < inputData.length; i++) {
			minValue = i;
			for (int j = i; j < inputData.length; j++) {
				if (inputData[j].length() > inputData[minValue].length())
					minValue = j;
			}
			temp = inputData[i];
			inputData[i] = inputData[minValue];
			inputData[minValue] = temp;
		}

		int count = countCharacter(inputData[0]);
		int tempCount = 0;
		for (int i = 1; i < index + 1; i++) {
			minValue = i;
			for (int j = i; j < index + 1; j++) {
				tempCount = countCharacter(inputData[j]);
				if (count > tempCount) {
					minValue = i;
					count = tempCount;
				} else {
					minValue = j;
					count = tempCount;
				}
			}
			String tempA = inputData[i];
			inputData[i] = inputData[minValue];
			inputData[minValue] = tempA;
		}
		for (int i = 0 ; i < inputData.length ; i++){
			System.out.print(inputData[i]+" ");
		}

	}

	public static int countCharacter(String word) {
		char[] tempCharA = word.toCharArray();
		int tempCount = 0;
		for (int j = 0; j < tempCharA.length; j++) {
			if (tempCharA[j] == 'a') {
				tempCount++;
			}
		}
		return tempCount;
	}

}