package Practicamona;

public class Octocat {
    public static void main(String[] args){
        HerenciaMona version[] = new HerenciaMona[5];

        version[0] = new Mona("Manufacturetocat", "Black", "Large slanted eyes", 150);
        version[1] = new Mona2("Saint Nictocat", "Red", "White skin", "Red books");
        version[2] = new Mona3("Justicecat", "Grey", "Bandaged", "Balance");
        version[3] = new Mona4("Grinchtocat", "Green", "Evil", "Santa hat");
        version[4] = new Mona5("Kimonotocat", "Black", "White", "Kimono");


        for (HerenciaMona herenciaMona: version) {
            System.out.println(herenciaMona.mostrarDatos());
            System.out.println("");
        }

        }
    }