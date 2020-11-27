package org.sid.lightecomv1.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Category implements Serializable{
	
    private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String photo;
	private String description;
	@OneToMany(mappedBy="category")
	private Collection<Product> products;
	
	public Category(Long id, String name,String photo ,String description, Collection<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.description = description;
		this.products = products;
	}

   public Category() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

}
