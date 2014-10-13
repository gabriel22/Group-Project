import java.util.ArrayList;

public class InventoryManager {

	private String name;
	private double cost;
	private int quantity;

	public InventoryManager(String na, double c, int q) {
		name = na;
		cost = c;
		quantity = q;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getQuantity() {
		return quantity;
	}

	public static void main(String[] args) {
		
	
	}
	
	public static void averagePojo()
	{
		ArrayList<InventoryManager> inventory = new ArrayList<InventoryManager>();
		
		inventory.add(new InventoryManager("cheetos", 75, 10));
		inventory.add(new InventoryManager("Goldfish", 75, 10));
		inventory.add(new InventoryManager("pretzels", 50, 7));
		inventory.add(new InventoryManager("jolly_Ranchers", 60, 4));
		inventory.add(new InventoryManager("oatmeal_Cookie", 100, 12));
		inventory.add(new InventoryManager("snickers", 50, 8));
		inventory.add(new InventoryManager("Stride_Gum", 65, 3));
		inventory.add(new InventoryManager("Beef_Jerky", 140, 1));
		inventory.add(new InventoryManager("Chex Mix", 70, 1));
		inventory.add(new InventoryManager("Popcorn", 35, 6));
	}

}
