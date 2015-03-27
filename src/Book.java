//	Book.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

public class Book
{
	private String title;
	private int numberOfPages;
	
	public Book()
	{
		System.out.println("In Book class.");
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
}
