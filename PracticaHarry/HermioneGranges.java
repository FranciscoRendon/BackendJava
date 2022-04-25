package PracticaHarry;

public class HermioneGranges {
    public static void main(String[] args){
          def();
    }

    public static void def(){
        Personajes primeroHermione = new Personajes();
        primeroHermione.setName("Hermione Granges");
        primeroHermione.setCasa("Gryffindor");
        primeroHermione.setGenero("Femenina");
        primeroHermione.setBoggert("Ver a Harry y Ron Muertos");
        primeroHermione.setPatronus("Nutria");
        String msg = "Soy un personaje de la saga con estas caracteristicas";
        msg += "\nName: "+primeroHermione.getName();
        msg += "\nCasa: "+primeroHermione.getCasa();
        msg += "\nGenero: "+primeroHermione.getGenero();
        msg += "\nBoggert: "+primeroHermione.getBoggert();
        msg += "\nPatronus: "+primeroHermione.getPatronus();

        System.out.print(msg);

    }

}
