
import java.awt.Container;

public class TelaPrincipal {
    
  public static void main(String[] args){

    Container c = new Container();
    Tela view1 = new Tela( "TP02 - LP2", 400,180,0,0);
    Tela2 view2 = new Tela2(" ",0,0,0,0);
    Aluno aluno = new Aluno(null, 0, null, null);

    
     
    c.add(view1);
    c.add(view2);

    c.setVisible(true);
  }
    
}
