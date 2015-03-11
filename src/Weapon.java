
class Weapon extends Equipment{

	int minDmg; // How much additional Minimum Damage is added to the player
	int maxDmg; // How much additional Minimum Damage is added to the player
	
	public Weapon(String name, int minDmg, int maxDmg, int health, int intelligence, int dexterity,
			int strength, int speed, double protection, double accuracy,
			double dodge, int price) {
		super(name, health, intelligence, dexterity, strength, speed, protection,
				accuracy, dodge, price);
		this.minDmg = minDmg;
		this.maxDmg = maxDmg;
	}
	
	public int getMinDmg() {
		return minDmg;
	}
	public int getMaxDmg() {
		return maxDmg;
	}
	
	private void printDmg(){
		System.out.println("Damage: \t" + getMinDmg() + " - " + getMaxDmg());
	}
	
	void printStats(){
		printName();
		printDmg();
		super.printStatBonuses();
		super.printPrice();
	}
}
