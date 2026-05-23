package model;

import java.util.List;

public class Vaga {
    private String empresa;
    private String cargo;
    private String nivel;
    private List<String> requisitos;

    public Vaga(String empresa, String cargo, String nivel, List<String> requisitos) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.nivel = nivel;
        this.requisitos = requisitos;
    }

    public String getEmpresa() {
        return empresa;
    }



    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }
}
