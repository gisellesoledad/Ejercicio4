/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/** 4) Dados 2 archivos 1 con los nombres de equipo, y otro con los resultados de partidos de estos equipos 
utilizar los mismos para calcular el puntaje final de cada equipo 
y los goles a favor y en contra ordenarlos de acuerdo al puntaje. 
Deberá imprimir por pantalla el nombre del equipo y la cantidad de puntos. 
Para este enunciado pedimos que se utilicen clases para representar estas entidades (Equipo y Partido), 
los cuales deberán generarse con sus respectivos atributos y métodos. 
Recuerde luego utilizar e instanciar cada clase con los datos para validar
Pueden guiarse del siguiente diagrama de clases:
*/

package com.mycompany.objetosej4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Win-5
 */
public class ObjetosEj4 {

    public static void main(String[] args) throws IOException{
        Path pathEquipo = Paths.get("E:\\programando4\\objetosejercicio4\\equipos.csv");
        Path pathPartido = Paths.get("E:\\programando4\\objetosejercicio4\\partidos.csv");
        List <Equipo> equipos = new ArrayList <Equipo> ();
        List <Partido> partidos = new ArrayList <Partido> ();
        
        for (String nombreEquipo :Files.readAllLines(pathEquipo)){
            Equipo e = new Equipo(nombreEquipo);
            equipos.add(e);
        }
        for (String lineaPartido :Files.readAllLines(pathPartido)){
            String[] lineaDividida=lineaPartido.split(";");
            String nombreEquipo1 = lineaDividida[0]; // separando los datos
          //  int golesEquipo1 = Integer.valueOf(lineaDividida[1]);
            System.out.println(lineaDividida[0]);
            
            
        }
      
    
    
 
     
           
           
   
        
    }
    
    
    
}
