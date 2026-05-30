package service;

import model.Usuario;
import model.Vaga;

import java.util.List;
import java.util.stream.Collectors;

public class MatchService {

    public List<Vaga> buscarMatches(Usuario usuario, List<Vaga> vagas) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }

        return vagas.stream()
                .filter(vaga -> nivelCompativel(vaga, usuario))
                .filter(vaga -> requisitosAtendidos(vaga, usuario))
                .collect(Collectors.toList());
    }

    private boolean nivelCompativel(Vaga vaga, Usuario usuario) {
        return vaga.getNivel().equalsIgnoreCase(usuario.getNivel());
    }

    private boolean requisitosAtendidos(Vaga vaga, Usuario usuario) {
        return usuario.getTecnologias().containsAll(vaga.getRequisitos());
    }
}