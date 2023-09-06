
import java.awt.*;
import java.lang.String;
import java.awt.event.*;

public class Tela2 extends Frame implements ActionListener {
    private Button b1 = new Button("ok");
    private Button b2 = new Button("limpar ");
    private Button b3 = new Button("Mostra");
    private Button b4 = new Button("Sair");


    public Tela2(String titulo,int largura, int altura, int colinic, int
                 lininic){

         super(titulo);
         setSize(largura,altura);
         setLocation(colinic, lininic);
         setLayout(new GridLayout(1,0));

         b1.addActionListener(this);
         add(b1);
         b2.addActionListener(this);
         add(b2);
         b3.addActionListener(this);
         add(b3);
         b4.addActionListener(this);
        add(b4);

        public void actionPerformed(ActionEvent e) throw {
             
        }
    } 

}
