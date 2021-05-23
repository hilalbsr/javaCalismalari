import adapters.MernisServiceAdapter;
import concretes.GamerManager;
import concretes.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Hilal Büşra", "ASD", 1992, "22222222220");


		Game game = new Game();
		game.setGameName("Super Mario");
		game.setGamePrice(22);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		SalesManager salesManager = new SalesManager(new MernisServiceAdapter());
		salesManager.add(gamer, game, new Campaign(1, "2 al 1 ode", 35));
	}

}
