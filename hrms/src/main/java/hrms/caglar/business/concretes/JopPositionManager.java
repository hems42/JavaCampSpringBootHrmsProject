package hrms.caglar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.caglar.business.abstracts.JopPositionService;
import hrms.caglar.dataAccess.abstracts.JopPositionDao;
import hrms.caglar.entities.concretes.JopPosition;

@Service
public class JopPositionManager implements JopPositionService {

    @Autowired
	private JopPositionDao jopPositionDao;

	@Override
	public List<JopPosition> getAll() {
		// TODO Auto-generated method stub
		return jopPositionDao.findAll();
	}
	
     
    
}
