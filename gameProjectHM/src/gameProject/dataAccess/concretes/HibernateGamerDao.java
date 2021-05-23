package gameProject.dataAccess.concretes;

import java.util.List;

import gameProject.dataAccess.abstracts.GamerDao;
import gameProject.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Hibernate ile eklendi. " + gamer.getNameSurname());
		
	}

	@Override
	public List<Gamer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
