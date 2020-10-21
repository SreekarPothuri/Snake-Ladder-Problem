import java.util.Random;

public class SnakesAndLaddersGame{
	static int FirstPlayer=0;
	private static Random random = new Random();

	public void RollDie(){
		int roll = random.nextInt(6)+1;
		System.out.println("Position of First Player is "+FirstPlayer);
			if(FirstPlayer==100){
				System.out.println("First Player Won");
				System.exit(1);
			}
			else if(FirstPlayer+roll>100){
				System.out.println("Invalid Move");
				roll=0;
				FirstPlayer+=roll;
			}
			else{
				FirstPlayer+=roll;
				System.out.println("First Player rolled die of "+roll);
			}
	}
	public void game(){
		while(true){
			RollDie();
		}
	}
	public static void main(String args[]){
		System.out.println("*****WELCOME TO SNAKES AND LADDERS GAME*****");
		System.out.println("Position of First Player is at "+FirstPlayer);
		SnakesAndLaddersGame player = new SnakesAndLaddersGame();
		player.game();
	}
}
