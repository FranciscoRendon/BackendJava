import java.awt.*;

public class PersonFade extends FadeCasa implements FaAction {
    public PersonFade (int id, String name, String rol, String difficulty, String description){
        super(id, name, rol, difficulty, description);
    }
    @Override
    public void Acechadora(Screen s){
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Color.blue);
        s.showImage("Video1.gif");
        s.setBounds(200, 100,1100, 900);
    }
    @Override
    public void Capturar(Screen s){
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Color.blue);
        s.showImage("Video2.gif");
        s.setBounds(200, 100,1100, 900);
    }
    @Override
    public void Atormentar(Screen s){
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Color.blue);
        s.showImage("Video3.gif");
        s.setBounds(2000, 1000,1100, 900);
    }
    @Override
    public void Anochecer(Screen s){
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Color.blue);
        s.showImage("Video4.gif");
        s.setBounds(200, 100,1100, 900);
    }

}
