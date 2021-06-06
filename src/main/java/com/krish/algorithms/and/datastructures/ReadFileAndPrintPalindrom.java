package com.krish.algorithms.and.datastructures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileAndPrintPalindrom {

	public static void main(String[] args) {

    //The below lines are file data
    //Im using wow shampoo and my mom using sheekaya and my dad uses nothing.
    //1001 is palindrome.
		Path filePath = Paths.get("/home/krishnababu/Documents", "test.txt");
    
		try (Stream<String> lines = Files.lines(filePath)) {
			lines.forEach(line -> {
				List<String> values = Arrays.asList(line.split(" "));
				values.forEach(value -> {
					if (isPrime(value))
						System.out.println(value);
				});
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean isPrime(String data) {
		int left = 0;
		int right = data.length() - 1;
		boolean isPrime = true;

		while (left <= right) {
			if (data.charAt(left) != data.charAt(right)) {
				return !isPrime;
			} else {
				left++;
				right--;
			}
		}
		return isPrime;
	}

}

Output:
wow
mom
dad
1001
