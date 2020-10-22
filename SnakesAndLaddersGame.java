import java.util.Random;

public class SnakesAndLaddersGame{
	static int FirstPlayer=0;
	private static Random random = new Random();

	public void rollDie(){
		int roll = random.nextInt(6)+1;
		System.out.println("Position of First Player is "+FirstPlayer);
		if(FirstPlayer==100){
			System.out.println("First Player Won");
			System.exit(1);
		}else if(FirstPlayer+roll>100){
			System.out.println("Invalid Move");
			roll=0;
			FirstPlayer+=roll;
		}else{
			FirstPlayer+=roll;
			System.out.println("First Player rolls a die of "+roll);
		}
	}

	public void snakes(){
		/* 17-7 54-34 62-19 64-60 87-24 93-73 95-75 99-78*/
		if(FirstPlayer==17){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=7;
		}
		if(FirstPlayer==54){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=34;
		}
		if(FirstPlayer==62){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=19;
		}
		if(FirstPlayer==64){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=60;
		}
		if(FirstPlayer==87){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=24;
		}
		if(FirstPlayer==93){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=73;
		}
		if(FirstPlayer==95){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=75;
		}
		if(FirstPlayer==99){
			System.out.println("Opps!,You Landed on Snake");
			FirstPlayer=78;
		}
	}
	public void ladders(){
		/* 4-14  9-31  20-38 28-84 40-59 51-67 63-81 71-91 */
		if(FirstPlayer==4){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=14;
		}
		if(FirstPlayer==9){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=31;
		}
		if(FirstPlayer==20){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=38;
		}
		if(FirstPlayer==28){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=84;
		}
		if(FirstPlayer==40){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=59;
		}
		if(FirstPlayer==51){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=67;
		}
		if(FirstPlayer==63){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=81;
		}
		if(FirstPlayer==71){
			System.out.println("Yay!,You Landed on Ladder");
			FirstPlayer=91;
		}
	}
	public void game(){
		while(true){
			rollDie();
			snakes();
			ladders();
		}
	}
	public static void main(String args[]){
		System.out.println("*****WELCOME TO SNAKES AND LADDERS GAME*****");
		SnakesAndLaddersGame player = new SnakesAndLaddersGame();
		player.game();
	}
}
