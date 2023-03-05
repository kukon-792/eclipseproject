package polymorphism;

public class FoodApp {
	public void food() {
		System.out.println("food App");
	}
	
}
	class Ubereat extends FoodApp{
		public void food() {
			System.out.println("food from ubereat");
		}
}
	class Doordesh extends FoodApp{
		public void food() {
			System.out.println("food from doordesh");
		}
}
	class Grabhub extends FoodApp{
		public void food() {
			System.out.println("food from grabhub");
	
		}
	
}
	
	
	

	

