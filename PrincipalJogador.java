
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin Kamilly Christ 05/09/2023 - FATEC Ourinhos
 */
public class PrincipalJogador {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        String n = JOptionPane.showInputDialog("Nome do jogador: ");
        String p = JOptionPane.showInputDialog("Posição: ");
        String na = JOptionPane.showInputDialog("Nacionalidade: ");
        double pe= Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        
        j.setNome(n);
        j.setPosicao(p);
        j.setNacionalidade(na);
        j.setPeso(pe);
        j.setAltura(a);
        
        JOptionPane.showMessageDialog(null,"Nome: " + j.getNome() + 
                "\nPosição: " + j.getPosicao() + "\nNacionalidade: " + 
                j.getNacionalidade() + "\nPeso: " + j.getPeso() + "kg\nAltura: " + j.getAltura() + "m");        
    }
}
