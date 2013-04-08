import javax.swing.JOptionPane;


public class TheGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		boolean invalidMove = true;
		boolean playerTurn = true;
		boolean compTurn = false;
		boolean bPlaying = true;
		String answer;
		
		do{
		
		String sBoard = "";
		
		String Cell1 = "1";
		String Cell2 = "2";
		String Cell3 = "3";
		String Cell4 = "4";
		String Cell5 = "5";
		String Cell6 = "6";
		String Cell7 = "7";
		String Cell8 = "8";
		String Cell9 = "9";
		String playerMove;

		
		int compMove;
		int turn=0;


			do{
			
			System.out.println(turn);

			do{
		
		sBoard = String.format(Cell1 + " | " + Cell2  + " | " + Cell3 + 
				"\n---|---|---\n" + 
				Cell4 + " | " + Cell5 + " | " + Cell6 + 
				"\n---|---|---\n" + Cell7 + " | " + Cell8 + " | " + Cell9);
		
		if (turn >5)
		{
			if (Cell1.equalsIgnoreCase("x") || Cell2.equalsIgnoreCase("X") || Cell3.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"Player Wins!!!\n " + sBoard);
			
			else if (Cell1.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell1.equalsIgnoreCase("x") || Cell4.equalsIgnoreCase("X") || Cell7.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell2.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell8.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell3.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell7.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell3.equalsIgnoreCase("x") || Cell6.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell4.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell6.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell7.equalsIgnoreCase("x") || Cell8.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
				JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
			
			else if (Cell1.equalsIgnoreCase("O") || Cell2.equalsIgnoreCase("O") || Cell3.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell1.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell1.equalsIgnoreCase("O") || Cell4.equalsIgnoreCase("O") || Cell7.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell2.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell8.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell3.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell7.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell3.equalsIgnoreCase("O") || Cell6.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell4.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell6.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else if (Cell7.equalsIgnoreCase("O") || Cell8.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
				JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
			
			else
				JOptionPane.showMessageDialog(null,"Its a tie");
			bPlaying = false;
			
			}
		
		playerMove = JOptionPane.showInputDialog(sBoard);
		
		compMove = (int)((Math.random()*9+1));
		
		if(playerTurn == true)
			turn++;
			{
		
		if (playerMove.equalsIgnoreCase("1"))
		{
			if (! Cell1.equals("1"))
				
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
			
				else
				{				
					Cell1 = "X";
					invalidMove = false;
					playerTurn = false;
					compTurn = true;
				}
				
		}
		
		else if (playerMove.equalsIgnoreCase("2"))
		{
			if (! Cell2.equalsIgnoreCase("2"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell2 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("3"))
		{
			if (! Cell3.equalsIgnoreCase("3"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell3 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("4"))
		{
			if (! Cell4.equalsIgnoreCase("4"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell4 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("5"))
		{
			if (! Cell5.equalsIgnoreCase("5"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell5 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("6"))
		{
			if (! Cell6.equalsIgnoreCase("6"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell6 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("7"))
		{
			if (! Cell7.equalsIgnoreCase("7"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell7 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if (playerMove.equalsIgnoreCase("8"))
		{
			if (! Cell8.equalsIgnoreCase("8"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell8 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}

		else if(playerMove.equalsIgnoreCase("9"))
		{
			if (! Cell9.equalsIgnoreCase("9"))
				JOptionPane.showMessageDialog(null, "Spot already taken. Please try again");
				else
				{
					Cell9 = "X";
				invalidMove = false;
				playerTurn = false;
				compTurn = true;
				}
		}
		
		else JOptionPane.showMessageDialog(null, "Thats is not a valid input");
		
			}
		
			System.out.println(turn);
			
		if(compTurn == true)
			turn++;
		{
			do{compMove = (int)((Math.random()*9+1));		
//----------------------------------------------------------------------------------------------------------------------------------------------------	
			
			if (compMove == 1)
			{
				if (! Cell1.equals("1"))
				
					compMove = (int)((Math.random()*9+1));
				
					else
					{				
						Cell1 = "O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
					}
					
			}
			
			else if (compMove == 2)
			{
				if (! Cell2.equalsIgnoreCase("2"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell2 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 3)
			{
				if (! Cell3.equalsIgnoreCase("3"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell3 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 4)
			{
				if (! Cell4.equalsIgnoreCase("4"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell4 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 5)
			{
				if (! Cell5.equalsIgnoreCase("5"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell5 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 6)
			{
				if (! Cell6.equalsIgnoreCase("6"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell6 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 7)
			{
				if (! Cell7.equalsIgnoreCase("7"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell7 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 8)
			{
				if (! Cell8.equalsIgnoreCase("8"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell8 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			}
			
			else if (compMove == 9)
			{
				if (! Cell9.equalsIgnoreCase("9"))

					compMove = (int)((Math.random()*9+1));
				
					else
					{
						Cell9 = "O";
					invalidMove = false;
					playerTurn = true;
					compTurn = false;
					}
			
			}
			
			System.out.println(turn);	
		
			}while(compTurn == true);
				
			System.out.println(turn);
			
		}
			
			}while(invalidMove);
			
		}while(bPlaying);
		
		answer = JOptionPane.showInputDialog ("Would you like to try again? Y or N?");
		
	}while(answer.equalsIgnoreCase("y"));
	
	}

}


//----------------------------------------------------------------------------------------------------------------------------------------------------			
/*			
				if (compMove == 1)
				{
					if (Cell1.equals("1"))
					{
						Cell1="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
					}
				}
				
				else if (compMove == 2)
				{
					if (Cell2.equals("2"))
					{
						Cell2="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 3)
				{
					if (Cell3.equals("3"))
					{
						Cell3="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 4)
				{
					if (Cell4.equals("4"))
					{
						Cell4="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 5)
				{
					if (Cell5.equals("5"))
					{
						Cell5="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 6)
				{
					if (Cell6.equals("6"))
					{
						Cell6="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 7)
				{
					if (Cell7.equals("7"))
					{
						Cell7="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 8)
				{
					if (Cell8.equals("8"))
					{
						Cell8="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
				
				else if (compMove == 9)
				{
					if (Cell9.equals("9"))
					{
						Cell9="O";
						invalidMove = false;
						playerTurn = true;
						compTurn = false;
						
					}
				}
*/		





/*
sBoard = String.format(Cell1 + " | " + Cell2  + " | " + Cell3 + 
		"\n---|---|---\n" + 
		Cell4 + " | " + Cell5 + " | " + Cell6 + 
		"\n---|---|---\n" + Cell7 + " | " + Cell8 + " | " + Cell9);

if (turn >5)
{
	if (Cell1.equalsIgnoreCase("x") || Cell2.equalsIgnoreCase("X") || Cell3.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"Player Wins!!!\n " + sBoard);
	
	else if (Cell1.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell1.equalsIgnoreCase("x") || Cell4.equalsIgnoreCase("X") || Cell7.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell2.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell8.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell3.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell7.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell3.equalsIgnoreCase("x") || Cell6.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell4.equalsIgnoreCase("x") || Cell5.equalsIgnoreCase("X") || Cell6.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell7.equalsIgnoreCase("x") || Cell8.equalsIgnoreCase("X") || Cell9.equalsIgnoreCase("X"))
		JOptionPane.showMessageDialog(null,"PLAYER WINS!!!\n " + sBoard);
	
	else if (Cell1.equalsIgnoreCase("O") || Cell2.equalsIgnoreCase("O") || Cell3.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell1.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell1.equalsIgnoreCase("O") || Cell4.equalsIgnoreCase("O") || Cell7.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell2.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell8.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell3.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell7.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell3.equalsIgnoreCase("O") || Cell6.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell4.equalsIgnoreCase("O") || Cell5.equalsIgnoreCase("O") || Cell6.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else if (Cell7.equalsIgnoreCase("O") || Cell8.equalsIgnoreCase("O") || Cell9.equalsIgnoreCase("O"))
		JOptionPane.showMessageDialog(null,"COMPUTER WINS!!!\n " + sBoard);
	
	else
		JOptionPane.showMessageDialog(null,"Its a tie");
	bPlaying = false;
	
	}
*/