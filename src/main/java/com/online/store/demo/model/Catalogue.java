package com.online.store.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @author rasrivastava
 *
 */
@SuppressWarnings("unused")
@Entity
@Data
@EqualsAndHashCode (exclude = "id")
@ToString
public class Catalogue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column
    private Double price;
    
    public Catalogue() {
		super();
	}

    public Catalogue(String name, Double price) {
        this.name = name;
        this.price = price;
    }

	@Override
	public String toString() {
		return "Catalogue [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
    
}