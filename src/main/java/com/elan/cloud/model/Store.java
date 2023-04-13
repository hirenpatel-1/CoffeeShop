package com.elan.cloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** 
 * This class is Store model.
 * @author hiren.patel
 *
 */

@Entity
@Table(name = "stores")
public class Store {

	private long id;
	private String storeName;	
	private String coffeeName;
	
	public Store() {
		
	}
		
	public Store(String storeName, String coffeeName) {
		this.storeName = storeName;
		this.coffeeName = coffeeName;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "store_name", nullable = false)
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	
	@Column(name = "coffee_name", nullable = false)
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", coffeeName=" + coffeeName + "]";
	}
	
}
