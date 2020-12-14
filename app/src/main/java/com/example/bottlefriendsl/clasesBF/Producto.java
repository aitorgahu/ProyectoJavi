package com.example.bottlefriendsl.clasesBF;

public class Producto {

    private int id_producto;
    private String nom_producto;
    private String descripcion;
    private int precio;
    private String tipo;
    private double capacidad;
    private int imagen;
    private final String ESTADO = "Disponible";
    private final double IVA = 0.21;

    public Producto(String nom_producto, String capacidad, String tipo, String precio, String descripcion, String imagen) {

        this.nom_producto = nom_producto;
        this.descripcion = descripcion;
        this.precio = Integer.parseInt(precio);
        this.tipo = tipo;
        this.capacidad = Double.parseDouble(capacidad);
        this.imagen = Integer.parseInt(imagen);
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return (int) (precio + (precio * IVA));
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getIVA() {
        return IVA;
    }

    public String getESTADO(){return ESTADO;}

    public String toString() {

        return "nombre: "+nom_producto+"\n"
                +"Capacidad: "+capacidad+ "Litros"+"\n"
                +"Tipo: "+tipo+"\n"
                +"Precio: "+precio+"\n"
                +"Descripcion: "+descripcion;
        }
}
