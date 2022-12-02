
public class ComputerPlayer extends Player{
	private final int MIN_POINTS = 15;
	
	public ComputerPlayer(){
		super("R2D2");
		myName="R2D2";
		//#5 for when the name is called again, it will be set to this
	}

	@Override
	/*
	 *Computer will stop rolling if:
	 *	- It doesn't have 15 points yet (or MIN_POINTS)
	 *	- Stopping will win the game.
	 */
	public boolean rollAgain(int totalSoFar) {
		return (myScore + totalSoFar)<100 && totalSoFar < MIN_POINTS;
	}
}
