package info.osokwik.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Manufacture {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToMany
	private List<Model> models = new ArrayList<Model>();
	
	public Manufacture() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
