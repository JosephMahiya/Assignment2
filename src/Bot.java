import java.util.Scanner;
public class Bot 
{
	
	String nameBot;
	String politicalinclination;
	String message;
	
	Bot()
	{
		nameBot = "proTrump";
		politicalinclination= "republican";
		message="vote trump";
		
	}
	
	Bot(String name, String political, String message)
	{
		this.nameBot = name;
		this.politicalinclination= political;
		this.message = message;
		
	}
	public static void main(String args []) 
	{
		Scanner keyboard = new Scanner (System.in);
		Bot botA=new Bot();
		System.out.println("This is bot A");
		
		
		System.out.println("Name of bot A:" + botA.nameBot);
		System.out.println("This is bot B");
		Bot botB=new Bot();
		Bot botC=new Bot();
		System.out.println("The name of Bot B:" +botB.nameBot);
		
		//creating new bot
		Bot botd = new Bot();
		
		
		
		botA.nameBot="Pepe";
		botB.nameBot="Blaze";
		botC.nameBot="Root";
	
		System.out.println("Name of Fancy Bot:" + fancyBot.nameBot);
		Bot ControlBot=new Bot ("Control");
		System.out.println("Name of Control Bot:" + ControlBot.nameBot);
		Bot MachineBot=new Bot ("Machine");
		System.out.println("Name of Machine Bot:" + MachineBot.nameBot);
		
		String languageUser = new String("english");
		System.out.println("Language" + languageUser);
		if (languageUser.equalsIgnoreCase("english"))
		{
			System.out.println("Welcome");
			
		}
		else 
		{
			System.out.println("Sorry I can only speak english");
		}
				
		
		
		
		
		
		
		
	
		
		
		
		
		}
	
	

}
