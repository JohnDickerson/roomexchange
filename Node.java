import java.util.List;

public class Node {

	int occupancies; // number of available spaces in room
	int beds; // number of people who fit in room
	List <Profile> residents;
	
	public Node() {
		this.occupancies = 0; // must call addOccupancy after creating a Node to add to the swap
		this.beds = 2; // default is a double
	}
	
	public void addOccupancy() {
		this.occupancies -= 1;
	}
	
}
