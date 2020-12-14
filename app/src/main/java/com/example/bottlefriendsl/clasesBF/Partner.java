package com.example.bottlefriendsl.clasesBF;

public class Partner {

    private String nombre;
    private String apellido;
    private String empresa;
    private String email;
    private int tfno;
    private int imagen;


    Partner(String nombre, String apellido, String empresa, String email, String tfno, String imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.email = email;
        this.tfno = Integer.parseInt(tfno);
        this.imagen = Integer.parseInt(imagen);
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getTfno() {
        return tfno;
    }


    public void setTfno(int tfno) {
        this.tfno = tfno;
    }

    @Override
    public String toString() {

        return "nombre: " + nombre+ "\n"
                + "Apellidos: " + apellido + "Litros" + "\n"
                + "Empresa: " + empresa + "\n"
                + "Email: " + email+ "\n"
                + "Telefono: " + tfno;
    }
}