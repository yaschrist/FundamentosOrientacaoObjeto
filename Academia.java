/**
 *
 * @author Yasmin Christ 05/09/2023
 */
public class Academia {
    
    //atributos para um aluno de uma academia
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public void setNome(String n){
       nome =n;
    }
    public String getNome(){
        return nome; 
    } 
    
    public void setIdade(int i){
        idade = i;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setAltura(double al){
        altura = al;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    public double getPeso(){
        return peso;
    }
    
}
