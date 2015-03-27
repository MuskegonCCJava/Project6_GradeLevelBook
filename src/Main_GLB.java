// Main_GLB.java by Kyle Wolff and Brandon VanderMey on 3/24/2015

import java.util.Date;
import java.util.Scanner;

public class Main_GLB
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Textbook txtBook = new Textbook();
		
		Date date = new Date();
		System.out.println("Grade Level Book by Kyle Wolff and Brandon VanderMey on " + date);
		
		System.out.print("\nSet title: ");
		txtBook.setTitle(scanner.nextLine());
		
		System.out.print("Set Number of Pages: ");
		txtBook.setNumberOfPages(scanner.nextInt());
		scanner.nextLine();	//flushes buffer
		
		System.out.print("Set Grade Level: ");
		txtBook.setGradeLevel(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("\nTitle: " + txtBook.getTitle() + " | # of pages: " + txtBook.getNumberOfPages() + " | Grade Level: " + txtBook.getGradeLevel());
		
		scanner.close();	//	Closes the scanner resource.
		
	}
}
