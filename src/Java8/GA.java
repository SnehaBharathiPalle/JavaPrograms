package Java8;
import java.util.HashMap;
import java.util.Map;

public class GA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "SNEHA";
		String S2 = "PALLE";
		String S = "EALLSNEHAZP";
		String Z = result(S1, S2, S);
		System.out.println(Z);

	}

	public static String result(String S1, String S2, String S) {
		String F = S1 + S2;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			String x = S.substring(i, i + 1);
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}

		}

		for (int i = 0; i < F.length(); i++) {
			String x = F.substring(i, i + 1);
			if (map.containsKey(x) && map.get(x) > 0) {
				map.put(x, map.get(x) - 1);
			} else {
				return "NO";
			}

		}

		return "YES";
	}

}
