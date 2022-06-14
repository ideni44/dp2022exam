package BackEnd.l;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	/**
	 * 
	 */

	@Entity
	@Table(name="now1")
	public class now  {
		@Id
		@GeneratedValue
	private int id;
	private String name4;
	private int lenght;
	
	
	public now(int id,String name4, int lenght) {
		super();
		this.id = id;
		this.name4 = name4;
		this.lenght = lenght;
	}
	
	
	
	
	public now() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return name4; 
	}
	public void setTitle(String name4) {
		this.name4 = name4;
	}
	public int getlenght() {
		return lenght;
	}
	public void setlenght(int lenght) {
		this.lenght = lenght;
		
	}
	
	@Override
	public String toString() {
		return "{\"id\": \""+id+"\",\"name4\":\""+name4+"\",\"lenght\":"+lenght+"\"}";
	}
}
