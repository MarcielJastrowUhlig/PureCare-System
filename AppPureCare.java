import java.util.Scanner;

public class AppPureCare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o número máximo de usuarios:");
		int maxUsuarios = scan.nextInt();
		VetUsuario vetVendedor = new VetUsuario(maxUsuarios);

		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar vendedor");
			System.out.println("2 - Imprimir folha de pagamento");
			System.out.println("3 - Imprimir média de venda por categoria");
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
				int resultado = vetVendedor.insere(usuario);
				if (resultado == 0) {
					System.out.println("Vendedor cadastrado com sucesso!");
				} else if (resultado == -1) {
					System.out.println("Não é possível cadastrar mais vendedores, o vetor está cheio.");
				} else if (resultado == -2) {
					System.out.println("Este vendedor já foi cadastrado.");
				}
				break;
			case 2:
				System.out.println("\nFolha de pagamento:");
				for (int i = 0; i < vetVendedor.getnElem(); i++) {
					System.out.println(vetVendedor.getUsuario(i));
				}
				break;
			case 3:
				System.out.println("Média de vendas por categoria:");
				for (char categoria = 'A'; categoria <= 'C'; categoria++) {
					
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