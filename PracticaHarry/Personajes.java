package PracticaHarry;

public class Personajes {
    private int id;
    private String name;
    private String genero;
    private String casa;
    private String boggert;
    private String patronus;

    public Personajes( int id, String name, String genero, String casa, String boggert, String patronus){
        this.id = id;
        this.name = name;
        this.genero = genero;
        this.casa = casa;
        this.boggert = boggert;
        this.patronus = patronus;
    }

    public Personajes() {

    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getGenero(){ return genero;  }
    public String getCasa(){  return casa;  }
    public String getBoggert(){  return boggert;   }
    public String getPatronus(){  return patronus;  }

    public boolean setId(int id){
        if (id > 0) {
            this.id=id;
            return true;
        } else
            return false;
    }

    public boolean setName(String name){
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else
            return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }
    public boolean setCasa(String casa){
        if (!casa.isEmpty()) {
            this.casa = casa;
            return true;
        } else
            return false;
    }
    public boolean setBoggert(String boggert){
        if (!boggert.isEmpty()) {
            this.boggert = boggert;
            return true;
        } else
            return false;
    }
    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }
    public String printState(){
        return
                "id; "+id+"\n"+
                "name: "+name+"\n"+
                        "genero"+genero+"\n"+
    "casa: "+casa+"\n"+
    "Boggert: "+boggert+"\n"+
    "patronus"+patronus;
    }

}

