import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    if(confirmacaoSenha == this.senha){
        return true;
    }
    else {
        return false;
    }
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Bank {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite qual cofre gostaria de usar: ");
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
        int userPassword = scanner.nextInt();
        CofreDigital cd = new CofreDigital(userPassword);
        int userPasswordConfirm = scanner.nextInt();
        cd.imprimirInformacoes();
        if (cd.validarSenha(userPasswordConfirm) == true){
            System.out.println("Cofre aberto!");
        }
        else {
            System.out.println("Senha incorreta!");
        }
    }
    else if (tipoCofre.equalsIgnoreCase("fisico")) {
        CofreFisico cf = new CofreFisico();
        cf.imprimirInformacoes();
    }
  }
}