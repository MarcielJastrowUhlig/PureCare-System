package tmp;

import java.util.Scanner;

import Classes.Usuario;

public class AppPureCare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o número máximo de usuarios:");
        int maxUsuarios = scan.nextInt();
        VetUsuario vetUsuario = new VetUsuario(maxUsuarios);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Registrar usuario");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Atualizar perfil");
            System.out.println("4 - Imprimir usuarios registrados"); // para visualizacao do vetor
            System.out.println("0 - Sair");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuario: ");
                    String nomeUsuario = scan.nextLine();
                    System.out.print("E-mail do usuario: ");
                    String emailUsuario = scan.nextLine();
                    System.out.print("Senha do usuario: ");
                    String senhaUsuario = scan.nextLine();
                    Usuario usuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario);
                    int resultado = vetUsuario.insere(usuario);
                    if (resultado == 0) {
                        System.out.println("Usuario cadastrado com sucesso!");
                    } else if (resultado == -1) {
                        System.out.println("Não é possível cadastrar mais vendedores, o vetor está cheio.");
                    } else if (resultado == -2) {
                        System.out.println("Este vendedor já foi cadastrado.");
                    }
                    break;
                case 2:
                    System.out.print("\nInsira o email: ");
                    String aux = scan.nextLine();
                    for (int i = 0; i < vetUsuario.getnElem(); i++) {
                        if (vetUsuario.getUsuario(i).getEmailUsuario().equalsIgnoreCase(aux)) {
                            System.out.print("nInsira a senha: ");
                            aux = scan.nextLine();
                            if (vetUsuario.getUsuario(i).getSenhaUsuario().equalsIgnoreCase(aux)) {
                                System.out.println("Login feito com sucesso!");
                            } else {
                                System.out.println("Senha errada!");
                            }
                        }

                    }
                    break;
                case 3:
                    System.out.println("\nInsira seu email atual:");
                    System.out.println("\nInsira a nova senha:");
                    break;
                case 4:
                    for (int i = 0; i < vetUsuario.getnElem(); i++) {
                        System.out.println(vetUsuario.getUsuario(i));
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o aplicativo.");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }

}