package Practicamona;

public class Mona extends HerenciaMona {
    private int codigoMona;

    public Mona (String name, String body, String face, int codigoMona){
        super(name, body, face);
        this.codigoMona = codigoMona;

       }
   public int getCodigoMona() {
        return codigoMona;
    }

    @Override
    public String mostrarDatos(){

    return "Name: "+getName()+
                "\nBody: "+getBody()+
                "\nFace: "+getFace()+
                "\nCodigo Mona: "+codigoMona;
                    }

}


