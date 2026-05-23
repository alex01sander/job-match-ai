import service.UsuarioService;
import service.VagasService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        UsuarioService usuarioService = new UsuarioService();
        VagasService vagasService = new VagasService();

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("===== JOBMATCH AI ======");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Mostrar perfil");
            System.out.println("3 - Atualizar nível");
            System.out.println("4 - Mostrar Vagas");
            System.out.println("5 - Sair");
            System.out.println("=========================");

            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {

                case 1:

                    usuarioService.cadastrarUsuario(
                            usuarioService.criarUsuario(leitura)
                    );

                    break;

                case 2:

                    usuarioService.mostrarPerfil();

                    break;

                case 3:

                    usuarioService.atualizarNivel(leitura);

                    break;

                case 4:

                    vagasService.mostrarVagas();

                    break;

                case 5:

                    System.out.println("Sistema encerrado");

                    break;

                default:

                    System.out.println("Opção inválida");
            }
        }

        leitura.close();
    }
}