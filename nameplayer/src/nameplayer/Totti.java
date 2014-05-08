package nameplayer;

import java.awt.Frame;
import java.util.Arrays;

public class Totti {
	private String name;
	private String position;
	private String friend[];

	public Totti () {

		name = "Totti ";
		position = "Striker";
		friend = new String[]{"De rossi","Banatia","Juan","Destro"};

		System.out.println("My name is Totti ");
		System.out.println("I am : "+name);
		System.out.println("Position : "+position);
		System.out.println("Friend : "+Arrays.toString(friend));
	}

	public Totti (int n) {
		System.out.println("My name is Totti  1");

	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String[] getFriend() {
		return friend;
	}

}
