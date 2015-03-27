//	Textbook.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

public class Textbook extends Book
{
	private int gradeLevel;
	
	public Textbook()
	{
		System.out.println("In Textbook class.");
	}
	
	public void setGradeLevel(int gradeLevel)
	{
		this.gradeLevel = gradeLevel;
	}
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}
}
