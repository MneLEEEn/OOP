package problem1b;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public void setValues(String t, String a, int year) {
		this.title = t;
		this.author = a;
		this.publicationYear = year;
	}
	
	public String getValues() {
		String info = "Book's title: " + title + ".\n" + "Book's author: " + author + ".\n" + "Book's publication year: " + publicationYear + ".\n" ;
		return info;
	}
	
	public LibraryItem(String t, String a, int year) {
		setValues(t, a, year);
		System.out.println(getValues());
	}
	
    public String toString() {
        return String.format("Title: %s, Author: %s, Year of publication: %d", title, author, publicationYear);
    }
}
