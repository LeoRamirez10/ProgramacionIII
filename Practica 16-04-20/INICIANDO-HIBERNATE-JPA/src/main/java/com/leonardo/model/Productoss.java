package com.leonardo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productoss database table.
 * 
 */
@Entity
@Table(name= "productoss")
@NamedQuery(name="Productoss.findAll", query="SELECT p FROM Productoss p")
public class Productoss implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cantidadProducto;

	private String nombreProducto;

	private double precioProducto;

	private double totalProducto;

	public Productoss() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return this.precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalProducto() {
		return this.totalProducto;
	}

	public void setTotalProducto(double totalProducto) {
		this.totalProducto = totalProducto;
	}

	@Override
	public String toString() {
		return "Productoss [id=" + id + ", cantidadProducto=" + cantidadProducto + ", nombreProducto=" + nombreProducto
				+ ", precioProducto=" + precioProducto + ", totalProducto=" + totalProducto + "]";
	}

}