package gameProject.business.abstracts;

import java.util.List;

import gameProject.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	List<Gamer> getAll();
}
