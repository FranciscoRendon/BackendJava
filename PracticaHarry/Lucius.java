package PracticaHarry;

public class Lucius {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Personajes cuartoLucius = new Personajes();
        cuartoLucius.setName("Lucius Malfoy");
        cuartoLucius.setCasa("Slytherin");
        cuartoLucius.setGenero("Masculino");
        cuartoLucius.setBoggert("Draco muerto");
        cuartoLucius.setPatronus("Ninguno");
        String msg = "Soy un personaje de la saga de Harry Potter con estas características";
        msg += "\nName: "+cuartoLucius.getName();
        msg += "\nCasa: "+cuartoLucius.getCasa();
        msg += "\nGenero: "+cuartoLucius.getGenero();
        msg += "\nBoggert: "+cuartoLucius.getBoggert();
        msg += "\nPatronus: "+cuartoLucius.getPatronus();

        System.out.print(msg);

    }
}
