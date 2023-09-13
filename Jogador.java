/**
 *
 * @author Yasmin Kamilly Christ 05/09/2023
 */
public class Jogador {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;
    
    public void setNome(String n){
       nome =n;
    }
    public String getNome(){
        return nome; 
    }
    
    public void setPosicao(String p){
        posicao = p;
    }
    public String getPosicao(){
        return posicao;
    }
    
    public void setNacionalidade(String na){
        nacionalidade = na;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double pe){
        peso = pe;
    }
    public double getPeso(){
        return peso;
    }
    
}
