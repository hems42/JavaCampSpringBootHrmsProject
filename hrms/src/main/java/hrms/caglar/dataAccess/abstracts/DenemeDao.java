package hrms.caglar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.caglar.entities.concretes.Deneme;

public interface DenemeDao extends JpaRepository<Deneme, Integer>{

}
