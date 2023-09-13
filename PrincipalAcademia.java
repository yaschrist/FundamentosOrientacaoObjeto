import javax.swing.JOptionPane;
/**
 *
 * @author Yasmin Kamilly Christ 05/09/2023
 */
public class PrincipalAcademia {
    public static void main(String[] args) {
        Academia a = new Academia();
        String n = JOptionPane.showInputDialog("Nome do aluno: ");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double al= Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double p= Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
             
        a.setNome(n);
        a.setIdade(i);
        a.setPeso(p);
        a.setAltura(al);
        
        JOptionPane.showMessageDialog(null,"Bem Vindo/a a Academia, "+ a.getNome() + "!");
        JOptionPane.showMessageDialog(null,"Idade:" + a.getIdade() + " anos\n" + "Altura: "+ a.getAltura()+"m\n" + "Peso:" + a.getPeso() + "kg");
    }
}

