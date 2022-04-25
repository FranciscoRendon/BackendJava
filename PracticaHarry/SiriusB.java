package PracticaHarry;

public class SiriusB {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Personajes tecerSirius = new Personajes();
        tecerSirius.setName("Sirius Black");
        tecerSirius.setCasa("Gryffindor");
        tecerSirius.setGenero("Masculino");
        tecerSirius.setBoggert("Él en Askaban");
        tecerSirius.setPatronus("Perro");
        String msg = "Soy un personaje de la saga de Harry Potter con estas características";
        msg += "\nName: "+tecerSirius.getName();
        msg += "\nCasa: "+tecerSirius.getCasa();
        msg += "\nGenero: "+tecerSirius.getGenero();
        msg += "\nBoggert: "+tecerSirius.getBoggert();
        msg += "\nPatronus: "+tecerSirius.getPatronus();

        System.out.print(msg);

    }
}
