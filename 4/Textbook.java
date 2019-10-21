
public class Textbook 
{
	private String title;
	private String author;
	private String publisher;
	
	public Textbook(String Title, String Author, String Publisher)
	{
		title = Title;
		author = Author;
		publisher = Publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString()
	{
		return "Title: " + title +
				", Author: " + author +
				", Publisher: " + publisher;
	}
}
