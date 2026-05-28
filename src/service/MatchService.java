package service;

import model.Usuario;
import model.Vaga;

import java.util.List;

public class MatchService {

    public void buscarMatches(Usuario usuario, List<Vaga> listaDeVagas) {

        if (usuario == null) {

            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.println("\n=== VAGAS COMPATÍVEIS ===");

        boolean algumMatchEncontrado = false;

        for (Vaga vaga : listaDeVagas) {

            // valida nível primeiro
            if (!vaga.getNivel().equalsIgnoreCase(usuario.getNivel())) {
                continue;
            }

            boolean temTodosOsRequisitos = true;

            // percorre requisitos da vaga
            for (String requisito : vaga.getRequisitos()) {

                // usuário não possui requisito
                if (!usuario.getTecnologias().contains(requisito)) {

                    temTodosOsRequisitos = false;
                    break;
                }
            }

            // se passou em tudo
            if (temTodosOsRequisitos) {

                System.out.println("MATCH ENCONTRADO!");
                System.out.println("Empresa: " + vaga.getEmpresa());
                System.out.println("Cargo: " + vaga.getCargo());
                System.out.println("Nível: " + vaga.getNivel());
                System.out.println("---------------------------");

                algumMatchEncontrado = true;
            }
        }

        if (!algumMatchEncontrado) {

            System.out.println("Nenhuma vaga compatível encontrada.");
        }
    }
}