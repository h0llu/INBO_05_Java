package Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TaskClass {

	private static String getLine(ArrayList<String> words) {
		StringBuilder builder = new StringBuilder(words.get(0));
		words.remove(words.get(0));
		while (words.size() != 0) {
			for (int i = 0; i < words.size(); i++) {
				String word = words.get(i).toLowerCase();
				// вставка в начало builder
				if (word.charAt(word.length() - 1) ==
					builder.charAt(0)) {
					builder.insert(0, word + " ");
					words.remove(words.get(i));
				}
				// вставка в конец builder
				else if (word.charAt(0) ==
						 builder.charAt(builder.length() - 1)) {
					builder.insert(builder.length(), " " + word);
					words.remove(words.get(i));
				}
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		String fileName = "";
		String line = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите имя файла: ");
		// words
		fileName = sc.nextLine();
		try {
			line = Files.readString(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// убрать \n из конца строки
		line = line.substring(0, line.length() - 1);

		String[] words = line.split(" ");
		System.out.println(getLine(new ArrayList<>(Arrays.asList(words.clone()))));
	}
}