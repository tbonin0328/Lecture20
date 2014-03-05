import java.util.Scanner;


public class HelloWorld 
{
	private Scanner in = new Scanner(System.in);
	
	public void play()
	{
		System.out.println("Welcome!");
		String firstName = readLine("Enter first name: ");
		System.out.println("Hi " + firstName + "!!");
	}

	public String readLine(String prompt)
	{
		System.out.print(prompt);
		return in.nextLine();
	}
	
	public static void main(String[] args)
	{
		HelloWorld program = new HelloWorld();
		program.play();
	}
}
