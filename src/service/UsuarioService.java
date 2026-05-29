package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario criarUsuario(Scanner leitura) {

        Usuario usuario = new Usuario();

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

        return usuario;
    }

    public void cadastrarUsuario(Usuario usuario) {

        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {

            System.out.println("\n=== PERFIL DO USUÁRIO " + (i + 1) + " ===");
            System.out.println("Nome: " + usuarios.get(i).getNome());

            System.out.println("--------------------------");
        }
    }

    public void mostrarPerfil(Scanner leitura) {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }

        System.out.print("Escolha o número do usuário: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice < 1 || indice > usuarios.size()) {
            System.out.println("Usuário inválido!");
            return;
        }

        Usuario usuario = usuarios.get(indice - 1);

        System.out.printf("""
            
            === PERFIL DO USUÁRIO ===
            Nome: %s
            Cidade: %s
            Nível: %s
            Tecnologias: %s
            --------------------------
            """,
                usuario.getNome(),
                usuario.getCidade(),
                usuario.getNivel(),
                usuario.getTecnologias()
        );
    }

    public void atualizarNivel(Scanner leitura) {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
            return;
        }


        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }


        System.out.print("Escolha o número do usuário: ");
        int indice = leitura.nextInt();
        leitura.nextLine();


        if (indice < 1 || indice > usuarios.size()) {
            System.out.println("Usuário inválido!");
            return;
        }

        Usuario usuario = usuarios.get(indice - 1);


        System.out.print("Digite o novo nível: ");
        usuario.setNivel(leitura.nextLine());

        System.out.println("Nível atualizado com sucesso!");
    }

    public void removerUsuario(Scanner leitura) {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado");
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }

        System.out.print("Escolha o número do usuário: ");
        int indice = leitura.nextInt();
        leitura.nextLine();


        if (indice < 1 || indice > usuarios.size()) {
            System.out.println("Usuário inválido!");
            return;
        }


        usuarios.remove(indice - 1);

        System.out.println("Usuário removido com sucesso!");
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public Usuario selecionarUsuario(Scanner leitura) {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
            return null;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }

        System.out.print("Escolha o número do usuário: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice < 1 || indice > usuarios.size()) {
            System.out.println("Usuário inválido!");
            return null;
        }

        return usuarios.get(indice - 1);
    }
}