public class Player1 {
	int x, y = 0;
	int width = 25;
	int height = 75;
	
	public Player1(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getPlayer1X() {
		return this.x;
	}

	public int getPlayer1Y() {
		return this.y;
	}

	public int getPlayer1Width() {
		return this.width;
	}

	public int getPlayer1Height() {
		return this.height;
	}

	public int changePlayerX(int amountToChange) {
		this.x += amountToChange;

		return this.x;
	}
	public int changePlayerY(int amountToChange) {
		this.y += amountToChange;

		return this.y;
	}


}
