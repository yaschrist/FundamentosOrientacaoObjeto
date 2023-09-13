
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin Christ 05/09/2023
 */
public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        String n = JOptionPane.showInputDialog("Nome: ");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
        double al= Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
             
        p.setNome(n);
        p.setAno(a);
        p.setAltura(al);
        p.setIdade(a);
        
        
        JOptionPane.showMessageDialog(null,"Olá, " + p.getNome() + " você tem " + p.getIdade() + " anos e " + p.getAltura() + "m.");
    }
}
