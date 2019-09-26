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
public class Practicante extends Trabajador{
    private String matricula_pract;
    private int tiempo_cubrir;
    public Practicante(){
        super();
        this.matricula_pract="No generada";
        this.tiempo_cubrir=0000;
    }
    public Practicante(String matricula_pract,int tiempo_cubrir, String sector
                        ,String nombre, int edad, String sexo){
        super(sector, nombre, edad, sexo);
        this.matricula_pract=matricula_pract;
        this.tiempo_cubrir=tiempo_cubrir;
    }

    /**
     * @return the matricula_pract
     */
    public String getMatricula_pract() {
        return matricula_pract;
    }

    /**
     * @param matricula_pract the matricula_pract to set
     */
    public void setMatricula_pract(String matricula_pract) {
        this.matricula_pract = matricula_pract;
    }

    /**
     * @return the tiempo_cubrir
     */
    public int getTiempo_cubrir() {
        return tiempo_cubrir;
    }

    /**
     * @param tiempo_cubrir the tiempo_cubrir to set
     */
    public void setTiempo_cubrir(int tiempo_cubrir) {
        this.tiempo_cubrir = tiempo_cubrir;
    }
    @Override
    public String toString(){
        String mensaje="Mi nombre es "+Practicante.super.getNombre()+" tengo "
                +Practicante.super.getEdad()+" años, soy "+Practicante.super.getSexo()
                +", mi sector es "+Practicante.super.getSector()+
                " y tengo que cubrir "+tiempo_cubrir+" horas";
        return getClass().getName() + "@" + hashCode();
    }
}
