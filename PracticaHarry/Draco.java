package PracticaHarry;

public class Draco {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Personajes segundoDraco = new Personajes();
        segundoDraco.setName("Draco Malfoy");
        segundoDraco.setCasa("Slytherin");
        segundoDraco.setGenero("Masculino");
        segundoDraco.setBoggert("Su padre");
        segundoDraco.setPatronus("Dragon");
        String msg = "Soy un personaje de la saga de Harry Potter con estas características";
        msg += "\nName: "+segundoDraco.getName();
        msg += "\nCasa: "+segundoDraco.getCasa();
        msg += "\nGenero: "+segundoDraco.getGenero();
        msg += "\nBoggert: "+segundoDraco.getBoggert();
        msg += "\nPatronus: "+segundoDraco.getPatronus();

        System.out.print(msg);

    }

}
