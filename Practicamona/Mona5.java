package Practicamona;

public class Mona5 extends HerenciaMona{
    private String tops;

    public Mona5 (String name, String body, String face, String tops){
        super(name, body, face);
        this.tops = tops;

    }
    public String getTops() {
        return tops;
    }

    @Override
    public String mostrarDatos(){

        return "Name: "+getName()+
                "\nBody: "+getBody()+
                "\nFace: "+getFace()+
                "\nTops: "+tops;
    }

}
