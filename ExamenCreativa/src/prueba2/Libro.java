package prueba2;

import java.sql.Date;

public class Libro {
	private int idLibro;
	private String nombre;
	private int a�o;
	private double precio;
	private Date fechaLanzamiento;
	private String editorial;

	public Libro() {

	}

	public Libro(int idLibro, String nombre, int a�o, double precio, Date fechaLanzamiento, String editorial) {
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.a�o = a�o;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
		this.editorial = editorial;
	}



	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
