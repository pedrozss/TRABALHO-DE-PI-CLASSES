package pedropi;

public class Pedro {
     public static void main(String[] args) {
        pinguim pew = new pinguim();
            
       pew.setNome("Pew");
       pew.setCor("preto e branco");
       pew.setEspecie("ave");
        
        System.out.println("O pinguim com o nome " + pew.getNome() + 
                           ", tem a cor " + pew.getCor() + 
                           ", é da especie " + pew.getEspecie());
        
        System.out.println("O pinguim " + pew.getNome() +
                            ", pode fazer: ");
        
        pew.andar();
        pew.reagrupar();
        pew.nadar();
     }
}
