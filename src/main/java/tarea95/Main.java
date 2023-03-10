package tarea95;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona trabajador1 = new Persona("Paco", "Fernandez", "Perales", LocalDate.of(1990,10,10),"Masculino", 10);

        Persona trabajador2 = new Persona("Pepe", "Fernandez", "Perales", LocalDate.of(1992,11,11),"Masculino", 11);

        PuestoDeTrabajo programador = new PuestoDeTrabajo("Programador",LocalDate.of(2000,1,1),LocalDate.of(2001,01,01),1010,trabajador1,trabajador2,"Informatica");
        PuestoDeTrabajo TecnicoSistemas = new PuestoDeTrabajo("Tecnico",LocalDate.of(2001,1,2),LocalDate.of(2002,01,02),1010,trabajador1,trabajador2,"Informatica");


        PuestoDeTrabajo jefeProg= new PuestoDeTrabajo("JefeProgramador", LocalDate.of(1980,1,1),LocalDate.of(2015,1,1),2000,trabajador2,new Persona("Patricio","Fernandez","Ramirez",LocalDate.of(1970,1,1),"Masculino",01),"Jefazos");

    }
}
