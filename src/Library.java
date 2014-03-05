import acm.program.ConsoleProgram;

public class Library extends ConsoleProgram
{
	public void run()
	{
		ResizableArray books = new ResizableArray();
		books.add("abcs");
		books.add("123 learning number");
		books.add("dinosaurs");
		books.add("drawing for everyone");
		books.add("time to type"); //this will generate ArrayIndexOutofBoundsException if array isn't grown
		books.add("lemmings");
		
		books.remove("lemmings");
		
		for(int i = 0; i < books.size(); i++)
		{
			println(books.get(i));
		}
	}
}
