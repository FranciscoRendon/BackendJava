package Practicamona;

    public class Mona3 extends HerenciaMona {
    private String props;

    public Mona3 (String name, String body, String face, String props){
        super(name, body, face);
        this.props = props;

    }
    public String getProps() {
        return props;
    }

    @Override
    public String mostrarDatos(){
        return "Name: "+getName()+
                "\nBody: "+getBody()+
                "\nFace: "+getFace()+
                "\nProps: "+props;
    }

}
