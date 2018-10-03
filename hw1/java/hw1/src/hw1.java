import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess = 0;
		int ans = 0, min = 0, max = 0;
		Scanner scanner = null;
		try
		{
			//Read file
			FileReader inputFile = new FileReader("input.txt");
			Scanner in = new Scanner(inputFile);
			min = in.nextInt();
			max = in.nextInt();
			ans = in.nextInt();
			
			
		scanner = new Scanner(System.in);
			
		}
		catch(IOException e)
		{
			System.out.println("File fail!!");
		}
			//Start guess
			while(guess!=ans)
			{
				
				if (guess == ans) break;
				else if (guess > min && guess < max || guess == 0)
				{
					if(guess < ans && guess != 0) min = guess; 
					else if(guess != 0) max = guess;
					System.out.println("Please enter a number between " + min + " and " + max);
				}else
				{
					
					System.out.println("Your enter number not in range " + min + " and " + max);
					System.out.println("Please try again !!");
				}
				
				String input = scanner.next();
				try 
				{
					guess =  Integer.parseInt(input);
				} 
				catch(Exception e) {
					guess = 0;
					System.out.println("error input..., please enter a number...");
					continue;
				} 

			}
			System.out.println("Bingo!!!");
			
		
		
	}

}
