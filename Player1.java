package PingPong;

public class Player1 {
	int x, y, width, height = 0;
	
	public Player1(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void printPlayer1() {
		Player1 p1 = new Player1(6,6,6,6);
		System.out.println(p1);
	}

}
