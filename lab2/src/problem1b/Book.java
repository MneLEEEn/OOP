package problem1b;

public class Book extends LibraryItem {
	private int numberOfPages;
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.numberOfPages = pages;
	}

	public int getNumberOfPages() { 
		return numberOfPages; 
		}
	
    public void setNumberOfPages(int pages) {
    	this.numberOfPages = pages; 
    	}
    
    @Override
    public String toString() {
        return super.toString() + ", Страниц: " + numberOfPages;
    }
	
}
