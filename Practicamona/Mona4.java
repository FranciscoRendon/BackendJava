package Practicamona;

public class Mona4 extends HerenciaMona{
    private String accesories;

    public Mona4 (String name, String body, String face, String accesories){
        super(name, body, face);
        this.accesories = accesories;

    }
    public String getAccesories() {
        return accesories;
    }

    @Override
    public String mostrarDatos(){

        return "Name: "+getName()+
                "\nBody: "+getBody()+
                "\nFace: "+getFace()+
                "\nAccesories: "+accesories;
    }

}
