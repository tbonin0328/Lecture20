import acm.program.ConsoleProgram;

public class Line extends ConsoleProgram
{
	public void run()
	{
		Queue people = new ResizableArray();
		people.enqueue("Amy");
		people.enqueue("Bob");
		people.enqueue("Carl");
		people.enqueue("Dan");
		
		//then loop through and display the list  of people
		
		while(!people.isEmpty())
		{
			println(people.dequeue());
		}
	}
}
