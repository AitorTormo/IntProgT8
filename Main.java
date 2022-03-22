package com.java;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(33);
        int edad = persona.getEdad();
        System.out.println(edad);

        persona.setNombre("Aitor");
        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setTelefono(666777888);
        int telefono = persona.getTelefono();
        System.out.println(telefono);




    }
}

class Persona{

    private int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }


    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


    private int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

