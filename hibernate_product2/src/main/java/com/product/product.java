package com.product;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_hibernate")
public class product implements Serializable {
	 private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

@Column(name="name")
String name;

@Column(name="price")
String price;

@Column(name="country")
String country;

@Column(name="aboutit")
String aboutit;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getAboutit() {
	return aboutit;
}

public void setAboutit(String aboutit) {
	this.aboutit = aboutit;
}

@Override
public String toString() {
	return "product [id=" + id + ", name=" + name + ", price=" + price + ", country=" + country + ", aboutit=" + aboutit
			+ "]";
}


}
