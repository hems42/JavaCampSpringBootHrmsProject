package hrms.caglar.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;





@Entity
@Table(name="JopPositions")
@Data
@Getter
@Setter
public class JopPosition {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;

    @Column(name="positiondetail")
	private String positionDetail;


	@Column(name="positionname")
	private String positionName;

	
	
	
	
	

	public JopPosition() 
	{
	
	}
	



	public JopPosition(int id, String positionName, String positionDetail) {
	
		this.id = id;
		this.positionName = positionName;
		this.positionDetail = positionDetail;
	}
	
	
	
	
	









	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public String getPositionName() {
		return positionName;
	}








	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}








	public String getPositionDetail() {
		return positionDetail;
	}








	public void setPositionDetail(String positionDetail) {
		this.positionDetail = positionDetail;
	}
















}

