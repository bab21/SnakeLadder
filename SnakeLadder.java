public class SnakeLadder{
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args){
		
		System.out.println("SnakeLadder game");
		int pos_player1=0;
		
		int min=1;
		int max=6;
		
		
		// first_player_value is dice played by fisrt player
		int first_player_value=(int)(Math.random()*(max-min+1)+min);
		// choice1  is player 1 for any number between 0-2 
		int choice1=(int)(Math.random()*(3)+0);
		
		
	}
}