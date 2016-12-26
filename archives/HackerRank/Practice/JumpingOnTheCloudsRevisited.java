import java.util.*;


public class JumpingOnTheCloudsRevisited {
	public static class Node implements Comparable<Node> {
		int id;
		int energyLevel;

		public Node(int id, int energyLevel) {
			this.id = id;
			this.energyLevel = energyLevel;
		}

		public int compareTo(Node other) {
			return Integer.compare(this.energyLevel, other.energyLevel);
		}
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] isThundercloud = new boolean[n];
		for (int i=0 ; i<n ; i++) isThundercloud[i] = (sc.nextInt() == 1);

		// System.out.println("" + n + " " + k);
		// System.out.println(Arrays.toString(hasEnergy));


		int location = 0;
		int energy = 100;

		do {
			location = (location + k) % n;
			energy = (energy - 1) - (isThundercloud[location] ? 2 : 0);
			// System.out.println(location + " " + energy);
		} while(location != 0);
		
		System.out.println(energy);
	}
}