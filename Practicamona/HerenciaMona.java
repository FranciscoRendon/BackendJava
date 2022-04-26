package Practicamona;

public class HerenciaMona {
    private String name;
    private String body;
    private String face;

    public HerenciaMona (String name, String body, String face){
     this.name = name;
     this.body = body;
     this.face = face;
      }

    public String getName(){  return name;  }
    public String getBody(){  return body;  }
    public String getFace(){  return face;  }

    public String mostrarDatos(){  return "Name: "+name+"Body: "+body+"Face: "+face;
    }

}


