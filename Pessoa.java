/**
 *
 * @author Yasmin Christ 05/09/2023
 */
public class Pessoa {
    
    private String nome;
    private int anoNasc;
    private double altura;
    private int idade;
    
    public void setNome(String n){
       nome =n;
    }
    public String getNome(){
        return nome; 
    }
    
    public void setAno(int a){
        anoNasc = a;
    }
    public int getAno(){
        return anoNasc;
    }
    
    public void setAltura(double al){
        altura = al;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setIdade(int anoNasc){
        idade = 2023 - anoNasc;
    }
    public int getIdade(){
        return idade;
    }
}
