package nameplayer;

public class Callplayer {

		public static void main(String[] args) {
			Totti obj = new Totti();
			Totti obj1 = new Totti(1);
			String name = obj.getName();
			String position = obj.getPosition();
			String friend[] = obj.getFriend();
		}
}
