import model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        Usuario usuario = null;


        while(opcao != 4){

            System.out.println("===== JOBMATCH AI ======");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Mostrar perfil");
            System.out.println("3 - Atualizar nível");
            System.out.println("4 - Sair");
            System.out.println("=========================");
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1) {

                usuario = new Usuario();

                System.out.print("Digite seu nome: ");
                usuario.setNome(leitura.nextLine());

                System.out.print("Digite sua cidade: ");
                usuario.setCidade(leitura.nextLine());

                System.out.print("Digite seu nível: ");
                usuario.setNivel(leitura.nextLine());

                System.out.println("Digite 3 tecnologias:");

                for (int i = 0; i < 3; i++) {
                    System.out.print("Tecnologia " + (i + 1) + ": ");
                    usuario.getTecnologias().add(leitura.nextLine());
                }





                System.out.println("Usuário cadastrado com sucesso!");




            }else if(opcao == 2){
                if (usuario != null){
                    System.out.println("\n=== PERFIL DO USUÁRIO ===");
                    System.out.println("Nome: " + usuario.getNome());
                    System.out.println("Cidade: " + usuario.getCidade());
                    System.out.println("Nível: " + usuario.getNivel());
                    System.out.println("Tecnologias" + usuario.getTecnologias());
                    System.out.println("-------------------------------");
                }else {
                    System.out.println("Usuario nao encontrado"
                    );
                }


            } else if (opcao == 3){
               if(usuario != null){
                   System.out.println("Digite novo nível:");
                   usuario.setNivel(leitura.next());
               }else {
                   System.out.println("Usuário não cadastrado");
               }

            } else if(opcao == 4){
                System.out.println("Sistema encerrado");
            }else {
                System.out.println("opção invalida");
            }


        }

        leitura.close();

    }
}