package fp.dam.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	// Ejercicio 1
	static ArrayList<String> m1(String s) {
		ArrayList<String> out = new ArrayList<String>();
		char[] cadena = s.toCharArray();

		for (int i = 0; i < cadena.length; i++) {
			int j = 1;

			while (i + j < cadena.length && cadena[i] == cadena[i + j]) {
				j++;
			}

			if (j >= 2) {
				out.add(s.substring(i, i + j));
			}

			i = i + j - 1;
		}

		return out;
	}

	// Ejercicio 2

	static ArrayList<String> m2(String s) {
		ArrayList<String> out = new ArrayList<String>();
		String regex = "(.)\1+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(regex);
		while (m.find())

		{
			out.add(m.group());
		}
		return out;
	}

	// Ejercicio 3
	static Integer m3a(int[][] m) {
		if (m.length < 3 || m[0].length < 3)
			return null;

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < m.length - 2; i++) {
			for (int j = 0; j < m[0].length - 2; j++) {
				int suma = 0;

			}

		}
		return max;
	}
}