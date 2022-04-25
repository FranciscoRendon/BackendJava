package PracticaHarry;

public class Dumbledore {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Personajes quintoDumbledore = new Personajes();
        quintoDumbledore.setName("Albus Dumbledore");
        quintoDumbledore.setCasa("Gryffindor");
        quintoDumbledore.setGenero("Masculino");
        quintoDumbledore.setBoggert("Su hermmana Ariadna muerta");
        quintoDumbledore.setPatronus("Fenix");
        String msg = "Soy un personaje de la saga de Harry Potter con estas características";
        msg += "\nName: "+quintoDumbledore.getName();
        msg += "\nCasa: "+quintoDumbledore.getCasa();
        msg += "\nGenero: "+quintoDumbledore.getGenero();
        msg += "\nBoggert: "+quintoDumbledore.getBoggert();
        msg += "\nPatronus: "+quintoDumbledore.getPatronus();

        System.out.print(msg);

    }
}
