import model.Usuario;
import model.Vaga;
import service.MatchService;
import service.UsuarioService;
import service.VagasService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        UsuarioService usuarioService = new UsuarioService();
        VagasService vagasService = new VagasService();
        MatchService matchService = new MatchService();
        int opcao = 0;

        while (opcao != 7) {

            System.out.println("===== JOBMATCH AI ======");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Mostrar perfil");
            System.out.println("3 - Atualizar nível");
            System.out.println("4 - Mostrar Vagas");
            System.out.println("5 - Vagas Compativel");
            System.out.println("6 - Remover perfil");
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

                    usuarioService.mostrarPerfil(leitura);

                    break;

                case 3:

                    usuarioService.atualizarNivel(leitura);

                    break;

                case 4:

                    vagasService.mostrarVagas();

                    break;

                case 5:
                    Usuario usuario = usuarioService.selecionarUsuario(leitura);

                    if (usuario != null) {
                        List<Vaga> matches = matchService.buscarMatches(
                                usuario,
                                vagasService.getListaDeVagas()
                        );

                        if (matches.isEmpty()) {
                            System.out.println("Nenhuma vaga compatível encontrada.");
                        } else {
                            System.out.println("\n=== VAGAS COMPATÍVEIS ===");
                            matches.forEach(vaga -> {
                                System.out.println("MATCH ENCONTRADO!");
                                System.out.println("Empresa: " + vaga.getEmpresa());
                                System.out.println("Cargo: " + vaga.getCargo());
                                System.out.println("Nível: " + vaga.getNivel());
                                System.out.println("---------------------------");
                            });
                        }
                    }

                    break;


                case 6:

                    usuarioService.removerUsuario(leitura);

                    break;

                case 7:

                    System.out.println("Sistema encerrado");

                    break;

                default:

                    System.out.println("Opção inválida");
            }
        }

        leitura.close();
    }
}