/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Carlos Montes Leyva
 */
public class Humano {
    private String nombre;
    private int edad;
    private String sexo;
    public Humano(){
       this.nombre="Desconocido";
       this.edad=0;
       this.sexo="Desconocido ";
    }
    public Humano(String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
