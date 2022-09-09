package pedropi;

public class pinguim { private String cor = "preta e branco";
    private String especie;
    private String pinguim;
    private String nome;
    private String sexo;
    
    
    public pinguim(String nomepinguim) {
       
       this.nome = nomepinguim;
    }
    
    public pinguim() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String get() {
        return pinguim;
    }

    public void setpinguim(String pinguim) {
        this.pinguim = pinguim;
    }
    
    public void andar() {
        System.out.println("andar");
    }
    
    public void reagrupar() {
        System.out.println("juntar se ao grupo");
    }
    
    public void nadar() {
        System.out.println("nadar");
    }
 
}
