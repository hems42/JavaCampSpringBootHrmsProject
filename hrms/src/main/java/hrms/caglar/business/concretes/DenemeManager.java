package hrms.caglar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.caglar.business.abstracts.DenemeService;
import hrms.caglar.dataAccess.abstracts.DenemeDao;
import hrms.caglar.entities.concretes.Deneme;

@Service
public class DenemeManager implements DenemeService{
	
	@Autowired
	private DenemeDao  denemeDao;

	@Override
	public List<Deneme> getAll() {
		// TODO Auto-generated method stub
		return denemeDao.findAll();
	}

}
