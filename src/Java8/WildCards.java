package Java8;

public class WildCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// $ : 1-9
		// + : single alphabetical character'
		// * :same character of length 3 if not followed {len}
		String s1 = "*+*{6}+";
		String s2 = "kkkjgggggr";
		int symbolcount = 0;
		int wordCount = 0;
		boolean finalFlag = false;
		// going loop with symbol
		while (wordCount < s2.length()) {
			String symbol = s1.substring(symbolcount, symbolcount + 1);
			char c = s2.charAt(wordCount);
			if (symbol.equals("+")) {
				finalFlag = isplus(c);
				symbolcount = symbolcount + 1;
				wordCount = wordCount + 1;
			} else if (symbol.equals("$")) {
				finalFlag = isDollar(c);
				symbolcount = symbolcount + 1;
				wordCount = wordCount + 1;
			} else if (symbol.equals("*")) {
				int tempSymbolcount = symbolcount + 1;
				String tempsymbol = s1.substring(tempSymbolcount, tempSymbolcount + 1);
				if (tempsymbol.equals("{")) {
					String x = "";
					tempSymbolcount = tempSymbolcount + 1;
					tempsymbol = s1.substring(tempSymbolcount, tempSymbolcount + 1);
					while (tempSymbolcount < s1.length()) {
						if (tempsymbol.equals("}")) {
							break;
						}
						x = x + tempsymbol;
						tempSymbolcount = tempSymbolcount + 1;
						tempsymbol = s1.substring(tempSymbolcount, tempSymbolcount + 1);

					}

					String tempC = s2.substring(wordCount, wordCount + Integer.valueOf(x));

					finalFlag = isStar(tempC, Integer.valueOf(x));
					symbolcount = symbolcount + x.length() + 3;
					wordCount = wordCount + Integer.valueOf(x);

				} else {
					String tempC = s2.substring(wordCount, wordCount + 3);
					finalFlag = isStar(tempC, 3);
					symbolcount = symbolcount + 1;
					wordCount = wordCount + 3;
				}

			} else {
				finalFlag = false;
				wordCount = wordCount + 1;
			}

			if (!finalFlag) {
				break;
			}

		}

		System.out.println(finalFlag);
	}

	public static boolean isDollar(char c) {
		if (Character.isDigit(c)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isplus(char c) {
		if (Character.isAlphabetic(c)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isStar(String s, int n) {
		boolean flag = false;
		char[] c = s.toCharArray();
		for (int i = 0; i < n; i++) {
			if (Character.isAlphabetic(c[i]) && String.valueOf(c[0]).equals(String.valueOf(c[i]))) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
