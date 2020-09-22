public class SnakeLadder{
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	
	public static void main(String[] args){
		int pos_player1=0;
		int pos_player2=0;
		
		int min=1;
		int max=6;
		
		
		while(true){
			
			int first_player_value=(int)(Math.random()*(max-min+1)+min);
			//System.out.println("Dice value for player1:"+first_player_value);
			int choice1=(int)(Math.random()*(3)+0);
			//System.out.println("Choice for player 1:"+choice1);
			
			// if choice is ladder then player again rolls the dice ..
			while(choice1==LADDER)
				{    
				pos_player1=(pos_player1+first_player_value>100)?pos_player1:pos_player1+first_player_value;
					 if(pos_player1==100)
					 {
						 System.out.println("Winner is Player 1");
						 return;
					 }
					 
					 first_player_value=(int)(Math.random()*(max-min+1)+min);
					 choice1=(int)(Math.random()*(3)+0);
					 //System.out.println("Dice value for player 1:"+first_player_value);
					 
					 //System.out.println("Choice for player 1:"+choice1);
					 //System.out.println("Position of player 1:"+pos_player1);
				 
				}
			
				if(choice1==SNAKE)
					pos_player1=(pos_player1-first_player_value<0)?0:pos_player1-first_player_value;
				if(choice1==NO_PLAY)
					pos_player1=pos_player1+0;
				
				System.out.println("Position of player 1:"+pos_player1);
				
				
			
			if(pos_player1==100)
			{System.out.println("Winner is Player 1");
				return;
			}
			
			int second_player_value=(int)(Math.random()*(max-min+1)+min);
			int choice2=(int)(Math.random()*(3)+0);
			
			while(choice2==LADDER)
				{ pos_player2=(pos_player2+second_player_value>100)?pos_player2:pos_player2+second_player_value;
					 if(pos_player2==100)
					 {
						 System.out.println("Winner is Player 2");
						 return;
					 }
					 second_player_value=(int)(Math.random()*(max-min+1)+min);
					 choice2=(int)(Math.random()*(3)+0);
				 
				}
			
				if(choice2==SNAKE)
					pos_player2=(pos_player2-second_player_value<0)?0:pos_player2-second_player_value;
				if(choice2==NO_PLAY)
					pos_player2=pos_player2+0;
				
			
			if(pos_player2==100)
			{System.out.println("Winner is Player 2");
				return;
			}
			
			
			
		}
		
	}
}