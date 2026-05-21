package service;

import model.Usuario;

import java.util.Scanner;

public class UsuarioService {

    private Usuario usuario;

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

        this.usuario = usuario;

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void mostrarPerfil() {

        if (usuario == null) {

            System.out.println("Usuário não encontrado");

            return;
        }

        System.out.println("\n=== PERFIL DO USUÁRIO ===");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Cidade: " + usuario.getCidade());
        System.out.println("Nível: " + usuario.getNivel());
        System.out.println("Tecnologias: " + usuario.getTecnologias());
        System.out.println("--------------------------");
    }

    public void atualizarNivel(Scanner leitura) {

        if (usuario == null) {

            System.out.println("Usuário não cadastrado");

            return;
        }

        System.out.print("Digite novo nível: ");

        usuario.setNivel(leitura.nextLine());

        System.out.println("Nível atualizado com sucesso!");
    }
}