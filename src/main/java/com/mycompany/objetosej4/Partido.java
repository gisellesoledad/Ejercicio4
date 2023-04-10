/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetosej4;

/**
 *
 * @author Win-5
 */
public class Partido {
    private Equipo equipo1;    //atributos
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    
    public Partido(){
        golesEquipo1=0;
        golesEquipo2=0;
    }
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2){
       this.equipo1 = equipo1;
       this.equipo2 = equipo2;
       this.golesEquipo1= golesEquipo1;
       this.golesEquipo2= golesEquipo2;     
    }

    public Equipo getEquipo1() {    //metodos
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
     public void calcularPuntosEquipo1 (){
        if (golesEquipo1>golesEquipo2){
            equipo1.sumarPuntaje(3);
        }else if (golesEquipo1==golesEquipo2){
            equipo1.sumarPuntaje(1);
        }
    }
    
    public void calcularPuntosEquipo2 (){
         if (golesEquipo2>golesEquipo1){
            equipo2.sumarPuntaje(3);
        }else if (golesEquipo2==golesEquipo1){
            equipo2.sumarPuntaje(1);
        }
    }
    
    public void actualizarGolesEquipo1 (){
        equipo1.sumarGolesAFavor(golesEquipo1);
        equipo1.sumarGolesEnContra(golesEquipo2);  
    }
    
    public void actualizarGolesEquipo2 (){
        equipo2.sumarGolesAFavor(golesEquipo2);
        equipo2.sumarGolesEnContra(golesEquipo1);  
    }
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
