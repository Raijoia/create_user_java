import javax.swing.JOptionPane;

public class TestUser {
  public static void main(String[] args) {
    User userOne = new User(JOptionPane.showInputDialog("Qual o seu nome"), JOptionPane.showInputDialog("Qual o seu email"), JOptionPane.showInputDialog("Qual a sua idade"));

    JOptionPane.showMessageDialog(null, userOne.exibirName(), "Nome", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, userOne.exibirEmail(), "Email", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, userOne.exibirAge(), "Idade", JOptionPane.INFORMATION_MESSAGE);
  }
}
