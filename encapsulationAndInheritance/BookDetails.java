package encapsulationAndInheritance;

public class BookDetails {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.setBookNo(555);
		b1.setAuthor("Raj");
		b1.setTitle("English Grammar");
		b1.setPrice(500);
		
		EngineeringBook en=new EngineeringBook();
		
		en.setBookNo(525);
		en.setAuthor("Brian Karnegain");
		en.setPrice(2000);
		en.setTitle("The C Programing Language");
		en.setCategory("CSE");
		
		System.out.println("Book No  : "+en.getBookNo());
		System.out.println("Title    : "+en.getTitle());
		System.out.println("Author   : "+en.getAuthor());
		System.out.println("Category : "+en.getCategory());
		System.out.println("Price    : "+en.getPrice());
	}

}
