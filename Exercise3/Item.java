package Exercise3;

 abstract class Item {
	 private
	 int UIN,noc;
	 String title;
	public Item(int uIN, int noc, String title) {
		super();
		UIN = uIN;
		this.noc = noc;
		this.title = title;
	}
	public int getUIN() {
		return UIN;
	}
	public void setUIN(int uIN) {
		UIN = uIN;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 
	 
	 
}
 
  class WrittenItem extends Item{
	  private
	  String author;

	public WrittenItem(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	 
 }
  
  abstract class Book extends WrittenItem{

	public Book(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	  
  }
  
  abstract class JournalPaper extends WrittenItem{
	  private
	  int yearPublished;

	public JournalPaper(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	  
  }
  abstract class MediaItem extends Item{

	public MediaItem(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	  
  }
  class Video extends MediaItem{
	  private
	  String director, genre;
	  int yearrel;

	public Video(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	  
  }
  class CD extends MediaItem{
	  private
	  String artist,genre;

	public CD(int uIN, int noc, String title) {
		super(uIN, noc, title);
		// TODO Auto-generated constructor stub
	}
	  
  }
