package gameProject.dataAccess.abstracts;

import java.util.List;

import gameProject.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	List<Gamer> getAll();
}
