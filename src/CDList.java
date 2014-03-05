import acm.program.ConsoleProgram;

public class CDList extends ConsoleProgram
{
	public void run()
	{
		Stack cds = new ResizableArray();
		cds.push("2 pac");
		cds.push("Spice Girls Greatest Hits");
		cds.push("TLC");
		cds.push("Purple Rain");
	
		while(!cds.isEmpty())
		{
			println(cds.pop());
		}	
	}
}
