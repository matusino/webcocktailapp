package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_ingredients", schema = "co")
public class TIngredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_ingrediends_seq")
	@SequenceGenerator(name = "t_ingrediends_seq", sequenceName = "co.t_ingredients_ingrediend_id_seq",allocationSize = 1,initialValue = 0)
	@Column(name = "ingrediend_id", nullable = false)
	private Long ingrediendId;
	@Column(name = "name", nullable = false)
	private String name;
	public TIngredient() {
		super();
	
	}
	public Long getIngrediendId() {
		return ingrediendId;
	}
	public void setIngrediendId(Long ingrediendId) {
		this.ingrediendId = ingrediendId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
