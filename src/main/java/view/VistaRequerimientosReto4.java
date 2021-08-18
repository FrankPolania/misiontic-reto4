package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderPorNombre;
import model.vo.LiderPorSalario;
//import model.vo.ProyectosPorTipo;
//import model.vo.LiderPorNombre;
import model.vo.ProyectosPorTipo;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    //// ****************REQUERIMIENTO 1 LIDERES POR SALARIO ******************
    public static void requerimiento1(){ //lider por salario
    System.out.println("*** Lideres por Salario ***");
        try{
        ArrayList<LiderPorSalario> RankingLideresPorSalario = controlador.consultarLideresPorSalario();
        for(LiderPorSalario liderporsalario : RankingLideresPorSalario){
            System.out.printf("El Lider %s %s con Id %d tiene un salario de  %d %n",
            liderporsalario.getNombre(),
            liderporsalario.getApellido(),
            liderporsalario.getIdLider(),
            liderporsalario.getSalario()
            );

        }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){   // Proyectos  por tipo  
        System.out.println("*** Proyectos por Tipo ***");
        try{
            ArrayList<ProyectosPorTipo> RankingProyectosPorTipo = controlador.consultarProyectosPorTipos();
            for(ProyectosPorTipo proyectosportipo : RankingProyectosPorTipo){
                System.out.printf("El proyecto con ID %d de la constructora: %s de la ciudad  %s, tiene un estrato asignado igual a %d %n",
                proyectosportipo.getIdProyecto(),
                proyectosportipo.getConstructora(),
                proyectosportipo.getciudad(),
                proyectosportipo.getEstrato()
            );

        }

        }catch(SQLException e){
            System.err.println(e);
        }
    }

    public static void requerimiento3(){ // Lider por nombre

        System.out.println("*** Lideres por Nombre ***");
        try{
            ArrayList<LiderPorNombre> RankingLiderPorNombres = controlador.consultarLideresPorNombres();
            for(LiderPorNombre liderespornombre : RankingLiderPorNombres){
                System.out.printf("El Lider con ID %d se llama: %s  %s %n",
                liderespornombre.getIdLider(),
                liderespornombre.getNombre(),
                liderespornombre.getApellido()
                
            );

        }
        }catch(SQLException e){
            System.err.println(e);
        }
    }

}
