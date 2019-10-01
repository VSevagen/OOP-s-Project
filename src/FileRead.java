package img;
import java.io.*;
import java.util.Scanner;


public class FileRead {
	
	private static void searchforName() throws FileNotFoundException {
		File file = new File("testout.txt");
		Scanner kb = new Scanner(System.in);
		Scanner input = new Scanner(file);
		
		String name = kb.nextLine();
		
		
		while(input.hasNextLine()) {
			System.out.println(input.next(name));
		}
	}
	
	public static void main(String[] args) {
		searchforName();
	}
}
