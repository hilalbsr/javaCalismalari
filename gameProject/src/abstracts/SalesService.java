package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {
	void add(Gamer gamer, Game game, Campaign campaign);

	void update(Gamer gamer, Game game, Campaign campaign);

	void delete(Gamer gamer, Game game, Campaign campaign);
}
