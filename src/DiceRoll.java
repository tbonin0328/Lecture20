import java.util.Scanner;
import acm.util.RandomGenerator;

public class DiceRoll 
{
	private Scanner in = new Scanner(System.in);
	RandomGenerator rGen = RandomGenerator.getInstance();
	
	public void play()
	{
		System.out.println("Dice Roll Time!");
		String status = "";
		
		while(playAgain())
		{
			System.out.println(roll());
		}
		System.out.println("Goodbye :(");
	}

	public String readLine(String prompt)
	{
		System.out.print(prompt);
		return in.nextLine();
	}
	
	public int roll()
	{
		return rGen.nextInt(6) + 1;
	}
	
	public boolean playAgain()
	{
		String answer = readLine("Ready to Roll...").toLowerCase();
		return answer.equals("y");
	}
	
	public int readInt(String prompt)
	{
		System.out.print(prompt);
		return in.nextInt();
	}
	
	public static void main(String[] args)
	{
		DiceRoll program = new DiceRoll();
		program.play();
	}
}
