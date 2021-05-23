package gameProject;

import gameProject.business.abstracts.GamerService;
import gameProject.business.concretes.GamerManager;
import gameProject.core.JLoggerManagerAdapter;
import gameProject.dataAccess.concretes.AbcGamerDao;
import gameProject.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {

		
		//GamerService gamerService = new GamerManager(new HibernateGamerDao());
		GamerService gamerService = new GamerManager(new AbcGamerDao(), new  JLoggerManagerAdapter());
		
		Gamer gamer = new Gamer();
				
		gamerService.add(gamer);		
	}

}
