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
public class Trabajador extends Humano {
    private String sector;
    public Trabajador(){
        super();
        this.sector="Desconocido";
    }
    public Trabajador(String sector, String nombre, int edad, String sexo){
        super(nombre, edad, sexo);
        this.sector=sector;
    }
    /**
     * @return the sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(String sector) {
        this.sector = sector;
    }
}
