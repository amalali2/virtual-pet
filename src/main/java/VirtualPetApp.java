import java.util.Scanner;

public class VirtualPetApp {

public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet duck = new VirtualPet();
		
		System.out.println("Dory the Duck" );
		System.out.println("Sleep: " + duck.sleep);
		System.out.println("Hunger: " + duck.hunger );
		System.out.println("Happiness: " +duck.play);
		System.out.println("");
		
		while (true) {
			
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Dory.");
			System.out.println("2. Play with Dory.");
			System.out.println("3. Put Dory to sleep");
			System.out.println("");
			
			int playing = input.nextInt();
			
			  switch (playing) {
			  case 1:
				  if (duck.isHungry()) {
					  System.out.println("What would you like to feed her, bread or corn?");
						String food = input.next();
						if (food.toLowerCase().equals("corn")) {
							duck.hungry();
							System.out.println("You fed Dory some corn!");
							System.out.println("Dory's hunger level is now: " + duck.hunger);
						} else if (food.toLowerCase().equals("bread")) {
							System.out.println("Bread is not good for Dory's health. Are youe sure you don't want to feed her corn?");
						}
				  } else {
					System.out.println("Fiona isn't hungry right now. Just because the bread is free, doesn't mean she has to eat it.");
							
							
							break;
				  }
			  case 2:
				  if (duck.isBored()) {
					duck.boredom();
					System.out.println("You played with Dory!");
					System.out.println("Fiona's thirst level is now: " + duck.play);
				  } else {
					System.out.println("Dory doesn't feel like playing right now.");
				  }
					break;
			 
			  case 3:
				  if (duck.isSleepy()) {
					duck.sleep();
					System.out.println("You sang Dory to sleep!");
					System.out.println("Dory's fatigue level is now: " + duck.sleep);
				  } else {
					System.out.println("Dory isn't tired, she wants to stay awake!");
				  }
					break;
			  		
			  }
		}
}
}
	
			
		
		
	
//			System.out.println("If you'd like to see Fiona's full status at the end of the day, type 'status', if you'd like a list of options type 'list'.");
//				String options = input.next();
//				if (options.toLowerCase().equals("status")) {
//					System.out.println("Here is Fiona's updated status:");
//					System.out.println("Sleep: " );
//					System.out.println("Hunger: " );
//					System.out.println("Happiness: ");
//					System.out.println("");
//				}
//				
//				 else if (options.toLowerCase().equals("list")) {
//					System.out.println("What would you like to do?");
//					System.out.println("What do you want to do?");
//					System.out.println("1. Put Dory to to sleep.");
//					System.out.println("2. Feed Dory.");
//					System.out.println("3. Play with Dory");
					
				 
		
		


			
