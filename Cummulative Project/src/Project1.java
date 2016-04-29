import java.util.Scanner;

public class Project1
	{

		public static void main(String[] args)
			{
				  
				Scanner userInput=new Scanner(System.in);
				    System.out.println("What is your name?");
				    String name=userInput.nextLine();
				    String [] compliments={", You are pretty!",", You are smart!",", I like your eyes!", ", I like your shoes!"};
					int randomNumber=(int)(Math.random()*4);
				    System.out.println("Nice to meet you, "+ name + compliments[randomNumber]);
				   
				 
				    System.out.println("How many choices do you have?");
				    Scanner userInput2=new Scanner(System.in);
				    int numberOfOptions=userInput2.nextInt();
				    String [] choices=new String [numberOfOptions];
				   
				
				  
				   
				    Scanner userInput3=new Scanner(System.in);
					for(int i=0;i<numberOfOptions;i++)
						
					{
						System.out.println("Type your option");
						choices[i]=userInput3.nextLine();
						
						
					}
					
					
					
					System.out.println("my options are " + numberOfOptions);
					int randomNumber1=(int)(Math.random()*numberOfOptions);
					System.out.println(name + " You should pick "+ choices[randomNumber1]);
					
					 
			}

	}
