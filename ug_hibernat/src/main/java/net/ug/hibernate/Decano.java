package net.ug.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Decano")
public class Decano {
	@Id
	@Column(name = "cod_decano")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cedula")
	private String dni;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellidos")
	private String lastName;
	
	@Column(name = "celular")
	private String cellphone;

	public Decano() {
		super();
	}

	public Decano(long id, String dni, String name, String lastName, String cellphone) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.cellphone = cellphone;
	}
	public void imprimir() {
		System.out.println(name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	
	
	
}
