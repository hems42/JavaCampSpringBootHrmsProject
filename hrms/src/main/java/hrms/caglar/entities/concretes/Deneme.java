package hrms.caglar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "[Deneme]")
public class Deneme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;


	@Column(name="surname")
	private String surname;
	
	@Column(name="age")
	private int age;


	@Column(name="detail")
	private String detail;


	
	
	
	public Deneme() {
		super();
	}





	public Deneme(int id, String name, String surname, int age, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.detail = detail;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getSurname() {
		return surname;
	}





	public void setSurname(String surname) {
		this.surname = surname;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getDetail() {
		return detail;
	}





	public void setDetail(String detail) {
		this.detail = detail;
	}




	






}
