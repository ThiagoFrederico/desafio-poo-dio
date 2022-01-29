import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thiago:" + devThiago.getConteudosConcluidos());
        System.out.println("XP:" + devThiago.calcularTotalXp());

        System.out.println("----------");

        Dev devLivia = new Dev();
        devLivia.setNome("Lívia");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lívia:" + devLivia.getConteudosInscritos());
        devLivia.progredir();
        devLivia.progredir();
        devLivia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lívia:" + devLivia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lívia:" + devLivia.getConteudosConcluidos());
        System.out.println("XP:" + devLivia.calcularTotalXp());
    }
}
