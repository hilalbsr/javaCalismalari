package gameProject.business.concretes;

import java.util.List;

import gameProject.business.abstracts.GamerService;
import gameProject.core.LoggerService;
import gameProject.dataAccess.abstracts.GamerDao;
import gameProject.entities.concretes.Gamer;
 
public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	private LoggerService loggerService;
	
	public GamerManager(GamerDao gamerDao,LoggerService loggerService) {
		super();
		this.gamerDao = gamerDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Gamer gamer) {
		
		gamerDao.add(gamer);
		this.loggerService.logToSystem("gamer eklendi" + gamer.getNameSurname());
		//HibernateGamerDao gm = new HibernateGamerDao();
		//gm.add(gamer);
	}

	@Override
	public List<Gamer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
