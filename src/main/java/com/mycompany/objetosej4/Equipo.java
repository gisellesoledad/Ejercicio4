/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetosej4;

/**
 *
 * @author Win-5
 */
public class Equipo {
   private String nombre;
   private int puntaje;
   private int golesAFavor;
   private int golesEnContra;
   
   public Equipo(String nombre){
       this.nombre = nombre;
       puntaje =0;
       golesAFavor=0;
       golesEnContra=0;       
   }
  
   public Equipo(String nombre, int puntaje, int golesAFavor, int golesEnContra){
       this.nombre = nombre;
       this.puntaje = puntaje;
       this.golesAFavor= golesAFavor;
       this.golesEnContra= golesEnContra;     
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }
   
    public void sumarPuntaje (int puntajeAdicional){
        puntaje = puntaje + puntajeAdicional;
    }
    
    public void sumarGolesAFavor (int golesAFavorAdicional){
        golesAFavor = golesAFavor + golesAFavorAdicional;
    }
    
    public void sumarGolesEnContra (int golesEnContraAdicional){
        golesEnContra = golesEnContra + golesEnContraAdicional;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
