    package service;

    import model.Vaga;

    import java.util.ArrayList;
    import java.util.List;

    public class VagasService {
        private List<Vaga> listaDeVagas = new ArrayList<>();

        public VagasService() {

            listaDeVagas.add(
                    new Vaga(
                            "Itaú",
                            "Backend Java Jr",
                            "Junior",
                            List.of("Java", "SQL", "Git")
                    )
            );

            listaDeVagas.add(
                    new Vaga(
                            "Google",
                            "Frontend React Jr",
                            "Junior",
                            List.of("React", "JavaScript", "CSS")
                    )
            );
        }

        public void mostrarVagas() {

            for (Vaga vaga : listaDeVagas) {

                System.out.println("Empresa: " + vaga.getEmpresa());
                System.out.println("Cargo: " + vaga.getCargo());
                System.out.println("Nível: " + vaga.getNivel());
                System.out.println("Requisitos: " + vaga.getRequisitos());
                System.out.println("---------------------------");
            }
        }




    }
