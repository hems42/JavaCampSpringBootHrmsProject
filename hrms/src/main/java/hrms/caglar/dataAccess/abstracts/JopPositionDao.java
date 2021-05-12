package hrms.caglar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.caglar.entities.concretes.JopPosition;

public interface JopPositionDao extends JpaRepository<JopPosition,Integer>{

}
