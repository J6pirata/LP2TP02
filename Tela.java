
import java.awt.*;
import java.lang.String;

 public class Tela extends Frame {

    
    private Label l1 = new Label("nome");
    private Label l2 = new Label("Endereço");
    private Label l3 = new Label(" idade ");
    private TextField f1 = new TextField();
    private TextField f2 = new TextField();
    private TextField f3 = new TextField();


    public Tela(String titulo,int largura, int altura, int colinic, int
                lininic){
            super(titulo);
            setSize(largura,altura);
            setLocation(colinic, lininic);
            setLayout(new GridLayout(3,2));
          add(l1, new FlowLayout(FlowLayout.LEFT ));
          add(l2, new FlowLayout(FlowLayout.LEFT ));
          add(l3, new FlowLayout(FlowLayout.LEFT ));
          add(f1, new FlowLayout(FlowLayout.RIGHT));
          add(f2, new FlowLayout(FlowLayout.RIGHT));
          add(f3, new FlowLayout(FlowLayout.RIGHT));
    }

    /*ublic void AddComponets(Tela tela){
    Container c = new Container();
      
     c.add(l1, new FlowLayout(FlowLayout.LEFT ,0,60));
     c.add(l2, new FlowLayout(FlowLayout.LEFT,10,60));
     c.add(l3, new FlowLayout(FlowLayout.LEFT,10,60));
     c.add(b1, new FlowLayout(FlowLayout.CENTER,90,0));
     c.add(b2, new FlowLayout(FlowLayout.CENTER,90,0));
     c.add(b3, new FlowLayout(FlowLayout.CENTER,90,0));
     c.add(b4, new FlowLayout(FlowLayout.CENTER,90,0));
     c.add(f1, new FlowLayout(FlowLayout.RIGHT));
     c.add(f2, new FlowLayout(FlowLayout.RIGHT));
     c.add(f3, new FlowLayout(FlowLayout.RIGHT));
    }/* */
  }