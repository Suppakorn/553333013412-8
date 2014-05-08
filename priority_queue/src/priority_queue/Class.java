package priority_queue;

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		BinaryHeap bh = new BinaryHeap();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Your input : ");
			Object a = sc.nextLine();
			if(a.equals("-")){
				bh.deQueue();
			}else{
				bh.enQueue(Integer.parseInt((String) a));
			}
			System.out.println(bh);

		}			
}
}
