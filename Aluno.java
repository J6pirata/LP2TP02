
import java.util.UUID;

public class Aluno {

     private String nome;
     private int idade; 
     private String endereco;
    private UUID uuid;
   
      
    public Aluno(String nome, int idade, String endereco, UUID uuid)
    {
           this.nome = nome;
           this.idade = idade;
           this.endereco = endereco;
           this.uuid = uuid;
    }


    public String getNome( )
    {
        return nome;
    }
    public void setNome(String nome)
    {
         this.nome = nome;
    }

    public int getIdade( )
    {
        return idade;
    }

    public void setIdade(int idade)
    {
       this.idade = idade;
    }

    public void setEndereco(String endereco)
    { 
          this.endereco = endereco;
             
    }

     public void setUUID(UUID uuid)
    {
           this.uuid = uuid;
    }
}
