import java.util.Random;

public class VirtualPet<rand> {

	Random rand = new Random();
	
	int playing;
	int tickUpdt = rand.nextInt(20) + 1;
	int hunger = rand.nextInt(20) + 1;
	int play = rand.nextInt(20) + 1;
	int sleep = rand.nextInt(20) + 1;

	public void hungry() {
			hunger = hunger - 20;
			play = play + 20;
			sleep = sleep - 10;
			}
 
		public void boredom() {
				play = play - 20;
				sleep = sleep - 10;
				}
		
		public void sleep() {
				sleep = sleep - 20;
				play = play - 10;
				}
			
		boolean isHungry() {
			return hunger >= 5;
		}
		boolean isBored() {
			return play >= 5;
		}
		boolean isSleepy() {
			return sleep >= 5;
		}
		void tick() {
			hunger = hunger + 5;
			play = play + 5;
			sleep = sleep + 5;
		
		}}
		
		

		
		

