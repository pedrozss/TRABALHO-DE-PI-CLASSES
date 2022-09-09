package pedropi;

public class Pedro {
     public static void main(String[] args) {
        pinguim pew = new pinguim();
            
       pew.setNome("Pew");
       pew.setCor("preto e branco");
       pew.setEspecie("aves");
       pew.setSexo("macho");
       
        
        System.out.println("O pinguim de nome " + pew.getNome() + 
                           ", tem a cor " + pew.getCor() + 
                           ", é de especie " + pew.getEspecie() + " e é de sexo " + pew.getSexo());
       
        System.out.println("O pinguim " + pew.getNome() +
                            ", pode fazer: ");
        
        pew.andar();
        pew.reagrupar();
        pew.nadar();
     }
}
