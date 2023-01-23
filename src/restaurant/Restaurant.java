package restaurant;

import entity.EntityManager;

public class Restaurant {
	private final String name;
	private int seats;
	private EntityManager entityManager;
	private int money;
	private int score;
	
	private static Restaurant instance;
	
	private Restaurant(String name) {
		super();
		this.name = name;
		this.seats = 4;
		this.entityManager = new EntityManager();
		entityManager.generateNewChef(2);
		this.money = 1300;
		this.score = 0;
	}
	
	public static Restaurant getInstance(String name) {
		if(instance == null) instance = new Restaurant(name);
		return instance;
	}
	
	public void update() {
		entityManager.update();
	}
	
	public void printStats() {
		System.out.println();
		System.out.println("Status");
		System.out.println("Money : " + money);
		System.out.println("Score : " + score);
		System.out.println("Size  : " + seats);
		System.out.println();
	}
	
	public void printHeader() {
		System.out.printf("Restaurant '%s' is on Business!\n", name);
	}
	
	public void printRestaurant() {
		entityManager.printStatus();
	}

	public String getName() {
		return name;
	}
	
}
